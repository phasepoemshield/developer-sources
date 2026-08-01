package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.resource.ResourceReload;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SplashOverlay.class)
public interface SplashOverlayAccessor {

    @Accessor("reload")
    ResourceReload getReload();

    @Accessor("progress")
    float getProgress();

    @Accessor("reloadCompleteTime")
    long getReloadCompleteTime();

    @Accessor("reloadStartTime")
    long getReloadStartTime();

    @Accessor("reloading")
    boolean isReloading();
}