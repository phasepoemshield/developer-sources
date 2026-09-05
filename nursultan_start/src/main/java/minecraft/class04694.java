/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04982
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05098
 *  minecraft.class05111
 *  minecraft.class05129
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class04982;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05129;
import org.slf4j.Logger;

public class class04694
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.minigame.world.starting.screen.title");
    private final long u;
    private final class04982 i;
    private final class05092 R;

    public class04694(long l, class04982 class049822, class05092 class050922) {
        this.u = l;
        this.i = class049822;
        this.R = class050922;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.y()) {
                    return;
                }
                if (!class051112.L(this.u, this.i.N()).booleanValue()) continue;
                class04694.N((class05096)this.R);
                break;
            }
            catch (class05098 class050982) {
                if (this.y()) {
                    return;
                }
                class04694.N((long)class050982.L);
                continue;
            }
            catch (Exception exception) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't start mini game!");
                this.N(exception);
            }
        }
    }

    public class00392 N() {
        return L;
    }
}

