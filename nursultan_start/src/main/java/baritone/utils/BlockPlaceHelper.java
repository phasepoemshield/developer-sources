/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.utils.IPlayerContext
 *  minecraft.class06183
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07089
 *  minecraft.class07113
 */
package baritone.utils;

import baritone.Baritone;
import baritone.api.utils.IPlayerContext;
import minecraft.class06183;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07089;
import minecraft.class07113;

public class BlockPlaceHelper {
    private static final int BASE_PLACE_DELAY = 1;
    private final IPlayerContext ctx;
    private int rightClickTimer;

    public void tick(boolean bl) {
        if (this.rightClickTimer > 0) {
            --this.rightClickTimer;
            return;
        }
        class07089 class070892 = this.ctx.objectMouseOver();
        if (!bl || this.ctx.player().n() || class070892 == null || class070892.N() != class07113.field_1332) {
            return;
        }
        this.rightClickTimer = (Integer)Baritone.settings().rightClickSpeed.value - 1;
        for (class07050 class070502 : class07050.values()) {
            if (this.ctx.playerController().processRightClickBlock(this.ctx.player(), this.ctx.world(), class070502, (class06183)class070892) == class07082.N) {
                this.ctx.player().method_6104(class070502);
                return;
            }
            if (this.ctx.player().method_5998(class070502).R() || this.ctx.playerController().processRightClick(this.ctx.player(), this.ctx.world(), class070502) != class07082.N) continue;
            return;
        }
    }

    BlockPlaceHelper(IPlayerContext iPlayerContext) {
        this.ctx = iPlayerContext;
    }
}

