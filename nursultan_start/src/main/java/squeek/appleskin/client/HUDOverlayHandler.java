/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07047
 *  minecraft.class07086
 *  minecraft.class07512
 *  minecraft.class08036
 *  minecraft.class08394
 *  squeek.appleskin.util.IntPoint
 */
package squeek.appleskin.client;

import java.util.Vector;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07047;
import minecraft.class07086;
import minecraft.class07512;
import minecraft.class08036;
import minecraft.class08394;
import squeek.appleskin.ModConfig;
import squeek.appleskin.api.event.HUDOverlayEvent$Exhaustion;
import squeek.appleskin.api.event.HUDOverlayEvent$HealthRestored;
import squeek.appleskin.api.event.HUDOverlayEvent$HungerRestored;
import squeek.appleskin.api.event.HUDOverlayEvent$Saturation;
import squeek.appleskin.api.handler.EventHandler;
import squeek.appleskin.client.HUDOverlayHandler$HeldFoodCache;
import squeek.appleskin.client.HUDOverlayHandler$OffsetsCache;
import squeek.appleskin.helpers.ColorHelper;
import squeek.appleskin.helpers.ConsumableFood;
import squeek.appleskin.helpers.ExhaustionHelper;
import squeek.appleskin.helpers.FoodHelper;
import squeek.appleskin.helpers.FoodHelper$QueriedFoodResult;
import squeek.appleskin.helpers.TextureHelper;
import squeek.appleskin.helpers.TextureHelper$FoodType;
import squeek.appleskin.helpers.TextureHelper$HeartType;
import squeek.appleskin.util.IntPoint;

public class HUDOverlayHandler {
    public static HUDOverlayHandler INSTANCE;
    private float unclampedFlashAlpha = 0.0f;
    private float flashAlpha = 0.0f;
    private byte alphaDir = 1;
    private boolean needDisableBlend = false;
    public final HUDOverlayHandler$OffsetsCache barOffsets = new HUDOverlayHandler$OffsetsCache();
    public final HUDOverlayHandler$HeldFoodCache heldFood = new HUDOverlayHandler$HeldFoodCache();

    public static void init() {
        INSTANCE = new HUDOverlayHandler();
    }

    private boolean shouldRenderAnyOverlays() {
        return ModConfig.INSTANCE.showFoodValuesHudOverlay || ModConfig.INSTANCE.showSaturationHudOverlay || ModConfig.INSTANCE.showFoodHealthHudOverlay;
    }

    private void drawSaturationOverlay(HUDOverlayEvent$Saturation hUDOverlayEvent$Saturation, class06202 class062022, float f, float f2, int n) {
        this.drawSaturationOverlay(hUDOverlayEvent$Saturation.context, f, hUDOverlayEvent$Saturation.saturationLevel, class062022, hUDOverlayEvent$Saturation.x, hUDOverlayEvent$Saturation.y, f2, n);
    }

