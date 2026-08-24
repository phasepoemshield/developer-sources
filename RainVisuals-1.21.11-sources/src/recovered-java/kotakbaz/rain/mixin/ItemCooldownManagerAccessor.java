/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.ItemCooldownManager
 *  net.minecraft.util.Identifier
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package kotakbaz.rain.mixin;

import java.util.Map;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ItemCooldownManager.class})
public interface ItemCooldownManagerAccessor {
    @Accessor(value="field_8025")
    public int rain$getTick();

    @Accessor(value="field_8024")
    public Map<Identifier, Object> rain$getEntries();
}

