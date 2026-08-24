/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.hud.ChatHud
 *  net.minecraft.client.gui.hud.ChatHudLine
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package kotakbaz.rain.mixin;

import java.util.List;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={ChatHud.class})
public interface ChatComponentAccessor {
    @Accessor(value="field_2061")
    public List<ChatHudLine> rain$getAllMessages();

    @Invoker(value="method_44813")
    public void rain$refreshTrimmedMessages();
}

