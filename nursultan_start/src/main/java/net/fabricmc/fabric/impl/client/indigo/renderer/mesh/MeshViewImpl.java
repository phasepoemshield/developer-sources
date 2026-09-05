/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.EncodingFormat;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl;

@Environment(value=EnvType.CLIENT)
public class MeshViewImpl
implements MeshView {
    private static final ThreadLocal<ObjectArrayList<QuadViewImpl>> CURSOR_POOLS = ThreadLocal.withInitial(ObjectArrayList::new);
    int[] data;
    int limit;

    MeshViewImpl() {
    }

    public int size() {
        return this.limit / EncodingFormat.TOTAL_STRIDE;
    }

    <C extends QuadViewImpl> void forEach(Consumer<? super C> consumer, C c) {
        int n = this.limit;
        c.data = this.data;
        for (int i = 0; i < n; i += EncodingFormat.TOTAL_STRIDE) {
            c.baseIndex = i;
            c.load();
            consumer.accept(c);
        }
        c.data = null;
    }

    public void forEach(Consumer<? super QuadView> consumer) {
        ObjectArrayList<QuadViewImpl> objectArrayList = CURSOR_POOLS.get();
        QuadViewImpl quadViewImpl = objectArrayList.isEmpty() ? new QuadViewImpl() : (QuadViewImpl)objectArrayList.pop();
        this.forEach(consumer, quadViewImpl);
        objectArrayList.push((Object)quadViewImpl);
    }

    public void outputTo(QuadEmitter quadEmitter) {
        MutableQuadViewImpl mutableQuadViewImpl = (MutableQuadViewImpl)quadEmitter;
        int[] nArray = this.data;
        int n = this.limit;
        for (int i = 0; i < n; i += EncodingFormat.TOTAL_STRIDE) {
            System.arraycopy(nArray, i, mutableQuadViewImpl.data, mutableQuadViewImpl.baseIndex, EncodingFormat.TOTAL_STRIDE);
            mutableQuadViewImpl.load();
            mutableQuadViewImpl.transformAndEmit();
        }
        mutableQuadViewImpl.clear();
    }
}

