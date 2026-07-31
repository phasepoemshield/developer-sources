package pulse.modules.visuals;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import pulse.events.WorldRenderEvent;

@ModuleInfo(a = "Nimb", b = "Draws a halo above the player.", c = ModuleCategory.VISUALS)
public class Nimb extends ClientModule {
    private static final int SEGMENTS = 72;
    private final SliderSetting lineWidth = new SliderSetting("Line Width", 1.5f, 1.0f, 3.0f, 0.5f);
    private final SliderSetting radius = new SliderSetting("Radius", 0.28f, 0.18f, 0.55f, 0.02f);
    private final SliderSetting yOffset = new SliderSetting("Y Offset", 0.05f, -0.3f, 0.25f, 0.02f);
    private final SettingGroup colorGroup = new SettingGroup("Color");
    private final BooleanSetting useClientColor = new BooleanSetting("Use Client Color", true);
    private final ColorSetting color = new ColorSetting("Custom Color", Color.WHITE).a(() -> {
        return Boolean.valueOf(!this.useClientColor.a());
    });

    private static final double MAX_RENDER_DISTANCE_SQ = 16384.0d;
    private static double[] cosTable;
    private static double[] sinTable;

    static {
        cosTable = new double[SEGMENTS + 1];
        sinTable = new double[SEGMENTS + 1];
        for (int i = 0; i <= SEGMENTS; i++) {
            double a = (i / (double) SEGMENTS) * Math.PI * 2.0d;
            cosTable[i] = Math.cos(a);
            sinTable[i] = Math.sin(a);
        }
    }

    @EventHandler
    public void a(WorldRenderEvent worldRenderEvent) {
        if (c.player == null || c.world == null || c.gameRenderer == null) {
            return;
        }
        MatrixStack MatrixStackVarA = worldRenderEvent.a();
        Vec3d Vec3dVarGetPos = c.gameRenderer.getCamera().getPos();
        boolean firstPerson = c.options.getPerspective().isFirstPerson();
        double px = c.player.getX();
        double py = c.player.getY();
        double pz = c.player.getZ();
        float fA = this.radius.a();
        Color colorN = n();
        float cr = colorN.getRed() / 255.0f;
        float cg = colorN.getGreen() / 255.0f;
        float cb = colorN.getBlue() / 255.0f;
        float ca = 0.9f;
        float tickDelta = worldRenderEvent.b();
        float yOff = this.yOffset.a();

        MatrixStackVarA.push();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.lineWidth(this.lineWidth.a());
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);

        Matrix4f matrix = MatrixStackVarA.peek().getPositionMatrix();
        BufferBuilder buf = null;

        for (net.minecraft.client.network.AbstractClientPlayerEntity p : c.world.getPlayers()) {
            if (p.isInvisible()) continue;
            if (p == c.player && firstPerson) continue;
            double dx = p.getX() - px;
            double dy = p.getY() - py;
            double dz = p.getZ() - pz;
            if ((dx * dx + dy * dy + dz * dz) > MAX_RENDER_DISTANCE_SQ) continue;

            double cx = MathHelper.lerp(tickDelta, p.prevX, p.getX()) - Vec3dVarGetPos.x;
            double cy = (MathHelper.lerp(tickDelta, p.prevY, p.getY()) - Vec3dVarGetPos.y) + p.getEyeHeight(p.getPose()) + 0.05d + yOff;
            double cz = MathHelper.lerp(tickDelta, p.prevZ, p.getZ()) - Vec3dVarGetPos.z;

            if (buf == null) {
                buf = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
            }
            for (int i = 0; i < SEGMENTS; i++) {
                double x1 = cx + cosTable[i] * fA;
                double z1 = cz + sinTable[i] * fA;
                double x2 = cx + cosTable[i + 1] * fA;
                double z2 = cz + sinTable[i + 1] * fA;
                buf.vertex(matrix, (float) x1, (float) cy, (float) z1).color(cr, cg, cb, ca);
                buf.vertex(matrix, (float) x2, (float) cy, (float) z2).color(cr, cg, cb, ca);
            }
        }

        if (buf != null) {
            BufferRenderer.drawWithGlobalProgram(buf.end());
        }

        RenderSystem.lineWidth(1.0f);
        RenderSystem.depthMask(true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        MatrixStackVarA.pop();
    }

    private Color n() {
        return this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.color.a();
    }
}
