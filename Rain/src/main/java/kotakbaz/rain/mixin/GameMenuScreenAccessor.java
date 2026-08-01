/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={GameMenuScreen.class})
public interface GameMenuScreenAccessor {
    @Accessor(value="field_40792")
    public ButtonWidget rain$getExitButton();
}

