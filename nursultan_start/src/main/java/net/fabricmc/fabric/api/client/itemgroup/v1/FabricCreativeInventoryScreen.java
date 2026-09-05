/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06911
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.itemgroup.v1;

import java.util.List;
import minecraft.class06911;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricCreativeInventoryScreen {
    default public boolean switchToNextPage() {
        return this.switchToPage(this.getCurrentPage() + 1);
    }

    default public int getPageCount() {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public boolean hasAdditionalPages() {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public boolean switchToPage(int n) {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public int getCurrentPage() {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public class06911 getSelectedItemGroup() {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public boolean switchToPreviousPage() {
        return this.switchToPage(this.getCurrentPage() - 1);
    }

    default public List<class06911> getItemGroupsOnPage(int n) {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public boolean setSelectedItemGroup(class06911 class069112) {
        throw new AssertionError((Object)"Implemented by mixin");
    }

    default public int getPage(class06911 class069112) {
        throw new AssertionError((Object)"Implemented by mixin");
    }
}

