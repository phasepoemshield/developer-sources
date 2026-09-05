/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07510
 *  minecraft.class08036
 */
package baritone.api.utils;

import baritone.api.BaritoneAPI;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07510;
import minecraft.class08036;

public interface IPlayerController {
    public boolean clickBlock(class07209 var1, class07211 var2);

    public boolean hasBrokenBlock();

    public class07282 getGameType();

    public void syncHeldItem();

    public void resetBlockRemoving();

    public void windowClick(int var1, int var2, int var3, class07510 var4, class08036 var5);

    public class07082 processRightClick(class04453 var1, class07299 var2, class07050 var3);

    public void setHittingBlock(boolean var1);

    public class07082 processRightClickBlock(class04453 var1, class07299 var2, class07050 var3, class06183 var4);

    public boolean onPlayerDamageBlock(class07209 var1, class07211 var2);

    default public double getBlockReachDistance() {
        return this.getGameType().R() ? 5.0 : (double)((Float)BaritoneAPI.getSettings().blockReachDistance.value).floatValue();
    }
}

