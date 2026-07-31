package pulse.modules.visuals;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import pulse.events.LivingEntityRenderEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(a = "Halo", b = "Draws a halo above the player.", c = ModuleCategory.VISUALS)
public class Halo extends ClientModule {
    private static final int SEGMENTS = 48;
    private final SliderSetting lineWidth = new SliderSetting("Line Width", 0.05f, 0.01f, 0.2f, 0.01f);
    private final SliderSetting radius = new SliderSetting("Radius", 0.5f, 0.3f, 1.5f, 0.05f);
    private final SliderSetting yOffset = new SliderSetting("Y Offset", -0.1f, -1.0f, 0.5f, 0.05f);
    private final SettingGroup colorGroup = new SettingGroup("Color");
    private final BooleanSetting useClientColor = new BooleanSetting("Use Client Color", true);
    private final ColorSetting color = new ColorSetting("Custom Color", Color.WHITE).a(() -> {
        return Boolean.valueOf(!this.useClientColor.a());
    });

    @EventHandler
    public void a(LivingEntityRenderEvent livingEntityRenderEvent) {
        LivingEntity entity = livingEntityRenderEvent.a();
        if (!(entity instanceof PlayerEntity) || entity.isInvisible()) {
            return;
        }
        if (entity == c.player && c.options.getPerspective().isFirstPerson()) {
            return;
        }
        MatrixStack matrices = livingEntityRenderEvent.c();
        Color colorN = n();
        float cr = colorN.getRed() / 255.0f;
        float cg = colorN.getGreen() / 255.0f;
        float cb = colorN.getBlue() / 255.0f;
        float ca = 0.95f;
        float r = this.radius.a();
        float y = entity.getHeight() + 0.15f + this.yOffset.a();
        float tube = MathHelper.clamp(this.lineWidth.a(), 0.01f, 0.2f);

        matrices.push();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buf = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
        for (int i = 0; i < SEGMENTS; i++) {
            double a1 = (i / (double) SEGMENTS) * Math.PI * 2.0d;
            double a2 = ((i + 1) / (double) SEGMENTS) * Math.PI * 2.0d;
            float x1 = (float) (Math.cos(a1) * r);
            float z1 = (float) (Math.sin(a1) * r);
            float x2 = (float) (Math.cos(a2) * r);
            float z2 = (float) (Math.sin(a2) * r);
            buf.vertex(matrix, x1, y, z1).color(cr, cg, cb, ca);
            buf.vertex(matrix, x2, y, z2).color(cr, cg, cb, ca);
            buf.vertex(matrix, x1, y + tube * 0.15f, z1).color(cr, cg, cb, ca * 0.55f);
            buf.vertex(matrix, x2, y + tube * 0.15f, z2).color(cr, cg, cb, ca * 0.55f);
        }
        BufferRenderer.drawWithGlobalProgram(buf.end());
        RenderSystem.depthMask(true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        matrices.pop();
    }

    private Color n() {
        return this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.color.a();
    }
}
