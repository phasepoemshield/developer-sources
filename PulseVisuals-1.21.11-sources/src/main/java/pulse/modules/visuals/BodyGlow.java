package pulse.modules.visuals;

import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import pulse.events.WorldRenderEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.render.system.ClientPipelines;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Body Glow", b = "Рисует мягкое свечение ауры вокруг игроков", c = ModuleCategory.VISUALS)
public class BodyGlow extends ClientModule {
    private static final Identifier GLOW_TEXTURE = Identifier.of("pulse", "textures/bloom.png");
    private final SliderSetting size = new SliderSetting("Размер", 2.3F, 0.5F, 5.0F, 0.1F);
    private final SliderSetting transparency = new SliderSetting("Прозрачность", 1.0F, 0.0F, 1.0F, 0.05F);
    private final SettingGroup colorGroup = new SettingGroup("Цвет");
    private final BooleanSetting useClientColor = new BooleanSetting("Цвет клиента", true);
    private final ColorSetting customColor = new ColorSetting("Цвет", new Color(255, 255, 255)).a(() -> !this.useClientColor.a());

    private Color getColor() {
        return this.useClientColor.a() ? new Color(ModuleRegistry.CLIENT_COLOR.o()) : this.customColor.getColor();
    }

    @EventHandler
    public void onRenderWorld(WorldRenderEvent event) {
        if (c.player != null && c.world != null && c.gameRenderer != null) {
            Immediate bufferSource = event.bufferSource();
            if (bufferSource != null) {
                MatrixStack stack = event.matrices();
                net.minecraft.client.render.Camera camera = c.gameRenderer.getCamera();
                Vec3d cam = camera.getCameraPos();
                float tickDelta = event.tickDelta();
                Color baseColor = this.getColor();
                float opacity = MathHelper.clamp(this.transparency.a(), 0.0F, 1.0F);
                if (!(opacity <= 0.01F)) {
                    VertexConsumer glow = bufferSource.getBuffer(ClientPipelines.getTextureLayer(GLOW_TEXTURE));
                    float spread = this.size.a() * 0.35F;
                    float yawRad = (float)Math.toRadians(-camera.getYaw());
                    float pitchRad = (float)Math.toRadians(camera.getPitch());

                    for (AbstractClientPlayerEntity player : c.world.getPlayers()) {
                        if (player != null && !player.isInvisible() && (player != c.player || !c.options.getPerspective().isFirstPerson())) {
                            double px = MathHelper.lerp(tickDelta, player.lastRenderX, player.getX()) - cam.x;
                            double py = MathHelper.lerp(tickDelta, player.lastRenderY, player.getY()) - cam.y;
                            double pz = MathHelper.lerp(tickDelta, player.lastRenderZ, player.getZ()) - cam.z;
                            float pHeight = player.getHeight();
                            if (player.isSneaking()) {
                                pHeight -= 0.18F;
                            }

                            stack.push();
                            stack.translate(px, py + pHeight / 2.0, pz);
                            stack.multiply(new Quaternionf().rotationYXZ(yawRad, pitchRad, 0.0F));
                            Matrix4f mat = stack.peek().getPositionMatrix();

                            float halfW = 0.6F + spread * 0.5F;
                            float halfH = pHeight / 2.0F + 0.25F + spread * 0.5F;
                            int a = (int)(opacity * 110.0F);

                            glow.vertex(mat, -halfW, halfH, 0.0F).texture(0.0F, 0.0F).color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), a);
                            glow.vertex(mat, halfW, halfH, 0.0F).texture(1.0F, 0.0F).color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), a);
                            glow.vertex(mat, halfW, -halfH, 0.0F).texture(1.0F, 1.0F).color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), a);
                            glow.vertex(mat, -halfW, -halfH, 0.0F).texture(0.0F, 1.0F).color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), a);

                            stack.pop();
                        }
                    }
                }
            }
        }
    }
}
