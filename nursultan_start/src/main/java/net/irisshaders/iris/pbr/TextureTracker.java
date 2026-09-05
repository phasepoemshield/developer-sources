/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class08918
 *  net.irisshaders.iris.gl.state.StateUpdateNotifiers
 */
package net.irisshaders.iris.pbr;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import minecraft.class08918;
import net.irisshaders.iris.gl.state.StateUpdateNotifiers;

public class TextureTracker {
    public static final TextureTracker INSTANCE = new TextureTracker();
    private static Runnable bindTextureListener;
    private final Int2ObjectMap<class08918> textures = new Int2ObjectOpenHashMap();
    private boolean lockBindCallback;

    private TextureTracker() {
    }

    public class08918 getTexture(int n) {
        return (class08918)this.textures.get(n);
    }

    public void trackTexture(int n, class08918 class089182) {
        this.textures.put(n, (Object)class089182);
    }

    public void onDeleteTexture(int n) {
        this.textures.remove(n);
    }

    static {
        StateUpdateNotifiers.bindTextureNotifier = runnable -> {
            bindTextureListener = runnable;
        };
    }
}

