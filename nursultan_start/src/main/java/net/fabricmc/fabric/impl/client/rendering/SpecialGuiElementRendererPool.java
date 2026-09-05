/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01422
 *  minecraft.class06202
 *  minecraft.class08647
 *  minecraft.class08672
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01237;
import minecraft.class01422;
import minecraft.class06202;
import minecraft.class08647;
import minecraft.class08672;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl;

@Environment(value=EnvType.CLIENT)
public final class SpecialGuiElementRendererPool<T extends class08647>
implements AutoCloseable {
    private int index = 0;
    private final List<class08672<T>> renderers = new ArrayList<class08672<T>>();

    public class08672<T> substitute(class08672<T> class086722, T t, class06202 class062022, class01422 class014222, class01237 class012372) {
        int n;
        if ((n = this.index++) == 0) {
            return class086722;
        }
        if (n <= this.renderers.size()) {
            return this.renderers.get(n - 1);
        }
        class08672<T> class086723 = SpecialGuiElementRegistryImpl.createNewRenderer(t, class062022, class014222, class012372);
        if (class086723 == null) {
            return class086722;
        }
        this.renderers.add(class086723);
        return class086723;
    }

    @Override
    public void close() {
        this.renderers.forEach(class08672::close);
        this.index = 0;
        this.renderers.clear();
    }

    public void newFrame() {
        this.index = 0;
    }

    public void cleanUpUnusedRenderers() {
        int n = Math.max(0, this.index - 1);
        if (n >= this.renderers.size()) {
            return;
        }
        for (int i = n; i < this.renderers.size(); ++i) {
            this.renderers.get(i).close();
        }
        this.renderers.subList(n, this.renderers.size()).clear();
    }
}

