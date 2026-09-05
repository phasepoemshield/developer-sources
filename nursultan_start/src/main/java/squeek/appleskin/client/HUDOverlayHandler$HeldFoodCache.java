/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class08036
 */
package squeek.appleskin.client;

import minecraft.class06584;
import minecraft.class08036;
import squeek.appleskin.ModConfig;
import squeek.appleskin.helpers.FoodHelper;
import squeek.appleskin.helpers.FoodHelper$QueriedFoodResult;

public class HUDOverlayHandler$HeldFoodCache {
    protected FoodHelper$QueriedFoodResult result;
    public int lastGuiTick = 0;

    public FoodHelper$QueriedFoodResult result(int n, class08036 class080362) {
        if (n != this.lastGuiTick) {
            this.query(class080362);
            this.lastGuiTick = n;
        }
        return this.result;
    }

    protected void query(class08036 class080362) {
        boolean bl;
        boolean bl2;
        class06584 class065842 = class080362.method_6047();
        FoodHelper$QueriedFoodResult foodHelper$QueriedFoodResult = FoodHelper.query(class065842, class080362);
        boolean bl3 = bl2 = foodHelper$QueriedFoodResult != null && FoodHelper.canConsume(class080362, foodHelper$QueriedFoodResult.modifiedFoodComponent);
        if (ModConfig.INSTANCE.showFoodValuesHudOverlayWhenOffhand && !bl2) {
            class065842 = class080362.method_6079();
            foodHelper$QueriedFoodResult = FoodHelper.query(class065842, class080362);
            bl2 = foodHelper$QueriedFoodResult != null && FoodHelper.canConsume(class080362, foodHelper$QueriedFoodResult.modifiedFoodComponent);
        }
        boolean bl4 = bl = !class065842.R() && bl2;
        if (!bl) {
            this.result = null;
            return;
        }
        this.result = foodHelper$QueriedFoodResult;
    }
}

