package fun.nexisdlc.modules.impl.render;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.UniformType;
import net.minecraft.client.render.Camera;
import net.minecraft.util.Identifier;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.util.OptionalInt;

@FunctionAdd(name = "SkyShader", alias = "Sky Shader", category = Category.Render, description = "\u0428\u0435\u0439\u0434\u0435\u0440\u043d\u044b\u0439 \u0444\u043e\u043d \u043d\u0435\u0431\u0430")
public class SkyShader extends Function {

    private static SkyShader instance;

    private final ModeSetting mode = new ModeSetting("\u0420\u0435\u0436\u0438\u043c", "Water", "Water", "Caustic");
    private final SliderSetting speed = new SliderSetting("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 1.0f, 0.1f, 5.0f, 0.1f);
    private final SliderSetting scale = new SliderSetting("\u0420\u0430\u0437\u043c\u0435\u0440", 5.0f, 1.0f, 20.0f, 0.5f);
    private final SliderSetting intensity = new SliderSetting("\u0418\u043d\u0442\u0435\u043d\u0441\u0438\u0432\u043d\u043e\u0441\u0442\u044c", 0.01f, 0.001f, 0.05f, 0.001f);
    private final SliderSetting alpha = new SliderSetting("\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", 1.0f, 0.3f, 1.0f, 0.05f);
    private final BooleanSetting cancelClouds = new BooleanSetting("\u0423\u0431\u0438\u0440\u0430\u0442\u044c \u043e\u0431\u043b\u0430\u043a\u0430", true);

    private RenderPipeline waterPipeline;
    private RenderPipeline causticPipeline;
    private GpuBuffer vertexBuffer;
    private GpuBuffer timeBuffer;
    private GpuBuffer resolutionBuffer;
    private GpuBuffer colorBuffer;
    private GpuBuffer paramsBuffer;
    private GpuBuffer cameraBuffer;
    private long startMillis = -1L;

    public SkyShader() {
        instance = this;
        addSettings(mode, speed, scale, intensity, alpha, cancelClouds);
        // Draw BEFORE terrain (same phase as vanilla sky). Terrain/entities then cover the
        // geometry pixels. END_MAIN + LEQUAL@z=1 was unreliable on macOS/Metal (far-plane
        // depth rejects the whole fullscreen triangle → solid black sky).
        WorldRenderEvents.START_MAIN.register(context -> renderSkyShader());
    }

    public static SkyShader getInstance() {
        return instance;
    }

    public static boolean shouldCancelSky() {
        return instance != null && instance.isState();
    }

    public static boolean shouldCancelClouds() {
        return instance != null && instance.isState() && instance.cancelClouds.get();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        startMillis = -1L;
    }

    private void renderSkyShader() {
        if (!isState() || mc.player == null || mc.world == null) {
            return;
        }
        ensureInitialized();
        if (waterPipeline == null || causticPipeline == null || vertexBuffer == null) {
            return;
        }
        if (startMillis < 0L) {
            startMillis = System.currentTimeMillis();
        }

        MinecraftClient client = MinecraftClient.getInstance();
        int width = client.getWindow().getFramebufferWidth();
        int height = client.getWindow().getFramebufferHeight();
        if (width <= 0 || height <= 0) {
            return;
        }

        Camera camera = client.gameRenderer.getCamera();
        int iconRgb = ClientColors.ICON.getRGB();
        float time = (System.currentTimeMillis() - startMillis) / 1000.0f;
        float yawRad = (float) Math.toRadians(-camera.getYaw());
        float pitchRad = (float) Math.toRadians(camera.getPitch());
        float fov = client.options.getFov().getValue().floatValue();

        GpuDevice device = RenderSystem.getDevice();
        CommandEncoder encoder = device.createCommandEncoder();
        writeUniforms(encoder, time, width, height,
                ((iconRgb >> 16) & 0xFF) / 255f,
                ((iconRgb >> 8) & 0xFF) / 255f,
                (iconRgb & 0xFF) / 255f,
                alpha.get(), speed.get(), scale.get(), intensity.get(), yawRad, pitchRad, fov);

        // Color-only pass, no depth test/write — like vanilla POSITION_SKY.
        // Terrain rendered right after START_MAIN overwrites solid geometry.
        try (RenderPass pass = encoder.createRenderPass(
                () -> "skyshader",
                client.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(mode.is("Caustic") ? causticPipeline : waterPipeline);
            pass.setUniform("uTime", timeBuffer.slice());
            pass.setUniform("uResolution", resolutionBuffer.slice());
            pass.setUniform("uColor", colorBuffer.slice());
            pass.setUniform("uParams", paramsBuffer.slice());
            pass.setUniform("uCamera", cameraBuffer.slice());
            pass.setVertexBuffer(0, vertexBuffer);
            pass.draw(0, 3);
        }
    }

    private void ensureInitialized() {
        if (waterPipeline != null && causticPipeline != null && vertexBuffer != null) {
            return;
        }
        try {
            GpuDevice device = RenderSystem.getDevice();
            VertexFormat format = VertexFormat.builder()
                    .add("Position", VertexFormatElement.POSITION)
                    .build();
            try (MemoryStack stack = MemoryStack.stackPush()) {
                ByteBuffer buffer = stack.malloc(3 * 3 * Float.BYTES);
                // NDC fullscreen triangle at z=0 (same as ColorGrading / screen quads).
                buffer.asFloatBuffer()
                        .put(-1f).put(-1f).put(0f)
                        .put(3f).put(-1f).put(0f)
                        .put(-1f).put(3f).put(0f);
                vertexBuffer = format.uploadImmediateVertexBuffer(buffer);
            }
            waterPipeline = buildPipeline("skyshader_water", "skyshader_water", format);
            causticPipeline = buildPipeline("skyshader_caustic", "skyshader_caustic", format);
            timeBuffer = device.createBuffer(() -> "skyshader_time", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            resolutionBuffer = device.createBuffer(() -> "skyshader_resolution", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            colorBuffer = device.createBuffer(() -> "skyshader_color", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            paramsBuffer = device.createBuffer(() -> "skyshader_params", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            cameraBuffer = device.createBuffer(() -> "skyshader_camera", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        } catch (Exception e) {
            waterPipeline = null;
            causticPipeline = null;
            vertexBuffer = null;
            System.err.println("[SkyShader] init failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static RenderPipeline buildPipeline(String location, String shaderName, VertexFormat format) {
        Identifier shader = Identifier.of("nexis", "core/" + shaderName);
        return RenderPipeline.builder()
                .withLocation(Identifier.of("nexis", location))
                .withVertexShader(shader)
                .withFragmentShader(shader)
                .withVertexFormat(format, VertexFormat.DrawMode.TRIANGLES)
                .withUniform("uTime", UniformType.UNIFORM_BUFFER)
                .withUniform("uResolution", UniformType.UNIFORM_BUFFER)
                .withUniform("uColor", UniformType.UNIFORM_BUFFER)
                .withUniform("uParams", UniformType.UNIFORM_BUFFER)
                .withUniform("uCamera", UniformType.UNIFORM_BUFFER)
                .withBlend(BlendFunction.TRANSLUCENT)
                .withDepthWrite(false)
                .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                .withCull(false)
                .build();
    }

    private void writeUniforms(CommandEncoder encoder, float time, int width, int height,
                               float r, float g, float b, float alpha,
                               float speed, float scale, float intensity,
                               float yawRad, float pitchRad, float fov) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            encoder.writeToBuffer(timeBuffer.slice(), Std140Builder.onStack(stack, 16).putFloat(time).get());
            encoder.writeToBuffer(resolutionBuffer.slice(), Std140Builder.onStack(stack, 16).putVec2(width, height).get());
            encoder.writeToBuffer(colorBuffer.slice(), Std140Builder.onStack(stack, 16).putVec3(r, g, b).get());
            encoder.writeToBuffer(paramsBuffer.slice(), Std140Builder.onStack(stack, 16).putVec4(alpha, speed, scale, intensity).get());
            encoder.writeToBuffer(cameraBuffer.slice(), Std140Builder.onStack(stack, 16).putVec4(yawRad, pitchRad, fov, 0f).get());
        }
    }
}
