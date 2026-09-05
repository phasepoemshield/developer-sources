/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@Environment(value=EnvType.CLIENT)
public class QuadToPosPipe
implements Consumer<QuadView> {
    private final Consumer<Vector3fc> posConsumer;
    private final Vector3f vec;
    public Matrix4fc matrix;

    public QuadToPosPipe(Consumer<Vector3fc> consumer, Vector3f vector3f) {
        this.posConsumer = consumer;
        this.vec = vector3f;
    }

    @Override
    public void accept(QuadView quadView) {
        for (int i = 0; i < 4; ++i) {
            this.posConsumer.accept((Vector3fc)quadView.copyPos(i, this.vec).mulPosition(this.matrix));
        }
    }
}

