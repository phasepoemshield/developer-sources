/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class05349
 *  minecraft.class06497
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class08036
 *  minecraft.class08394
 *  minecraft.class08562
 *  org.joml.Matrix3x2fStack
 */
package squeek.appleskin.client;

import java.util.List;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class05349;
import minecraft.class06497;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class08036;
import minecraft.class08394;
import minecraft.class08562;
import org.joml.Matrix3x2fStack;
import squeek.appleskin.ModConfig;
import squeek.appleskin.api.event.TooltipOverlayEvent$Pre;
import squeek.appleskin.api.event.TooltipOverlayEvent$Render;
import squeek.appleskin.api.handler.EventHandler;
import squeek.appleskin.client.TooltipOverlayHandler$FoodOutline;
import squeek.appleskin.client.TooltipOverlayHandler$FoodOverlay;
import squeek.appleskin.client.TooltipOverlayHandler$FoodOverlayTextComponent;
import squeek.appleskin.helpers.ColorHelper;
import squeek.appleskin.helpers.FoodHelper;
import squeek.appleskin.helpers.FoodHelper$QueriedFoodResult;
import squeek.appleskin.helpers.KeyHelper;
import squeek.appleskin.helpers.TextureHelper;
import squeek.appleskin.helpers.TextureHelper$FoodType;

public class TooltipOverlayHandler {
    public static TooltipOverlayHandler INSTANCE;

    public static void init() {
        INSTANCE = new TooltipOverlayHandler();
    }

    public void onItemTooltip(class06584 class065842, class08036 class080362, class06591 class065912, class06497 class064972, List list) {
        if (class065842 == null || list == null || ModConfig.INSTANCE == null) {
            return;
        }
        if (!this.shouldShowTooltip(class065842, class064972)) {
            return;
        }
        FoodHelper$QueriedFoodResult foodHelper$QueriedFoodResult = FoodHelper.query(class065842, class080362);
        if (foodHelper$QueriedFoodResult == null) {
            return;
        }
        class05349 class053492 = foodHelper$QueriedFoodResult.defaultFoodComponent;
        class05349 class053493 = foodHelper$QueriedFoodResult.modifiedFoodComponent;
        TooltipOverlayEvent$Pre tooltipOverlayEvent$Pre = new TooltipOverlayEvent$Pre(class065842, class053492, class053493);
        ((EventHandler)TooltipOverlayEvent$Pre.EVENT.invoker()).interact(tooltipOverlayEvent$Pre);
        if (tooltipOverlayEvent$Pre.isCanceled) {
            return;
        }
        TooltipOverlayHandler$FoodOverlay tooltipOverlayHandler$FoodOverlay = new TooltipOverlayHandler$FoodOverlay(tooltipOverlayEvent$Pre.itemStack, class053492, class053493, foodHelper$QueriedFoodResult.consumableComponent, class080362);
        if (tooltipOverlayHandler$FoodOverlay.shouldRenderHungerBars()) {
            try {
                list.add(new TooltipOverlayHandler$FoodOverlayTextComponent(tooltipOverlayHandler$FoodOverlay));
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                // empty catch block
            }
        }
    }

    private boolean shouldShowTooltip(class06584 class065842, class06497 class064972) {
        boolean bl;
        if (class065842.R()) {
            return false;
        }
        if (!class064972.y() && ((class08562)class065842.a_(class02484.v, (Object)class08562.L)).N()) {
            return false;
        }
        boolean bl2 = bl = ModConfig.INSTANCE.showFoodValuesInTooltip && KeyHelper.isShiftKeyDown() || ModConfig.INSTANCE.showFoodValuesInTooltipAlways;
        if (!bl) {
            return false;
        }
        return FoodHelper.isFood(class065842);
    }

