package sg.mx;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import ru.destra.fix.ObfuscatedGuiTextInputBridge;
import ru.destra.misc.ColorPickerPanel;

@Mixin(ColorPickerPanel.class)
public abstract class ColorPickerPanelBridgeMixin {
    @Shadow(remap = false)
    @Final
    @Mutable
    private static List colorHistory;

    public void mouseClicked(double mouseX, double mouseY, int button) {
        ObfuscatedGuiTextInputBridge.mouseClicked(this, mouseX, mouseY, button);
    }

    public void mouseReleased(double mouseX, double mouseY, int button) {
        ObfuscatedGuiTextInputBridge.mouseReleased(this, mouseX, mouseY, button);
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

    /**
     * @author Codex
     * @reason Original bytecode writes keyCodec static final field outside <clinit>, which crashes on Java 21.
     */
    @Overwrite(remap = false)
    public static void initHistory() {
        if (colorHistory == null) {
            colorHistory = new ArrayList();
        } else {
            colorHistory.clear();
        }
    }
}
