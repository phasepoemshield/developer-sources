/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import java.util.Map;
import java.util.UUID;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={BossBarHud.class})
public interface BossBarHudAccessor {
    @Accessor(value="field_2060")
    public Map<UUID, ClientBossBar> rain$getBossBars();
}