    public void drawSaturationOverlay(class01054 class010542, float f, float f2, class06202 class062022, int n, int n2, float f3, int n3) {
        if (f2 + f < 0.0f) {
            return;
        }
        int n4 = ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, f3);
        float f4 = Math.max(0.0f, Math.min(f2 + f, 20.0f));
        int n5 = 0;
        int n6 = (int)Math.ceil(f4 / 2.0f);
        if (f != 0.0f) {
            n5 = (int)Math.max(f2 / 2.0f, 0.0f);
        }
        int n7 = 9;
        Vector<IntPoint> vector = this.barOffsets.foodBarOffsets(n3, (class08036)((class04453)class062022.T_4));
        for (int i = n5; i < n6; ++i) {
            IntPoint intPoint;
            IntPoint intPoint2 = intPoint = i < vector.size() ? vector.get(i) : new IntPoint();
            if (intPoint == null) continue;
            int n8 = n + intPoint.x;
            int n9 = n2 + intPoint.y;
            boolean bl = false;
            int n10 = 0;
            float f5 = f4 / 2.0f - (float)i;
            if (f5 >= 1.0f) {
                n10 = 3 * n7;
            } else if ((double)f5 > 0.5) {
                n10 = 2 * n7;
            } else if ((double)f5 > 0.25) {
                n10 = 1 * n7;
            }
            class010542.N(class08394.Na, TextureHelper.MOD_ICONS, n8, n9, (float)n10, (float)bl, n7, n7, 256, 256, n4);
        }
    }

    private void drawExhaustionOverlay(HUDOverlayEvent$Exhaustion hUDOverlayEvent$Exhaustion, float f) {
        this.drawExhaustionOverlay(hUDOverlayEvent$Exhaustion.context, hUDOverlayEvent$Exhaustion.exhaustion, hUDOverlayEvent$Exhaustion.x, hUDOverlayEvent$Exhaustion.y, f);
    }

    public void drawExhaustionOverlay(class01054 class010542, float f, int n, int n2, float f2) {
        float f3 = FoodHelper.MAX_EXHAUSTION;
        float f4 = Math.min(1.0f, Math.max(0.0f, f / f3));
        int n3 = (int)(f4 * 81.0f);
        int n4 = 9;
        int n5 = ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, 0.75f);
        class010542.N(class08394.Na, TextureHelper.MOD_ICONS, n - n3, n2, (float)(81 - n3), 18.0f, n3, n4, 256, 256, n5);
    }

    private boolean shouldShowEstimatedHealth(class08036 class080362, int n) {
        if (!ModConfig.INSTANCE.showFoodHealthHudOverlay) {
            return false;
        }
        if (this.barOffsets.healthBarOffsets(n, class080362).isEmpty()) {
            return false;
        }
        class07512 class075122 = class080362.method_7344();
        if (class080362.method_73183().y() == class07086.field_5801) {
            return false;
        }
        if (class075122.N() >= 18) {
            return false;
        }
        if (class080362.method_6059(class07047.j)) {
            return false;
        }
        if (class080362.method_6059(class07047.v)) {
            return false;
        }
        return !class080362.method_6059(class07047.z);
    }

    private void drawHungerOverlay(HUDOverlayEvent$HungerRestored hUDOverlayEvent$HungerRestored, class06202 class062022, int n, float f, boolean bl, int n2) {
        this.drawHungerOverlay(hUDOverlayEvent$HungerRestored.context, n, hUDOverlayEvent$HungerRestored.currentFoodLevel, class062022, hUDOverlayEvent$HungerRestored.x, hUDOverlayEvent$HungerRestored.y, f, bl, n2);
    }

    public void drawHungerOverlay(class01054 class010542, int n, int n2, class06202 class062022, int n3, int n4, float f, boolean bl, int n5) {
        if (n <= 0) {
            return;
        }
        int n6 = ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, f);
        int n7 = Math.max(0, Math.min(20, n2 + n));
        int n8 = Math.max(0, n2 / 2);
        int n9 = (int)Math.ceil((float)n7 / 2.0f);
        int n10 = 9;
        Vector<IntPoint> vector = this.barOffsets.foodBarOffsets(n5, (class08036)((class04453)class062022.T_4));
        for (int i = n8; i < n9; ++i) {
            IntPoint intPoint;
            IntPoint intPoint2 = intPoint = i < vector.size() ? vector.get(i) : new IntPoint();
            if (intPoint == null) continue;
            int n11 = n3 + intPoint.x;
            int n12 = n4 + intPoint.y;
            class01894 class018942 = TextureHelper.getFoodTexture(bl, TextureHelper$FoodType.EMPTY);
            int n13 = ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, f * 0.25f);
            class010542.N(class08394.Na, class018942, n11, n12, n10, n10, n13);
            boolean bl2 = i * 2 + 1 == n7;
            class01894 class018943 = TextureHelper.getFoodTexture(bl, bl2 ? TextureHelper$FoodType.HALF : TextureHelper$FoodType.FULL);
            class010542.N(class08394.Na, class018943, n11, n12, n10, n10, n6);
        }
    }

    public void onPreRenderFood(class01054 class010542, class08036 class080362, int n, int n2) {
        if (ModConfig.INSTANCE == null) {
            return;
        }
        if (!ModConfig.INSTANCE.showFoodExhaustionHudUnderlay) {
            return;
        }
        assert (class080362 != null);
        float f = ExhaustionHelper.getExhaustion(class080362);
        HUDOverlayEvent$Exhaustion hUDOverlayEvent$Exhaustion = new HUDOverlayEvent$Exhaustion(f, n2, n, class010542);
        ((EventHandler)HUDOverlayEvent$Exhaustion.EVENT.invoker()).interact(hUDOverlayEvent$Exhaustion);
        if (!hUDOverlayEvent$Exhaustion.isCanceled) {
            this.drawExhaustionOverlay(hUDOverlayEvent$Exhaustion, 1.0f);
        }
    }

    public void onRenderFood(class01054 class010542, class08036 class080362, int n, int n2) {
        FoodHelper$QueriedFoodResult foodHelper$QueriedFoodResult;
        if (ModConfig.INSTANCE == null) {
            return;
        }
        if (!this.shouldRenderAnyOverlays()) {
            return;
        }
        class06202 class062022 = class06202.Nq();
        assert (class080362 != null);
        class07512 class075122 = class080362.method_7344();
        HUDOverlayEvent$Saturation hUDOverlayEvent$Saturation = new HUDOverlayEvent$Saturation(class075122.u(), n2, n, class010542);
        if (!ModConfig.INSTANCE.showSaturationHudOverlay) {
            hUDOverlayEvent$Saturation.isCanceled = true;
        }
        if (!hUDOverlayEvent$Saturation.isCanceled) {
            ((EventHandler)HUDOverlayEvent$Saturation.EVENT.invoker()).interact(hUDOverlayEvent$Saturation);
        }
        if (!hUDOverlayEvent$Saturation.isCanceled) {
            this.drawSaturationOverlay(hUDOverlayEvent$Saturation, class062022, 0.0f, 1.0f, ((class01056)class062022.i_6).R());
        }
        if ((foodHelper$QueriedFoodResult = this.heldFood.result(((class01056)class062022.i_6).R(), class080362)) == null) {
            this.resetFlash();
            return;
        }
        if (ModConfig.INSTANCE.showFoodValuesHudOverlay) {
            HUDOverlayEvent$HungerRestored hUDOverlayEvent$HungerRestored = new HUDOverlayEvent$HungerRestored(class075122.N(), foodHelper$QueriedFoodResult.itemStack, foodHelper$QueriedFoodResult.modifiedFoodComponent, n2, n, class010542);
            ((EventHandler)HUDOverlayEvent$HungerRestored.EVENT.invoker()).interact(hUDOverlayEvent$HungerRestored);
            if (hUDOverlayEvent$HungerRestored.isCanceled) {
                return;
            }
            int n3 = foodHelper$QueriedFoodResult.modifiedFoodComponent.N();
            float f = foodHelper$QueriedFoodResult.modifiedFoodComponent.y();
            this.drawHungerOverlay(hUDOverlayEvent$HungerRestored, class062022, n3, this.flashAlpha, FoodHelper.isRotten(foodHelper$QueriedFoodResult.consumableComponent), ((class01056)class062022.i_6).R());
            int n4 = class075122.N() + n3;
            float f2 = class075122.u() + f;
            if (!hUDOverlayEvent$Saturation.isCanceled) {
                float f3 = f2 > (float)n4 ? (float)n4 - class075122.u() : f;
                this.drawSaturationOverlay(hUDOverlayEvent$Saturation, class062022, f3, this.flashAlpha, ((class01056)class062022.i_6).R());
            }
        }
    }

    public void drawHealthOverlay(class01054 class010542, float f, float f2, class06202 class062022, int n, int n2, float f3, int n3) {
        if (f2 <= f) {
            return;
        }
        int n4 = ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, f3);
        int n5 = (int)Math.ceil(f2);
        boolean bl = ((class04453)class062022.T_4).method_73183() != null && ((class04453)class062022.T_4).method_73183().method_8401().U();
        int n6 = (int)Math.max(0.0, Math.ceil(f) / 2.0);
        int n7 = (int)Math.max(0.0, Math.ceil(f2 / 2.0f));
        int n8 = 9;
        Vector<IntPoint> vector = this.barOffsets.healthBarOffsets(n3, (class08036)((class04453)class062022.T_4));
        for (int i = n6; i < n7; ++i) {
            IntPoint intPoint;
            IntPoint intPoint2 = intPoint = i < vector.size() ? vector.get(i) : new IntPoint();
            if (intPoint == null) continue;
            int n9 = n + intPoint.x;
            int n10 = n2 + intPoint.y;
            class01894 class018942 = TextureHelper.getHeartTexture(bl, TextureHelper$HeartType.CONTAINER);
            int n11 = ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, f3 * 0.25f);
            class010542.N(class08394.Na, class018942, n9, n10, n8, n8, n11);
            boolean bl2 = i * 2 + 1 == n5;
            class01894 class018943 = TextureHelper.getHeartTexture(bl, bl2 ? TextureHelper$HeartType.HALF : TextureHelper$HeartType.FULL);
            class010542.N(class08394.Na, class018943, n9, n10, n8, n8, n4);
        }
    }

    private void drawHealthOverlay(HUDOverlayEvent$HealthRestored hUDOverlayEvent$HealthRestored, class06202 class062022, float f, int n) {
        this.drawHealthOverlay(hUDOverlayEvent$HealthRestored.context, ((class04453)class062022.T_4).method_6032(), hUDOverlayEvent$HealthRestored.modifiedHealth, class062022, hUDOverlayEvent$HealthRestored.x, hUDOverlayEvent$HealthRestored.y, f, n);
    }

    public void onRenderHealth(class01054 class010542, class08036 class080362, int n, int n2, int n3, int n4, float f, int n5, int n6, int n7, boolean bl) {
        if (ModConfig.INSTANCE == null) {
            return;
        }
        if (!this.shouldRenderAnyOverlays()) {
            return;
        }
        class06202 class062022 = class06202.Nq();
        assert (class080362 != null);
        FoodHelper$QueriedFoodResult foodHelper$QueriedFoodResult = this.heldFood.result(((class01056)class062022.i_6).R(), class080362);
        if (foodHelper$QueriedFoodResult == null) {
            this.resetFlash();
            return;
        }
        if (this.shouldShowEstimatedHealth(class080362, ((class01056)class062022.i_6).R())) {
            float f2 = FoodHelper.getEstimatedHealthIncrement(class080362, new ConsumableFood(foodHelper$QueriedFoodResult.modifiedFoodComponent, foodHelper$QueriedFoodResult.consumableComponent));
            float f3 = class080362.method_6032();
            float f4 = Math.min(f3 + f2, class080362.method_6063());
            HUDOverlayEvent$HealthRestored hUDOverlayEvent$HealthRestored = null;
            if (f3 < f4) {
                hUDOverlayEvent$HealthRestored = new HUDOverlayEvent$HealthRestored(f4, foodHelper$QueriedFoodResult.itemStack, foodHelper$QueriedFoodResult.modifiedFoodComponent, n, n2, class010542);
            }
            if (hUDOverlayEvent$HealthRestored != null) {
                ((EventHandler)HUDOverlayEvent$HealthRestored.EVENT.invoker()).interact(hUDOverlayEvent$HealthRestored);
            }
            if (hUDOverlayEvent$HealthRestored != null && !hUDOverlayEvent$HealthRestored.isCanceled) {
                this.drawHealthOverlay(hUDOverlayEvent$HealthRestored, class062022, this.flashAlpha, ((class01056)class062022.i_6).R());
            }
        }
    }

    public void onClientTick() {
        this.unclampedFlashAlpha += (float)this.alphaDir * 0.125f;
        if (this.unclampedFlashAlpha >= 1.5f) {
            this.alphaDir = (byte)-1;
        } else if (this.unclampedFlashAlpha <= -0.5f) {
            this.alphaDir = 1;
        }
        this.flashAlpha = Math.max(0.0f, Math.min(1.0f, this.unclampedFlashAlpha)) * Math.max(0.0f, Math.min(1.0f, ModConfig.INSTANCE.maxHudOverlayFlashAlpha));
    }

    public void resetFlash() {
        this.flashAlpha = 0.0f;
        this.unclampedFlashAlpha = 0.0f;
        this.alphaDir = 1;
    }
}

