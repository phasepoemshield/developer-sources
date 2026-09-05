/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.utils.IPlayerContext
 *  minecraft.class03443
 *  minecraft.class06183
 *  minecraft.class07050
 *  minecraft.class07089
 *  minecraft.class07113
 */
package baritone.utils;

import baritone.api.BaritoneAPI;
import baritone.api.utils.IPlayerContext;
import baritone.utils.accessor.IPlayerControllerMP;
import minecraft.class03443;
import minecraft.class06183;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07113;

public final class BlockBreakHelper {
    private static final int BASE_BREAK_DELAY = 1;
    private final IPlayerContext ctx;
    private boolean wasHitting;
    private int breakDelayTimer = 0;

    public void tick(boolean bl) {
        boolean bl2;
        if (this.breakDelayTimer > 0) {
            --this.breakDelayTimer;
            return;
        }
        class07089 class070892 = this.ctx.objectMouseOver();
        boolean bl3 = bl2 = class070892 != null && class070892.N() == class07113.field_1332;
        if (bl && bl2) {
            this.ctx.playerController().setHittingBlock(this.wasHitting);
            if (this.ctx.playerController().hasBrokenBlock()) {
                this.ctx.playerController().syncHeldItem();
                this.ctx.playerController().clickBlock(((class06183)class070892).u(), ((class06183)class070892).i());
                this.ctx.player().method_6104(class07050.field_5808);
            } else {
                if (this.ctx.playerController().onPlayerDamageBlock(((class06183)class070892).u(), ((class06183)class070892).i())) {
                    this.ctx.player().method_6104(class07050.field_5808);
                }
                if (this.ctx.playerController().hasBrokenBlock()) {
                    this.breakDelayTimer = (Integer)BaritoneAPI.getSettings().blockBreakSpeed.value - 1;
                    ((IPlayerControllerMP)((class03443)this.ctx.minecraft().T_2)).setDestroyDelay(0);
                }
            }
            this.wasHitting = !this.ctx.playerController().hasBrokenBlock();
            this.ctx.playerController().setHittingBlock(false);
        } else {
            this.wasHitting = false;
        }
    }

    BlockBreakHelper(IPlayerContext iPlayerContext) {
        this.ctx = iPlayerContext;
    }

    public void stopBreakingBlock() {
        if (this.ctx.player() != null && this.wasHitting) {
            this.ctx.playerController().setHittingBlock(false);
            this.ctx.playerController().resetBlockRemoving();
            this.wasHitting = false;
        }
    }
}

