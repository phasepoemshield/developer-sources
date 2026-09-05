/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04961
 *  minecraft.class04981
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05098
 *  minecraft.class05111
 *  minecraft.class05129
 *  minecraft.class05685
 *  minecraft.class06202
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class04961;
import minecraft.class04981;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05129;
import minecraft.class05685;
import minecraft.class06202;
import org.slf4j.Logger;

public class class04691
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.configure.world.opening");
    private final class04981 u;
    private final class05096 i;
    private final boolean R;
    private final class06202 M;

    public class04691(class04981 class049812, class05096 class050962, boolean bl, class06202 class062022) {
        this.u = class049812;
        this.i = class050962;
        this.R = bl;
        this.M = class062022;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 25; ++i) {
            if (this.y()) {
                return;
            }
            try {
                boolean bl = class051112.i(this.u.y);
                if (!bl) continue;
                this.M.execute(() -> {
                    class05096 class050962 = this.i;
                    if (class050962 instanceof class05092) {
                        ((class05092)class050962).R();
                    }
                    this.u.R = class04961.field_19434;
                    if (this.R) {
                        class05685.N((class04981)this.u, (class05096)this.i);
                    } else {
                        this.M.N(this.i);
                    }
                });
                break;
            }
            catch (class05098 class050982) {
                if (this.y()) {
                    return;
                }
                class04691.N((long)class050982.L);
                continue;
            }
            catch (Exception exception) {
                if (this.y()) {
                    return;
                }
                y.error("Failed to open server", (Throwable)exception);
                this.N(exception);
            }
        }
    }

    public class00392 N() {
        return L;
    }
}

