/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class04702
 *  minecraft.class04705
 *  minecraft.class05685
 *  minecraft.class06202
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class04702;
import minecraft.class04705;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05685;
import minecraft.class06202;
import org.slf4j.Logger;

public abstract class class05129
implements Runnable {
    protected static final int N = 25;
    private static final Logger y = LogUtils.getLogger();
    private boolean L = false;

    public void L() {
    }

    public void i() {
        this.L = true;
    }

    public void u() {
    }

    public boolean y() {
        return this.L;
    }

    protected void N(class00392 class003922) {
        this.i();
        class06202 class062022 = class06202.Nq();
        class062022.execute(() -> class062022.N((class05096)new class04702(class003922, (class05096)new class05685((class05096)new class04705()))));
    }

    protected void N(Exception exception) {
        if (exception instanceof class05097) {
            class05097 class050972 = (class05097)exception;
            this.N(class050972.N.y());
        } else {
            this.N((class00392)class00392.y((String)exception.getMessage()));
        }
    }

    protected void N(class05097 class050972) {
        this.N(class050972.N.y());
    }

    public abstract class00392 N();

    public static void N(class05096 class050962) {
        class06202 class062022 = class06202.Nq();
        class062022.execute(() -> class062022.N(class050962));
    }

    protected static void N(long l) {
        try {
            Thread.sleep(l * 1000L);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            y.error("", (Throwable)interruptedException);
        }
    }
}

