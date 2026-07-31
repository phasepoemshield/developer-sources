/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={MinecraftClient.class})
public interface MinecraftClientAccessor {
    @Accessor(value="field_1752")
    public int rain$getItemUseCooldown();

    @Accessor(value="field_1752")
    public void rain$setItemUseCooldown(int var1);
}

