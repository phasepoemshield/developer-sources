/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.tessellation;

import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;

public interface GlTessellation {
    public void delete(CommandList var1);

    public void bind(CommandList var1);

    public void unbind(CommandList var1);

    public GlPrimitiveType getPrimitiveType();
}

