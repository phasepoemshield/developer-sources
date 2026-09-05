/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.screenhandler.v1;

public interface FabricScreenHandlerFactory {
    default public boolean shouldCloseCurrentScreen() {
        return true;
    }
}

