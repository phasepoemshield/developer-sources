/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class05098
 *  minecraft.class05111
 *  minecraft.class05129
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05129;
import org.slf4j.Logger;

public class class04724
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.minigame.world.slot.screen.title");
    private final long u;
    private final int i;
    private final Runnable R;

    public class04724(long l, int n, Runnable runnable) {
        this.u = l;
        this.i = n;
        this.R = runnable;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.y()) {
                    return;
                }
                if (!class051112.N(this.u, this.i)) continue;
                this.R.run();
                break;
            }
            catch (class05098 class050982) {
                if (this.y()) {
                    return;
                }
                class04724.N((long)class050982.L);
                continue;
            }
            catch (Exception exception) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't switch world!");
                this.N(exception);
            }
        }
    }

    public class00392 N() {
        return L;
    }
}

