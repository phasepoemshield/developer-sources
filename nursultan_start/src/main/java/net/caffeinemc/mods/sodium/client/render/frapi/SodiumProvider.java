/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 */
package net.caffeinemc.mods.sodium.client.render.frapi;

import net.caffeinemc.mods.sodium.client.render.frapi.SodiumRenderer;
import net.caffeinemc.mods.sodium.client.services.FRAPIProvider;
import net.fabricmc.fabric.api.renderer.v1.Renderer;

public class SodiumProvider
implements FRAPIProvider {
    @Override
    public void register() {
        Renderer.register((Renderer)SodiumRenderer.INSTANCE);
    }
}

