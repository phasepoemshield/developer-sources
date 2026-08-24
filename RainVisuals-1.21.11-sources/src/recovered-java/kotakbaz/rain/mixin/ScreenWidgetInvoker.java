/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Element
 *  net.minecraft.client.gui.screen.Screen
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={Screen.class})
public interface ScreenWidgetInvoker {
    @Invoker(value="method_37066")
    public void rain$invokeRemoveWidget(Element var1);
}

