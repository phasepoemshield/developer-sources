/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11658
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.mixin.renderer.client.block.model.MultiPartModelSharedBakedStateAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class11658;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08866;
import minecraft.class08875;
import minecraft.class08877;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.mixin.renderer.client.block.model.MultiPartModelSharedBakedStateAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class08885
implements class08887 {
    private final class08875 N;
    private final class00500 y;
    private @Nullable List<class08887> L;

    class08885(class08875 class088752, class00500 class005002) {
        this.N = class088752;
        this.y = class005002;
    }

    @Override
    public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Predicate predicate) {
        if (this.L == null) {
            this.L = this.N.N(this.y);
        }
        long l = class060692.B();
        for (class08887 class088872 : this.L) {
            class060692.N(l);
            class088872.emitQuads(quadEmitter, class072952, class072092, class005002, class060692, predicate);
        }
    }

    @Override
    public void method_68513(class06069 class060692, List<class08877> list) {
        if (this.L == null) {
            this.L = this.N.N(this.y);
        }
        long l = class060692.B();
        for (class08887 class088872 : this.L) {
            class060692.N(l);
            class088872.method_68513(class060692, list);
        }
    }

    @Override
    public class08388 method_68511() {
        return this.N.N;
    }

    public class08388 particleSprite(class07295 class072952, class07209 class072092, class00500 class005002) {
        return ((class08887)((class08866)((Object)((MultiPartModelSharedBakedStateAccessor)this.N).getSelectors().getFirst())).y()).particleSprite(class072952, class072092, class005002);
    }

    public @Nullable Object createGeometryKey(class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692) {
        if (this.L == null) {
            this.L = this.N.N(this.y);
        }
        int n = this.L.size();
        long l = class060692.B();
        if (n == 1) {
            class060692.N(l);
            return ((class08887)this.L.getFirst()).createGeometryKey(class072952, class072092, class005002, class060692);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(n);
        for (int i = 0; i < n; ++i) {
            class060692.N(l);
            Object object = this.L.get(i).createGeometryKey(class072952, class072092, class005002, class060692);
            if (object == null) {
                return null;
            }
            arrayList.add(object);
        }
        return new class11658(arrayList);
    }
}

