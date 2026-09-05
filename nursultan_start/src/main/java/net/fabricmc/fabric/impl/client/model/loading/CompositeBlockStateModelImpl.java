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
 *  net.fabricmc.fabric.api.client.model.loading.v1.CompositeBlockStateModel
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.model.loading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
import net.fabricmc.fabric.api.client.model.loading.v1.CompositeBlockStateModel;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl$1Key;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class CompositeBlockStateModelImpl
implements CompositeBlockStateModel {
    private final class08887[] models;
    private final List<class08887> modelsView;

    public CompositeBlockStateModelImpl(class08887[] class08887Array) {
        this.models = class08887Array;
        this.modelsView = Arrays.asList(class08887Array);
    }

    public static CompositeBlockStateModelImpl of(List<class08887> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Models list must not be empty");
        }
        for (class08887 class088872 : list) {
            Objects.requireNonNull(class088872, "Model cannot be null");
        }
        return new CompositeBlockStateModelImpl((class08887[])list.toArray(class08887[]::new));
    }

    public List<class08887> models() {
        return this.modelsView;
    }

    public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, Predicate<@Nullable class07211> predicate) {
        long l = class060692.B();
        for (class08887 class088872 : this.models) {
            class060692.N(l);
            class088872.emitQuads(quadEmitter, class072952, class072092, class005002, class060692, predicate);
        }
    }

    public void method_68513(class06069 class060692, List<class08877> list) {
        long l = class060692.B();
        for (class08887 class088872 : this.models) {
            class060692.N(l);
            class088872.method_68513(class060692, list);
        }
    }

    public class08388 method_68511() {
        return this.models[0].method_68511();
    }

    public class08388 particleSprite(class07295 class072952, class07209 class072092, class00500 class005002) {
        return this.models[0].particleSprite(class072952, class072092, class005002);
    }

    public @Nullable Object createGeometryKey(class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692) {
        int n = this.models.length;
        long l = class060692.B();
        if (n == 1) {
            class060692.N(l);
            return this.models[0].createGeometryKey(class072952, class072092, class005002, class060692);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(n);
        for (class08887 class088872 : this.models) {
            class060692.N(l);
            Object object = class088872.createGeometryKey(class072952, class072092, class005002, class060692);
            if (object == null) {
                return null;
            }
            arrayList.add(object);
        }
        return new CompositeBlockStateModelImpl$1Key(arrayList);
    }
}

