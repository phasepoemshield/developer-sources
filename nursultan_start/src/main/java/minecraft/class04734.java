/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05129
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05129;
import org.slf4j.Logger;

public class class04734
extends class05129 {
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.L((String)"mco.create.world.wait");
    private final String u;
    private final String i;
    private final long R;

    public class04734(long l, String string, String string2) {
        this.R = l;
        this.u = string;
        this.i = string2;
    }

    public void run() {
        class05111 class051112 = class05111.N();
        try {
            class051112.N(this.R, this.u, this.i);
        }
        catch (class05097 class050972) {
            y.error("Couldn't create world", (Throwable)class050972);
            this.N(class050972);
        }
        catch (Exception exception) {
            y.error("Could not create world", (Throwable)exception);
            this.N(exception);
        }
    }

    public class00392 N() {
        return L;
    }
}

