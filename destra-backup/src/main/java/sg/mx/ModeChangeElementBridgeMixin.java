package sg.mx;

import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import ru.destra.fix.ObfuscatedGuiTextInputBridge;
import ru.destra.gui.ModeChangeElement;

@Mixin(value = ModeChangeElement.class, remap = false)
public abstract class ModeChangeElementBridgeMixin {
    public void mouseClicked(double mouseX, double mouseY, int button) {
        ObfuscatedGuiTextInputBridge.mouseClicked(this, mouseX, mouseY, button);
    }

    public void charTyped(char chr, int modifiers) {
        ObfuscatedGuiTextInputBridge.charTyped(this, chr, modifiers);
    }

    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        ObfuscatedGuiTextInputBridge.keyPressed(this, keyCode, scanCode, modifiers);
    }

    public void mouseScrolled(double mouseX, double mouseY, int amount) {
        ObfuscatedGuiTextInputBridge.mouseScrolled(this, mouseX, mouseY, amount);
    }

    public void render(DrawContext context, int mouseX, int mouseY) {
        ObfuscatedGuiTextInputBridge.render(this, context, mouseX, mouseY);
    }
}
