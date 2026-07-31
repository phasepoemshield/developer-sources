package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.item.ItemStack;

import java.awt.Color;

@FunctionAdd(name = "ArmorDurability", alias = "Armor Durability", category = Category.Render, description = "Красит броню по прочности: зелёный = фулл, красный = почти сломан")
public class ArmorDurability extends Function {

    public ModeSetting colorMode = new ModeSetting("Режим цвета", "Градиент", "Градиент", "Ступени");

    public ArmorDurability() {
        addSettings(colorMode);
    }

    public int getColor(ItemStack stack) {
        if (stack == null || stack.isEmpty() || !stack.isDamageable()) {
            return 0xFFFFFFFF;
        }
        int max = stack.getMaxDamage();
        if (max <= 0) return 0xFFFFFFFF;

        float ratio = (float) (max - stack.getDamage()) / max;
        ratio = Math.clamp(ratio, 0f, 1f);

        if (colorMode.is("Ступени")) {
            return stepColor(ratio);
        }
        return gradColor(ratio);
    }

    private int gradColor(float ratio) {
        float hue = ratio * (120f / 360f);
        return 0xFF000000 | (Color.HSBtoRGB(hue, 1f, 1f) & 0x00FFFFFF);
    }

    private int stepColor(float ratio) {
        if (ratio > 0.75f) return 0xFF00FF00;
        if (ratio > 0.50f) return 0xFFFFFF00;
        if (ratio > 0.25f) return 0xFFFF8000;
        return 0xFFFF0000;
    }
}