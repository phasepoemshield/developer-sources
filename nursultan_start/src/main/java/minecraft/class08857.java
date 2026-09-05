/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08877;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class08857
implements class08887 {
    private final class08877 N;

    public class08857(class08877 class088772) {
        this.N = class088772;
    }

    @Override
    public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Predicate predicate) {
        this.N.emitQuads(quadEmitter, predicate);
    }

    @Override
    public void method_68513(class06069 class060692, List<class08877> list) {
        list.add(this.N);
    }

    @Override
    public class08388 method_68511() {
        return this.N.L();
    }

    public Object createGeometryKey(class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692) {
        return this;
    }
}

