/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class02484
 *  minecraft.class05349
 *  minecraft.class05365
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07512
 *  minecraft.class08036
 *  minecraft.class08200
 *  minecraft.class08209
 *  minecraft.class08225
 *  minecraft.class08242
 */
package squeek.appleskin.helpers;

import minecraft.class01286;
import minecraft.class02484;
import minecraft.class05349;
import minecraft.class05365;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07512;
import minecraft.class08036;
import minecraft.class08200;
import minecraft.class08209;
import minecraft.class08225;
import minecraft.class08242;
import squeek.appleskin.api.event.FoodValuesEvent;
import squeek.appleskin.api.handler.EventHandler;
import squeek.appleskin.helpers.ConsumableFood;
import squeek.appleskin.helpers.ExhaustionHelper;
import squeek.appleskin.helpers.FoodHelper$QueriedFoodResult;
import squeek.appleskin.network.ClientSyncHandler;

public class FoodHelper {
    public static class05349 EMPTY_FOOD_COMPONENT = new class05365().y();
    public static class08209 DEFAULT_CONSUMABLE_COMPONENT = class08225.N;
    public static float REGEN_EXHAUSTION_INCREMENT = 6.0f;
    public static float MAX_EXHAUSTION = 4.0f;

    public static FoodHelper$QueriedFoodResult query(class06584 class065842, class08036 class080362) {
        if (!FoodHelper.isFood(class065842)) {
            return null;
        }
        ConsumableFood consumableFood = FoodHelper.getDefaultFoodValues(class065842);
        FoodValuesEvent foodValuesEvent = new FoodValuesEvent(class080362, class065842, consumableFood.food(), consumableFood.food());
        ((EventHandler)FoodValuesEvent.EVENT.invoker()).interact(foodValuesEvent);
        return new FoodHelper$QueriedFoodResult(foodValuesEvent.defaultFoodComponent, foodValuesEvent.modifiedFoodComponent, consumableFood.consumable(), class065842);
    }

    public static ConsumableFood getDefaultFoodValues(class06584 class065842) {
        return new ConsumableFood((class05349)class065842.a_(class02484.d, (Object)EMPTY_FOOD_COMPONENT), (class08209)class065842.a_(class02484.w, (Object)DEFAULT_CONSUMABLE_COMPONENT));
    }

    public static float getEstimatedHealthIncrement(class08036 class080362, ConsumableFood consumableFood) {
        if (!class080362.method_7317()) {
            return 0.0f;
        }
        class07512 class075122 = class080362.method_7344();
        int n = Math.min(class075122.N() + consumableFood.food().N(), 20);
        float f = 0.0f;
        if ((float)n >= 18.0f && ClientSyncHandler.naturalRegeneration) {
            float f2 = Math.min(class075122.u() + consumableFood.food().y(), (float)n);
            float f3 = ExhaustionHelper.getExhaustion(class080362);
            f = FoodHelper.getEstimatedHealthIncrement(n, f2, f3);
        }
        block0: for (class08200 class082002 : consumableFood.consumable().M()) {
            if (!(class082002 instanceof class08242)) continue;
            for (class07055 class070552 : ((class08242)class082002).y()) {
                if (class070552.L() != class07047.z) continue;
                int n2 = class070552.i();
                int n3 = class070552.u();
                f += (float)Math.floor(n3 / Math.max(50 >> n2, 1));
                continue block0;
            }
        }
        return f;
    }

    public static float getEstimatedHealthIncrement(int n, float f, float f2) {
        float f3 = 0.0f;
        if (!Float.isFinite(f2) || !Float.isFinite(f)) {
            return 0.0f;
        }
        while (n >= 18) {
            while (f2 > MAX_EXHAUSTION) {
                f2 -= MAX_EXHAUSTION;
                if (f > 0.0f) {
                    f = Math.max(f - 1.0f, 0.0f);
                    continue;
                }
                --n;
            }
            if (n >= 20 && Float.compare(f, Float.MIN_NORMAL) > 0) {
                float f4 = Math.min(f, REGEN_EXHAUSTION_INCREMENT);
                float f5 = Math.nextUp(MAX_EXHAUSTION) - f2;
                int n2 = Math.max(1, (int)Math.ceil(f5 / f4));
                f3 += f4 / REGEN_EXHAUSTION_INCREMENT * (float)n2;
                f2 += f4 * (float)n2;
                continue;
            }
            if (n < 18) continue;
            f3 += 1.0f;
            f2 += REGEN_EXHAUSTION_INCREMENT;
        }
        return f3;
    }

    public static boolean isRotten(class08209 class082092) {
        for (class08200 class082002 : class082092.M()) {
            if (!(class082002 instanceof class08242)) continue;
            for (class07055 class070552 : ((class08242)class082002).y()) {
                if (((class07084)class070552.L().N()).B() != class01286.field_18272) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean canConsume(class08036 class080362, class05349 class053492) {
        return class080362.method_7332(class053492.L());
    }

    public static boolean isFood(class06584 class065842) {
        return class065842.L(class02484.d) && class065842.L(class02484.w);
    }
}

