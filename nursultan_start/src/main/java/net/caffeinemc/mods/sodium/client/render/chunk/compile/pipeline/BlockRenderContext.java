/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class BlockRenderContext {
    private final LevelSlice slice;
    public final TranslucentGeometryCollector collector;
    private final class07218 pos = new class07218();
    private final Vector3f origin = new Vector3f();
    private class00500 state;
    private class08887 model;
    private long seed;

    public long seed() {
        return this.seed;
    }

    public class07209 pos() {
        return this.pos;
    }

    public TranslucentGeometryCollector collector() {
        return this.collector;
    }

    public Vector3fc origin() {
        return this.origin;
    }

    public class08887 model() {
        return this.model;
    }

    public BlockRenderContext(LevelSlice levelSlice, TranslucentGeometryCollector translucentGeometryCollector) {
        this.slice = levelSlice;
        this.collector = translucentGeometryCollector;
    }

    public void update(class07209 class072092, class07209 class072093, class00500 class005002, class08887 class088872, long l) {
        this.pos.N((class00753)class072092);
        this.origin.set((float)class072093.method_10263(), (float)class072093.method_10264(), (float)class072093.method_10260());
        this.state = class005002;
        this.model = class088872;
        this.seed = l;
    }

    public class00500 state() {
        return this.state;
    }

    public LevelSlice slice() {
        return this.slice;
    }
}

