/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gl.Framebuffer
 */
package oxxxde;

import net.minecraft.client.gl.Framebuffer;
import oxxxde.\u0621;

public final class \u0627\u0626 {
    private static final ThreadLocal<\u0621> ACTIVE_CONTEXT = new ThreadLocal();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void renderInto(Framebuffer target, int physicalWidth, int physicalHeight, int guiScale, Runnable renderer) {
        block10: {
            block9: {
                if (target == null || renderer == null || physicalWidth <= 0) break block9;
                if (physicalHeight <= 0) break block9;
                if (guiScale > 0) break block10;
            }
            return;
        }
        \u0621 previous = ACTIVE_CONTEXT.get();
        ACTIVE_CONTEXT.set(new \u0621(target, physicalWidth, physicalHeight, guiScale));
        try {
            renderer.run();
        }
        finally {
            if (previous == null) {
                ACTIVE_CONTEXT.remove();
            } else {
                ACTIVE_CONTEXT.set(previous);
            }
        }
    }

    public static int guiScaleOr(int original) {
        \u0621 context = ACTIVE_CONTEXT.get();
        return context == null ? original : context.guiScale;
    }

    public static int physicalHeightOr(int original) {
        \u0621 context = ACTIVE_CONTEXT.get();
        return context == null ? original : context.physicalHeight;
    }

    public static int physicalWidthOr(int original) {
        \u0621 context = ACTIVE_CONTEXT.get();
        return context == null ? original : context.physicalWidth;
    }

    private \u0627\u0626() {
    }

    public static Framebuffer targetOr(Framebuffer original) {
        \u0621 context = ACTIVE_CONTEXT.get();
        return context == null ? original : context.target;
    }
}

