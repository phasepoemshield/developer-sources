/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class05932
 *  minecraft.class08760
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.rendering.world;

import minecraft.class01237;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class05932;
import minecraft.class08760;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class WorldRenderContextImpl
implements AbstractWorldRenderContext,
WorldRenderContext,
WorldTerrainRenderContext {
    private class03386 gameRenderer;
    private class03063 worldRenderer;
    private class05932 worldRenderState;
    private class08760 sectionRenderState;
    private class01237 commandQueue;
    private @Nullable class01421 matrixStack;
    private class01407 consumers;

    public void prepare(class03386 class033862, class03063 class030632, class05932 class059322, class08760 class087602, class01237 class012372, class01407 class014072) {
        this.gameRenderer = class033862;
        this.worldRenderer = class030632;
        this.worldRenderState = class059322;
        this.sectionRenderState = class087602;
        this.commandQueue = class012372;
        this.consumers = class014072;
        this.matrixStack = null;
    }

    public @Nullable class01421 matrices() {
        return this.matrixStack;
    }

    public class01407 consumers() {
        return this.consumers;
    }

    public class05932 worldState() {
        return this.worldRenderState;
    }

    public void setMatrixStack(@Nullable class01421 class014212) {
        this.matrixStack = class014212;
    }

    public class01237 commandQueue() {
        return this.commandQueue;
    }

    public class08760 sectionState() {
        return this.sectionRenderState;
    }

    public class03063 worldRenderer() {
        return this.worldRenderer;
    }

    public class03386 gameRenderer() {
        return this.gameRenderer;
    }
}

