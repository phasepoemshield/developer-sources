/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01488
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.itemgroup.v1.FabricCreativeInventoryScreen
 */
package net.fabricmc.fabric.impl.client.itemgroup;

import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01488;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.itemgroup.v1.FabricCreativeInventoryScreen;

@Environment(value=EnvType.CLIENT)
public enum FabricCreativeGuiComponents$Type {
    NEXT((class00392)class00392.y((String)">"), FabricCreativeInventoryScreen::switchToNextPage, class014882 -> class014882.getCurrentPage() + 1 < class014882.getPageCount()),
    PREVIOUS((class00392)class00392.y((String)"<"), FabricCreativeInventoryScreen::switchToPreviousPage, class014882 -> class014882.getCurrentPage() != 0);

    final class00392 text;
    final Consumer<class01488> clickConsumer;
    final Predicate<class01488> isEnabled;

    private FabricCreativeGuiComponents$Type(class00392 class003922, Consumer<class01488> consumer, Predicate<class01488> predicate) {
        this.text = class003922;
        this.clickConsumer = consumer;
        this.isEnabled = predicate;
    }
}