    public void onRenderTooltip(class01054 class010542, TooltipOverlayHandler$FoodOverlay tooltipOverlayHandler$FoodOverlay, int n, int n2, class01590 class015902) {
        boolean bl;
        int n3;
        if (class010542 == null || ModConfig.INSTANCE == null) {
            return;
        }
        if (tooltipOverlayHandler$FoodOverlay == null) {
            return;
        }
        class06584 class065842 = tooltipOverlayHandler$FoodOverlay.itemStack;
        class05349 class053492 = tooltipOverlayHandler$FoodOverlay.defaultFood;
        class05349 class053493 = tooltipOverlayHandler$FoodOverlay.modifiedFood;
        int n4 = n;
        int n5 = n2;
        TooltipOverlayEvent$Render tooltipOverlayEvent$Render = new TooltipOverlayEvent$Render(class065842, n4, n5, class010542, class053492, class053493);
        ((EventHandler)TooltipOverlayEvent$Render.EVENT.invoker()).interact(tooltipOverlayEvent$Render);
        if (tooltipOverlayEvent$Render.isCanceled) {
            return;
        }
        n4 = tooltipOverlayEvent$Render.x;
        n5 = tooltipOverlayEvent$Render.y;
        class010542 = tooltipOverlayEvent$Render.context;
        class065842 = tooltipOverlayEvent$Render.itemStack;
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        int n6 = class053492.N();
        int n7 = class053493.N();
        n4 += (tooltipOverlayHandler$FoodOverlay.hungerBars - 1) * 9;
        boolean bl2 = FoodHelper.isRotten(tooltipOverlayHandler$FoodOverlay.consumableComponent);
        for (int i = 0; i < tooltipOverlayHandler$FoodOverlay.hungerBars * 2; i += 2) {
            class010542.N(class08394.Na, TextureHelper.FOOD_EMPTY_TEXTURE, n4, n5, 9, 9);
            TooltipOverlayHandler$FoodOutline tooltipOverlayHandler$FoodOutline = TooltipOverlayHandler$FoodOutline.get(n7, n6, i);
            if (tooltipOverlayHandler$FoodOutline != TooltipOverlayHandler$FoodOutline.NORMAL) {
                class010542.N(class08394.Na, TextureHelper.HUNGER_OUTLINE_SPRITE, n4, n5, 9, 9, tooltipOverlayHandler$FoodOutline.argb());
            }
            n3 = n6 - 1 == i ? 1 : 0;
            class01894 class018942 = TextureHelper.getFoodTexture(bl2, n3 != 0 ? TextureHelper$FoodType.HALF : TextureHelper$FoodType.FULL);
            class010542.N(class08394.Na, class018942, n4, n5, 9, 9, ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, 0.25f));
            if (n7 > i) {
                bl = n7 - 1 == i;
                class01894 class018943 = TextureHelper.getFoodTexture(bl2, bl ? TextureHelper$FoodType.HALF : TextureHelper$FoodType.FULL);
                class010542.N(class08394.Na, class018943, n4, n5, 9, 9);
            }
            n4 -= 9;
        }
        if (tooltipOverlayHandler$FoodOverlay.hungerBarsText != null) {
            matrix3x2fStack.pushMatrix();
            matrix3x2fStack.translate((float)(n4 += 18), (float)n5);
            matrix3x2fStack.scale(0.75f, 0.75f);
            class010542.y(class015902, tooltipOverlayHandler$FoodOverlay.hungerBarsText, 2, 2, -5592406);
            matrix3x2fStack.popMatrix();
        }
        n4 = n;
        n5 += 10;
        float f = class053493.y();
        float f2 = Math.abs(f);
        n4 += (tooltipOverlayHandler$FoodOverlay.saturationBars - 1) * 7;
        for (n3 = 0; n3 < tooltipOverlayHandler$FoodOverlay.saturationBars * 2; n3 += 2) {
            int n8;
            float f3 = (f2 - (float)n3) / 2.0f;
            bl = f2 <= (float)n3;
            int n9 = n8 = bl ? ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, 0.5f) : ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, 1.0f);
            class010542.N(class08394.Na, TextureHelper.MOD_ICONS, n4, n5, f3 >= 1.0f ? 21.0f : ((double)f3 > 0.5 ? 14.0f : ((double)f3 > 0.25 ? 7.0f : (f3 > 0.0f ? 0.0f : 28.0f))), f >= 0.0f ? 27.0f : 34.0f, 7, 7, 256, 256, n8);
            n4 -= 7;
        }
        if (tooltipOverlayHandler$FoodOverlay.saturationBarsText != null) {
            matrix3x2fStack.pushMatrix();
            matrix3x2fStack.translate((float)(n4 += 14), (float)n5);
            matrix3x2fStack.scale(0.75f, 0.75f);
            class010542.y(class015902, tooltipOverlayHandler$FoodOverlay.saturationBarsText, 2, 1, -5592406);
            matrix3x2fStack.popMatrix();
        }
    }
}

