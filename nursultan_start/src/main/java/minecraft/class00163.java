/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class04523;
import minecraft.class04540;
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
public class class00163
implements class08887 {
    private final class04540<class08887> N;
    private final class08388 y;

    public class00163(class04540<class08887> class045402) {
        this.N = class045402;
        class08887 class088872 = (class08887)((class04523)class045402.u().getFirst()).N();
        this.y = class088872.method_68511();
    }

    public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Predicate predicate) {
        ((class08887)this.N.y(class060692)).emitQuads(quadEmitter, class072952, class072092, class005002, class060692, predicate);
    }

    public void method_68513(class06069 class060692, List<class08877> list) {
        ((class08887)this.N.y(class060692)).method_68513(class060692, list);
    }

    public class08388 method_68511() {
        return this.y;
    }

    public class08388 particleSprite(class07295 class072952, class07209 class072092, class00500 class005002) {
        return ((class08887)((class04523)this.N.u().getFirst()).N()).particleSprite(class072952, class072092, class005002);
    }

    public @Nullable Object createGeometryKey(class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692) {
        return ((class08887)this.N.y(class060692)).createGeometryKey(class072952, class072092, class005002, class060692);
    }
}

