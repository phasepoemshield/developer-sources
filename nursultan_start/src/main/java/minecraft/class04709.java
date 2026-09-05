/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class05097
 *  minecraft.class05098
 *  minecraft.class05111
 *  minecraft.class05129
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class05097;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05129;
import org.slf4j.Logger;

public abstract class class04709
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private final long L;
    private final class00392 u;
    private final Runnable i;

    public class04709(long l, class00392 class003922, Runnable runnable) {
        this.L = l;
        this.u = class003922;
        this.i = runnable;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.y()) {
                    return;
                }
                this.N(class051112, this.L);
                if (this.y()) {
                    return;
                }
                this.i.run();
                return;
            }
            catch (class05098 class050982) {
                if (this.y()) {
                    return;
                }
                class04709.N((long)class050982.L);
                continue;
            }
            catch (Exception exception) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't reset world");
                this.N(exception);
                return;
            }
        }
    }

    public class00392 N() {
        return this.u;
    }

    protected abstract void N(class05111 var1, long var2) throws class05097;
}

