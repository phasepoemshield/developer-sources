/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01894
 */
package squeek.appleskin.helpers;

import minecraft.class01894;
import squeek.appleskin.helpers.TextureHelper$FoodType;
import squeek.appleskin.helpers.TextureHelper$HeartType;

public class TextureHelper {
    public static final class01894 MOD_ICONS = class01894.N((String)"appleskin", (String)"textures/icons.png");
    public static final class01894 HUNGER_OUTLINE_SPRITE = class01894.N((String)"appleskin", (String)"tooltip_hunger_outline");
    public static final class01894 FOOD_EMPTY_HUNGER_TEXTURE = class01894.y((String)"hud/food_empty_hunger");
    public static final class01894 FOOD_HALF_HUNGER_TEXTURE = class01894.y((String)"hud/food_half_hunger");
    public static final class01894 FOOD_FULL_HUNGER_TEXTURE = class01894.y((String)"hud/food_full_hunger");
    public static final class01894 FOOD_EMPTY_TEXTURE = class01894.y((String)"hud/food_empty");
    public static final class01894 FOOD_HALF_TEXTURE = class01894.y((String)"hud/food_half");
    public static final class01894 FOOD_FULL_TEXTURE = class01894.y((String)"hud/food_full");
    public static final class01894 HEART_CONTAINER = class01894.y((String)"hud/heart/container");
    public static final class01894 HEART_HARDCORE_CONTAINER = class01894.y((String)"hud/heart/container_hardcore");
    public static final class01894 HEART_FULL = class01894.y((String)"hud/heart/full");
    public static final class01894 HEART_HARDCORE_FULL = class01894.y((String)"hud/heart/hardcore_full");
    public static final class01894 HEART_HALF = class01894.y((String)"hud/heart/half");
    public static final class01894 HEART_HARDCORE_HALF = class01894.y((String)"hud/heart/hardcore_half");

    public static class01894 getHeartTexture(boolean bl, TextureHelper$HeartType textureHelper$HeartType) {
        return switch (textureHelper$HeartType.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (bl) {
                    yield HEART_HARDCORE_CONTAINER;
                }
                yield HEART_CONTAINER;
            }
            case 1 -> {
                if (bl) {
                    yield HEART_HARDCORE_FULL;
                }
                yield HEART_FULL;
            }
            case 2 -> bl ? HEART_HARDCORE_HALF : HEART_HALF;
        };
    }

    public static class01894 getFoodTexture(boolean bl, TextureHelper$FoodType textureHelper$FoodType) {
        return switch (textureHelper$FoodType.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (bl) {
                    yield FOOD_EMPTY_HUNGER_TEXTURE;
                }
                yield FOOD_EMPTY_TEXTURE;
            }
            case 1 -> {
                if (bl) {
                    yield FOOD_HALF_HUNGER_TEXTURE;
                }
                yield FOOD_HALF_TEXTURE;
            }
            case 2 -> bl ? FOOD_FULL_HUNGER_TEXTURE : FOOD_FULL_TEXTURE;
        };
    }
}

