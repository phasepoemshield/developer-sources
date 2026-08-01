package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.gl.GlState;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.impl.combat.AntiBotSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

import java.io.InputStream;
import java.util.List;

import static fun.nexisdlc.client.ClientColors.ICON;

@FunctionAdd(name = "Arrows", alias = "Arrows", category = Category.Render, description = "Показывает стрелки на игроков за краем экрана")
public class Arrows extends Function {
    public static final ModeSetting design = new ModeSetting("Вид картинки", "Первый", "Первый", "Второй", "Третий");

    private final BooleanSetting showName = new BooleanSetting("Показывать ник", false);
    private final BooleanSetting showDistance = new BooleanSetting("Показывать дистанцию", false);
    private final SliderSetting radius = new SliderSetting("Радиус", 100f, 30f, 300f, 5f);

    private static final Identifier TRIANGLE_1 = Identifier.of("nexis", "images/arrows/triangle.png");
    private static final Identifier TRIANGLE_2 = Identifier.of("nexis", "images/arrows/triangle2.png");
    private static final Identifier TRIANGLE_3 = Identifier.of("nexis", "images/arrows/triangle3.png");

    private static volatile boolean texturesLoaded = false;

    private final java.util.HashMap<String, Float> animatedYaw = new java.util.HashMap<>();
    private long lastRenderTime = -1;

    public Arrows() {
        addSettings(design, showName, showDistance, radius);
    }

    /**
     * Загрузка текстур на render thread через 3D-событие.
     * NativeImageBackedTexture требует GPU context, который доступен только на render thread.
     */
    @EventHandler
    public void onRenderWorld(EventRender.World event) {
        if (texturesLoaded) return;
        texturesLoaded = true;
        loadTexture(TRIANGLE_1);
        loadTexture(TRIANGLE_2);
        loadTexture(TRIANGLE_3);
    }

    private static void loadTexture(Identifier id) {
        if (id == null) return;
        try {
            var resourceOpt = MinecraftClient.getInstance().getResourceManager().getResource(id);
            if (resourceOpt.isPresent()) {
                try (InputStream stream = resourceOpt.get().getInputStream()) {
                    NativeImage image = NativeImage.read(stream);
                    NativeImageBackedTexture texture = new NativeImageBackedTexture(id::toString, image);
                    MinecraftClient.getInstance().getTextureManager().registerTexture(id, texture);
                }
            }
        } catch (Exception e) {
            System.err.println("[Arrows] Failed to load texture " + id + ": " + e.getMessage());
        }
    }

