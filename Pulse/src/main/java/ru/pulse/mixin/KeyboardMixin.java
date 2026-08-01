package ru.pulse.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.gui.core.ClickGuiKeyBinding;
import pulse.events.EventBusService;
import pulse.gui.core.GuiInput;
import pulse.gui.core.GuiInteractionState;
import pulse.events.KeyInputEvent;
import pulse.markers.MapMarker;
import pulse.markers.MarkerManager;
import pulse.markers.MarkerSettings;
import pulse.gui.core.PulseClickGuiScreen;
import pulse.theme.Theme;
import pulse.client.MinecraftContext;
import pulse.module.ClientModule;
import pulse.module.ModuleRegistry;
import ru.pulse.Pulse;

@Mixin({Keyboard.class})
public class KeyboardMixin {

    @Shadow
    @Final
    private MinecraftClient client;

    @Unique
    private static final double MAX_RAYCAST_DISTANCE = 500.0d;

    @Inject(method = {"onKey"}, at = {@At("HEAD")})
    private void onKey(long j, int i, int i2, int i3, int i4, CallbackInfo callbackInfo) {
        if (j == this.client.getWindow().getHandle()) {
            EventBusService.EVENT_BUS.post(new KeyInputEvent(i, i2, i3, i4));
            if (MinecraftContext.c.player == null || MinecraftContext.c.world == null || i3 != 1) {
                return;
            }
            if (MinecraftContext.c.currentScreen != null) {
                if (ClickGuiKeyBinding.OPEN_KEY.matchesKey(i, i2)) {
                    Screen ScreenVar = MinecraftContext.c.currentScreen;
                    if (ScreenVar instanceof PulseClickGuiScreen) {
                        PulseClickGuiScreen pulseClickGuiScreen = (PulseClickGuiScreen) ScreenVar;
                        if (GuiInteractionState.a().b()) {
                            pulseClickGuiScreen.c();
                            return;
                        } else {
                            GuiInput.j();
                            MinecraftContext.c.setScreen((Screen) null);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (ClickGuiKeyBinding.OPEN_KEY.matchesKey(i, i2)) {
                MinecraftContext.c.setScreen(Pulse.getInstance().getClickGui());
                return;
            }
            int iB = MarkerSettings.b();
            if (MarkerSettings.a() && iB != 0 && iB == i) {
                createQuickMarker();
                return;
            }
            for (ClientModule clientModule : ModuleRegistry.all()) {
                if (clientModule.j() == i) {
                    clientModule.d();
                }
            }
        }
    }

    @Unique
    private void createQuickMarker() {
        if (MinecraftContext.c.player == null || MinecraftContext.c.world == null) {
            return;
        }
        Vec3d Vec3dVarGetCameraPosVec = MinecraftContext.c.player.getCameraPosVec(1.0f);
        BlockHitResult BlockHitResultVarRaycast = MinecraftContext.c.world.raycast(new RaycastContext(Vec3dVarGetCameraPosVec, Vec3dVarGetCameraPosVec.add(MinecraftContext.c.player.getRotationVec(1.0f).multiply(MAX_RAYCAST_DISTANCE)), RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, MinecraftContext.c.player));
        if (BlockHitResultVarRaycast.getType() == HitResult.Type.BLOCK) {
            BlockPos BlockPosVarGetBlockPos = BlockHitResultVarRaycast.getBlockPos();
            MarkerManager.a(new MapMarker("Р‘С‹СЃС‚СЂР°СЏ РјРµС‚РєР°", BlockPosVarGetBlockPos.getX(), BlockPosVarGetBlockPos.getY(), BlockPosVarGetBlockPos.getZ(), Theme.X, MapMarker.Icon.FAST));
        }
    }
}
