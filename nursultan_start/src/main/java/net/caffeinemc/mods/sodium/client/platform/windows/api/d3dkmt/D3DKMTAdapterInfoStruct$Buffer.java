/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 *  org.lwjgl.system.StructBuffer
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMTAdapterInfoStruct;
import org.jspecify.annotations.NonNull;
import org.lwjgl.system.StructBuffer;

class D3DKMTAdapterInfoStruct$Buffer
extends StructBuffer<D3DKMTAdapterInfoStruct, D3DKMTAdapterInfoStruct$Buffer> {
    private static final D3DKMTAdapterInfoStruct ELEMENT_FACTORY = D3DKMTAdapterInfoStruct.create(-1L);

    protected D3DKMTAdapterInfoStruct$Buffer(long l, int n) {
        super(l, null, -1, 0, n, n);
    }

    protected @NonNull D3DKMTAdapterInfoStruct$Buffer self() {
        return this;
    }

    protected @NonNull D3DKMTAdapterInfoStruct getElementFactory() {
        return ELEMENT_FACTORY;
    }
}