    @EventHandler
    public void onRender(EventRender.Screen.UnderHud event) {
        if (mc.player == null || mc.world == null || mc.options.hudHidden) return;
        if (!mc.options.getPerspective().isFirstPerson()) return;
        if (!texturesLoaded) return;

        Renderer2D renderer = event.getRenderer();

        float width = mc.getWindow().getWidth();
        float height = mc.getWindow().getHeight();
        float middleW = width / 2f;
        float middleH = height / 2f;

        List<AbstractClientPlayerEntity> players = mc.world.getPlayers().stream()
                .filter(player -> player != mc.player && !isBot(player))
                .toList();

        if (players.isEmpty()) return;

        Identifier textureId = switch (design.get()) {
            case "Второй" -> TRIANGLE_2;
            case "Третий" -> TRIANGLE_3;
            default -> TRIANGLE_1;
        };

        float iconSize = design.is("Третий") ? 110f : 33f;
        float halfSize = iconSize / 2f;
        float distanceFromCenter = radius.get();

        long now = System.currentTimeMillis();
        float deltaMs = (lastRenderTime == -1) ? 0 : Math.min(now - lastRenderTime, 100f);
        lastRenderTime = now;

        float elapsedTime = now / 1000f;
        float pulse = (MathHelper.sin(elapsedTime * (float) Math.PI) + 1f) / 2f;

        int mainColor = interpolateColor(ICON.getRGB(), ICON.getRGB(), pulse);
        int friendColor = interpolateColor(0xFF00F10A, 0xFF0FB915, pulse);
        int textureAlpha = design.is("Третий") ? 240 : 210;

        GlState.Snapshot snap = GlState.push();
        try {
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);

            for (AbstractClientPlayerEntity player : players) {
                int finalColor = isFriend(player.getName().getString()) ? friendColor : mainColor;
                float rawYaw = getRotations(player) - mc.player.getYaw();
                String name = player.getName().getString();
                float currentYaw = animatedYaw.getOrDefault(name, rawYaw);
                float diff = MathHelper.wrapDegrees(rawYaw - currentYaw);
                float t = Math.min(1.0f, deltaMs / 55.0f);
                float yaw = currentYaw + diff * t;
                animatedYaw.put(name, yaw);
                String label = buildLabel(player);

                renderer.pushTranslation(middleW, middleH);
                renderer.pushRotation(yaw);
                renderer.drawTexture(
                        textureId,
                        -halfSize,
                        -distanceFromCenter - halfSize,
                        iconSize,
                        iconSize,
                        ColorUtils.injectAlpha(finalColor, textureAlpha),
                        false
                );

                if (!label.isEmpty() && FontRegistry.SF_MEDIUM != null) {
                    float textSize = iconSize > 60f ? 11.5f : 10.5f;
                    float textWidth = FontRegistry.SF_MEDIUM.getWidth(label, textSize);
                    float textY = -distanceFromCenter - iconSize - 5f;
                    renderer.text(
                            FontRegistry.SF_MEDIUM,
                            -textWidth * 0.5f,
                            textY + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', textSize),
                            textSize,
                            label,
                            ColorUtils.injectAlpha(finalColor, 235)
                    );
                }

                renderer.popTransform();
                renderer.popTransform();
            }

            java.util.HashSet<String> currentNames = new java.util.HashSet<>();
            for (AbstractClientPlayerEntity player : players) {
                currentNames.add(player.getName().getString());
            }
            animatedYaw.keySet().retainAll(currentNames);

            renderer.flush();
        } finally {
            GlState.pop(snap);
        }
    }

    private int interpolateColor(int color1, int color2, float t) {
        int r1 = (color1 >> 16) & 0xFF;
        int g1 = (color1 >> 8) & 0xFF;
        int b1 = color1 & 0xFF;
        int a1 = (color1 >> 24) & 0xFF;

        int r2 = (color2 >> 16) & 0xFF;
        int g2 = (color2 >> 8) & 0xFF;
        int b2 = color2 & 0xFF;
        int a2 = (color2 >> 24) & 0xFF;

        int r = (int) (r1 + (r2 - r1) * t);
        int g = (int) (g1 + (g2 - g1) * t);
        int b = (int) (b1 + (b2 - b1) * t);
        int a = (int) (a1 + (a2 - a1) * t);

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    public float getRotations(Entity entity) {
        float delta = mc.getRenderTickCounter().getTickProgress(true);

        double x = MathHelper.lerp(delta, entity.lastX, entity.getX())
                - MathHelper.lerp(delta, mc.player.lastX, mc.player.getX());
        double z = MathHelper.lerp(delta, entity.lastZ, entity.getZ())
                - MathHelper.lerp(delta, mc.player.lastZ, mc.player.getZ());

        return (float) -(MathHelper.atan2(x, z) * MathHelper.DEGREES_PER_RADIAN);
    }

    private boolean isBot(AbstractClientPlayerEntity player) {
        return AntiBotSystem.isBot(player);
    }

    private boolean isFriend(String name) {
        return Nexis.getInstance().getFriendStorage().isFriend(name);
    }

    private String buildLabel(AbstractClientPlayerEntity player) {
        StringBuilder builder = new StringBuilder();
        if (showName.get()) {
            builder.append(player.getName().getString());
        }
        if (showDistance.get()) {
            if (!builder.isEmpty()) {
                builder.append(" ");
            }
            builder.append(Math.round(mc.player.distanceTo(player))).append("m");
        }
        return builder.toString();
    }
}
