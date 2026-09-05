/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00183
 *  minecraft.class00500
 *  minecraft.class08388
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModels
 */
package minecraft;

import java.util.Map;
import minecraft.class00183;
import minecraft.class00500;
import minecraft.class08388;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModels;

@Environment(value=EnvType.CLIENT)
public class class03770
implements FabricBlockModels {
    private Map<class00500, class08887> N = Map.of();
    private final class00183 y;

    public class03770(class00183 class001832) {
        this.y = class001832;
    }

    public class08887 y(class00500 class005002) {
        class08887 class088872 = this.N.get(class005002);
        if (class088872 == null) {
            class088872 = this.y.N();
        }
        return class088872;
    }

    public class08388 N(class00500 class005002) {
        return this.y(class005002).method_68511();
    }

    public class00183 N() {
        return this.y;
    }

    public void N(Map<class00500, class08887> map) {
        this.N = map;
    }
}

