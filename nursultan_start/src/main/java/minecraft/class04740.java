/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04702
 *  minecraft.class04948
 *  minecraft.class05092
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
import minecraft.class04948;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05098;
import minecraft.class05111;
import minecraft.class05129;
import org.slf4j.Logger;

public class class04740
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.backup.restoring");
    private final class04948 u;
    private final long i;
    private final class05092 R;

    public class04740(class04948 class049482, long l, class05092 class050922) {
        this.u = class049482;
        this.i = l;
        this.R = class050922;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.y()) {
                    return;
                }
                class051112.y(this.i, this.u.N);
                class04740.N((long)1L);
                if (this.y()) {
                    return;
                }
                class04740.N((class05096)this.R);
                return;
            }
            catch (class05098 class050982) {
                if (this.y()) {
                    return;
                }
                class04740.N((long)class050982.L);
                continue;
            }
            catch (class05097 class050972) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't restore backup", (Throwable)class050972);
                class04740.N((class05096)new class04702(class050972, (class05096)this.R));
                return;
            }
            catch (Exception exception) {
                if (this.y()) {
                    return;
                }
                y.error("Couldn't restore backup", (Throwable)exception);
                this.N(exception);
                return;
            }
        }
    }

    public class00392 N() {
        return L;
    }
}

