/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={TextFieldWidget.class})
public interface TextFieldWidgetAccessor {
    @Accessor(value="field_2103")
    public int rain$getFirstCharacterIndex();
}

