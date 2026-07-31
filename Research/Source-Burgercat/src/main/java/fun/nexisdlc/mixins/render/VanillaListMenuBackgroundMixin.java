package fun.nexisdlc.mixins.render;

import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Screen.class)
public class VanillaListMenuBackgroundMixin {
    // Оставлен пустым — кастомный фон для списочных экранов удалён
}
