/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04704
 *  minecraft.class04945
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05098
 *  minecraft.class05111
 *  minecraft.class05129
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class04702;
import minecraft.class04704;
import minecraft.class04945;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05129;
import org.slf4j.Logger;

public class class04696
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.download.preparing");
    private final long u;
    private final int i;
    private final class05096 R;
    private final String M;

    public class04696(long l, int n, String string, class05096 class050962) {
        this.u = l;
        this.i = n;
        this.R = class050962;
        this.M = string;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.y()) {
                    return;
                }
                class04945 class049452 = class051112.y(this.u, this.i);
                class04696.N((long)1L);
                if (this.y()) {
                    return;
                }
                class04696.N((class05096)new class04704(this.R, class049452, this.M, bl -> {}));
                return;
            }
            catch (class05098 class050982) {
                if (this.y()) {
                    return;
                }
                class04696.N((long)class050982.L);
                continue;
            }
            catch (class05097 class050972) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't download world data", (Throwable)class050972);
                class04696.N((class05096)new class04702(class050972, this.R));
                return;
            }
            catch (Exception exception) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't download world data", (Throwable)exception);
                this.N(exception);
                return;
            }
        }
    }

    public class00392 N() {
        return L;
    }
}

