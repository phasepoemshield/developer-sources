/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 */
package net.caffeinemc.mods.sodium.client.render.frapi.mesh;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.ExtendedQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.MutableQuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.QuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.model.EncodingFormat;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.QuadViewImpl;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;

public class MeshViewImpl
implements MeshView {
    private static final ThreadLocal<ObjectArrayList<QuadViewWrapper>> CURSOR_POOLS = ThreadLocal.withInitial(ObjectArrayList::new);
    int[] data;
    int limit;

    MeshViewImpl() {
    }

    public int size() {
        return this.limit / EncodingFormat.TOTAL_STRIDE;
    }

    void forEach(Consumer<? super QuadView> consumer, QuadView quadView) {
        QuadViewImpl quadViewImpl = ((QuadViewWrapper)quadView).getOriginal();
        int n = this.limit;
        quadViewImpl.data = this.data;
        for (int i = 0; i < n; i += EncodingFormat.TOTAL_STRIDE) {
            quadViewImpl.baseIndex = i;
            quadViewImpl.load();
            consumer.accept((QuadView)quadView);
        }
        quadViewImpl.data = null;
    }

    public void forEach(Consumer<? super QuadView> consumer) {
        ObjectArrayList<QuadViewWrapper> objectArrayList = CURSOR_POOLS.get();
        QuadViewWrapper quadViewWrapper = objectArrayList.isEmpty() ? ((ExtendedQuadViewImpl)new QuadViewImpl()).getWrapper() : (QuadViewWrapper)objectArrayList.pop();
        this.forEach(consumer, quadViewWrapper);
        objectArrayList.push((Object)quadViewWrapper);
    }

    public void outputTo(QuadEmitter quadEmitter) {
        MutableQuadViewWrapper mutableQuadViewWrapper = (MutableQuadViewWrapper)quadEmitter;
        QuadViewImpl quadViewImpl = mutableQuadViewWrapper.getOriginal();
        int[] nArray = this.data;
        int n = this.limit;
        for (int i = 0; i < n; i += EncodingFormat.TOTAL_STRIDE) {
            System.arraycopy(nArray, i, ((MutableQuadViewImpl)quadViewImpl).data, ((MutableQuadViewImpl)quadViewImpl).baseIndex, EncodingFormat.TOTAL_STRIDE);
            ((MutableQuadViewImpl)quadViewImpl).load();
            mutableQuadViewWrapper.transformAndEmit();
        }
        ((MutableQuadViewImpl)quadViewImpl).clear();
    }
}

