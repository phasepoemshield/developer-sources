/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.IPlayerController
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07510
 *  minecraft.class08036
 */
package baritone.utils.player;

import baritone.api.utils.IPlayerController;
import baritone.utils.accessor.IPlayerControllerMP;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07510;
import minecraft.class08036;

public final class BaritonePlayerController
implements IPlayerController {
    private final class06202 mc;

    public BaritonePlayerController(class06202 class062022) {
        this.mc = class062022;
    }

    public boolean clickBlock(class07209 class072092, class07211 class072112) {
        return ((class03443)this.mc.T_2).N(class072092, class072112);
    }

    public boolean hasBrokenBlock() {
        return !((IPlayerControllerMP)((class03443)this.mc.T_2)).isHittingBlock();
    }

    public class07282 getGameType() {
        return ((class03443)this.mc.T_2).U();
    }

    public void syncHeldItem() {
        ((IPlayerControllerMP)((class03443)this.mc.T_2)).callSyncCurrentPlayItem();
    }

    public void resetBlockRemoving() {
        ((class03443)this.mc.T_2).L();
    }

    public void windowClick(int n, int n2, int n3, class07510 class075102, class08036 class080362) {
        ((class03443)this.mc.T_2).N(n, n2, n3, class075102, class080362);
    }

    public class07082 processRightClick(class04453 class044532, class07299 class072992, class07050 class070502) {
        return ((class03443)this.mc.T_2).N((class08036)class044532, class070502);
    }

    public void setHittingBlock(boolean bl) {
        ((IPlayerControllerMP)((class03443)this.mc.T_2)).setIsHittingBlock(bl);
    }

    public class07082 processRightClickBlock(class04453 class044532, class07299 class072992, class07050 class070502, class06183 class061832) {
        return ((class03443)this.mc.T_2).N(class044532, class070502, class061832);
    }

    public boolean onPlayerDamageBlock(class07209 class072092, class07211 class072112) {
        return ((class03443)this.mc.T_2).y(class072092, class072112);
    }
}

