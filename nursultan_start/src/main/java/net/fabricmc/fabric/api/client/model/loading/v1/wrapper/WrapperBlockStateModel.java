/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.model.loading.v1.wrapper;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08877;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public abstract class WrapperBlockStateModel
implements class08887 {
    protected class08887 wrapped;

    protected WrapperBlockStateModel() {
    }

    protected WrapperBlockStateModel(class08887 class088872) {
        this.wrapped = class088872;
    }

    public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, Predicate<@Nullable class07211> predicate) {
        this.wrapped.emitQuads(quadEmitter, class072952, class072092, class005002, class060692, predicate);
    }

    public void method_68513(class06069 class060692, List<class08877> list) {
        this.wrapped.method_68513(class060692, list);
    }

    public List<class08877> method_68512(class06069 class060692) {
        return this.wrapped.method_68512(class060692);
    }

    public class08388 method_68511() {
        return this.wrapped.method_68511();
    }

    public class08388 particleSprite(class07295 class072952, class07209 class072092, class00500 class005002) {
        return this.wrapped.particleSprite(class072952, class072092, class005002);
    }

    public @Nullable Object createGeometryKey(class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692) {
        return this.wrapped.createGeometryKey(class072952, class072092, class005002, class060692);
    }
}

