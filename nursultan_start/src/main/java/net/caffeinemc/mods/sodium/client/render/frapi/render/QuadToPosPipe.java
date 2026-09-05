/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

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
            quadView.copyPos(i, this.vec);
            this.vec.x = MatrixHelper.transformPositionX((Matrix4fc)this.matrix, (float)this.vec.x, (float)this.vec.y, (float)this.vec.z);
            this.vec.y = MatrixHelper.transformPositionY((Matrix4fc)this.matrix, (float)this.vec.x, (float)this.vec.y, (float)this.vec.z);
            this.vec.z = MatrixHelper.transformPositionZ((Matrix4fc)this.matrix, (float)this.vec.x, (float)this.vec.y, (float)this.vec.z);
            this.posConsumer.accept((Vector3fc)this.vec);
        }
    }
}

