/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.mesh;

import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;

@Environment(value=EnvType.CLIENT)
public interface MeshView {
    public int size();

    public void forEach(Consumer<? super QuadView> var1);

    public void outputTo(QuadEmitter var1);
}

