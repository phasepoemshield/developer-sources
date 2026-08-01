package fun.nexisdlc.ui.screen;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.gl.GlState;
import fun.nexisdlc.client.utils.render.main.gl.ShaderProgram;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.mixins.accessors.SplashOverlayAccessor;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class SplashBackground {
    public static final SplashBackground INSTANCE = new SplashBackground();

    private static final SplashShaderBackground SPLASH_SHADER = new SplashShaderBackground();

    private final Identifier STAR_TEXTURE = Identifier.of("nexis", "images/etc/star.png");

    private final List<Particle> particles = new ArrayList<>();
    private float particleSpawnTimer = 0.0f;
    private long lastUpdateTime = Util.getMeasuringTimeMs();
    private static final Random RANDOM = Random.create();

    private float displayProgress = 0.0f;

    private boolean wasLoading = false;

    @EventHandler
    public void onOverGui(EventRender.Screen.OverGui event) {
        if (ClientContainer.isHide()) return;

        if (mc.getOverlay() instanceof SplashOverlay splash) {
            float alpha = calculateSplashAlpha(splash);

            // Фиксируем момент полного исчезновения сплаш-экрана
            if (alpha <= 0f && SharedBackgroundParticles.splashFinishedTimeMs < 0L) {
                SharedBackgroundParticles.splashFinishedTimeMs = System.currentTimeMillis();
            }

            boolean shaderRendered = SPLASH_SHADER.render(ClientColors.GRADIENT_START.getRGB(), alpha);
            if (!shaderRendered) {
                int a = (int)(alpha * 255);
                event.getRenderer().gradient(0f - 50, 0f - 50, event.getViewportWidth() + 100, event.getViewportHeight() + 100,
                        brighten(darken(withAlpha(ClientColors.GRADIENT_START.getRGB(), a), 0.85f), 4),
                        brighten(darken(withAlpha(ClientColors.ICON.getRGB(), a), 0.88f), 4),
                        brighten(darken(withAlpha(ClientColors.GRADIENT_END.getRGB(), a), 0.65f), 4),
                        brighten(darken(withAlpha(ClientColors.BACKGROUND.getRGB(), a), 0.89f), 4));
            }

            renderFull(event.getRenderer(), alpha, splash);
        } else {
            if (wasLoading && SharedBackgroundParticles.splashFinishedTimeMs < 0L) {
                SharedBackgroundParticles.splashFinishedTimeMs = System.currentTimeMillis();
            }
            wasLoading = false;
        }
    }

    private static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    private static int withAlpha(int rgb, int alpha) {
        int a = Math.max(0, Math.min(255, alpha));
        return (a << 24) | (rgb & 0x00FFFFFF);
    }

    private static int darken(int color, float factor) {
        int a = (color >>> 24) & 0xFF;
        int r = (color >>> 16) & 0xFF;
        int g = (color >>> 8) & 0xFF;
        int b = color & 0xFF;
        r = Math.round(r * (1f - factor));
        g = Math.round(g * (1f - factor));
        b = Math.round(b * (1f - factor));
        return (a << 24) | (Math.max(0, Math.min(255, r)) << 16) | (Math.max(0, Math.min(255, g)) << 8) | Math.max(0, Math.min(255, b));
    }

    private static int brighten(int color, int amount) {
        int a = (color >>> 24) & 0xFF;
        int r = Math.max(0, Math.min(255, ((color >>> 16) & 0xFF) + amount));
        int g = Math.max(0, Math.min(255, ((color >>> 8) & 0xFF) + amount));
        int b = Math.max(0, Math.min(255, (color & 0xFF) + amount));
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private void renderFull(Renderer2D renderer, float opacity, SplashOverlay splash) {
        long now = Util.getMeasuringTimeMs();
        float deltaSeconds = Math.min((now - lastUpdateTime) / 1000.0f, 0.1f);
        lastUpdateTime = now;

        int w = mc.getWindow().getWidth();
        int h = mc.getWindow().getHeight();

        renderer.pushAlpha(opacity);

        updateParticles(w, h, deltaSeconds);
        for (Particle p : particles) {
            p.draw(renderer, STAR_TEXTURE);
        }

        drawSplashUI(renderer, w, h, splash, deltaSeconds);

        renderer.popAlpha();
    }

    private float calculateSplashAlpha(SplashOverlay splash) {
        SplashOverlayAccessor accessor = (SplashOverlayAccessor) splash;
        long now = Util.getMeasuringTimeMs();

        float fadeOut = accessor.getReloadCompleteTime() > -1L
                ? (float)(now - accessor.getReloadCompleteTime()) / 1000.0F
                : -1.0F;
        float fadeIn = accessor.getReloadStartTime() > -1L
                ? (float)(now - accessor.getReloadStartTime()) / 500.0F
                : -1.0F;

        if (fadeOut >= 1.0F) {
            return MathHelper.clamp(1.0F - (fadeOut - 1.0F), 0.0F, 1.0F);
        } else if (accessor.isReloading()) {
            return MathHelper.clamp(fadeIn, 0.0F, 1.0F);
        }
        return 1.0F;
    }

    private void drawSplashUI(Renderer2D renderer, int w, int h, SplashOverlay splash, float deltaSeconds) {
        float centerX = w / 2f;

        SplashOverlayAccessor accessor = (SplashOverlayAccessor) splash;
        float realProgress = accessor.getReload().getProgress();

        if (!wasLoading) {
            displayProgress = 0.0f;
            wasLoading = true;
        }

        if (realProgress < displayProgress - 0.5f) {
            displayProgress = realProgress;
        }

        float PROGRESS_LERP_SPEED = 0.006f;

        float smoothFactor = 1.0f - (float) Math.exp(-PROGRESS_LERP_SPEED * deltaSeconds * 60.0);
        smoothFactor = MathHelper.clamp(smoothFactor, 0.0f, 1.0f);

        displayProgress = displayProgress + (realProgress - displayProgress) * smoothFactor;

        if (realProgress >= 0.99f) {
            float finishFactor = 1.0f - (float) Math.exp(-0.08 * deltaSeconds * 60.0);
            displayProgress = displayProgress + (realProgress - displayProgress) * finishFactor;
        }

        float progress = MathHelper.clamp(displayProgress, 0.0f, 1.0f);

        int percent = Math.round(progress * 100);
        String percentText = percent + "%";

        float barW = w * 0.25f;
        float barH = 6f;
        float barX = centerX - barW / 2f;
        float barY = h * 0.6f;
        float rounding = barH / 2f;

        float fillW = barW * progress;
        float progressEndX = barX + fillW;

        float indicatorH = 2f;
        float indicatorY = barY - 12f;
        float indicatorRounding = indicatorH / 2f;

        float textY = indicatorY - 25f;
        float textX = progressEndX;

        renderer.gradientCenteredText(FontRegistry.SF_SEMIBOLD, textX, textY, 18f, percentText,
                ClientColors.GRADIENT_START.getRGB(),
                ClientColors.GRADIENT_END.getRGB());

        renderer.rect(barX, barY, barW, barH, rounding, ColorUtils.rgba(255, 255, 255, 40));

        if (fillW > 0) {
            renderer.gradient(barX, barY, fillW, barH, rounding,
                    ClientColors.GRADIENT_START.getRGB(),
                    ClientColors.GRADIENT_END.getRGB(),
                    ClientColors.GRADIENT_END.getRGB(),
                    ClientColors.GRADIENT_START.getRGB());
        }
    }

    private void updateParticles(int width, int height, float deltaSeconds) {
        particleSpawnTimer += deltaSeconds;
        if (particleSpawnTimer >= 0.08f) {
            particles.add(new Particle(
                    RANDOM.nextFloat() * width,
                    -20.0f,
                    120,
                    ThreadLocalRandom.current().nextFloat(-8, 8),
                    ThreadLocalRandom.current().nextFloat(0.6f, 0.9f),
                    15.0f + RANDOM.nextFloat() * 5,
                    ThreadLocalRandom.current().nextFloat(-30, 30),
                    RANDOM.nextBoolean() ? ClientColors.GRADIENT_START.getRGB() : ClientColors.GRADIENT_END.getRGB()
            ));
            particleSpawnTimer = 0.0f;
        }
        particles.removeIf(p -> !p.isAlive(height));
    }

    private static class Particle {
        private final float startX, startY, speedY, speedX, alpha, size, rotation;
        private final int color;
        private final long spawnTime;

        Particle(float x, float y, float speedY, float speedX, float alpha, float size, float rotation, int color) {
            this.startX = x;
            this.startY = y;
            this.speedY = speedY;
            this.speedX = speedX;
            this.alpha = alpha;
            this.size = size;
            this.rotation = rotation;
            this.color = color;
            this.spawnTime = System.nanoTime();
        }

        void draw(Renderer2D renderer, Identifier tex) {
            float t = (float)((System.nanoTime() - spawnTime) / 1_000_000_000.0);
            float currentAlpha = alpha * Math.min(1.0f, t / 0.5f) * Math.max(0.0f, 1.0f - (0.08f * t));

            if (currentAlpha <= 0.001f) return;

            float x = startX + speedX * t;
            float y = startY + speedY * t;

            renderer.pushTranslation(x, y);
            renderer.pushRotation(rotation);
            renderer.drawTexture(tex, -size / 2f, -size / 2f, size, size,
                    ColorUtils.injectAlpha(color, (int)(currentAlpha * 255)));
            renderer.popRotation();
            renderer.popTransform();
        }

        boolean isAlive(float h) {
            float t = (float)((System.nanoTime() - spawnTime) / 1_000_000_000.0);
            return (startY + speedY * t) < h + 20 && (1.0f - (0.08f * t)) > 0.0f;
        }
    }

    private static final class SplashShaderBackground {
        private ShaderProgram program;
        private int vao;
        private int vbo;
        private int positionLoc = -1;
        private int uvLoc = -1;
        private int colorLoc = -1;
        private int modelViewLoc = -1;
        private int projectionLoc = -1;
        private int timeLoc = -1;
        private int speedLoc = -1;
        private int accentLoc = -1;
        private int alphaLoc = -1;
        private boolean initFailed;

        boolean render(int accentColor, float alpha) {
            if (!ensureInit()) {
                return false;
            }

            float[] vertices = {
                    -1f, -1f, 0f, 0f, 0f, 1f, 1f, 1f, 1f,
                     1f, -1f, 0f, 1f, 0f, 1f, 1f, 1f, 1f,
                     1f,  1f, 0f, 1f, 1f, 1f, 1f, 1f, 1f,
                    -1f, -1f, 0f, 0f, 0f, 1f, 1f, 1f, 1f,
                     1f,  1f, 0f, 1f, 1f, 1f, 1f, 1f, 1f,
                    -1f,  1f, 0f, 0f, 1f, 1f, 1f, 1f, 1f
            };

            GlState.Snapshot snapshot = GlState.push();
            try (MemoryStack stack = MemoryStack.stackPush()) {
                GL11.glDisable(GL11.GL_CULL_FACE);
                GL11.glDisable(GL11.GL_DEPTH_TEST);
                GL11.glDisable(GL11.GL_SCISSOR_TEST);
                GL11.glEnable(GL11.GL_BLEND);
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                if (mc != null && mc.getWindow() != null) {
                    GL11.glViewport(0, 0, mc.getWindow().getFramebufferWidth(), mc.getWindow().getFramebufferHeight());
                }

                program.use();
                Matrix4f identity = new Matrix4f();
                if (modelViewLoc >= 0) {
                    FloatBuffer modelBuf = stack.mallocFloat(16);
                    identity.get(modelBuf);
                    GL20.glUniformMatrix4fv(modelViewLoc, false, modelBuf);
                }
                if (projectionLoc >= 0) {
                    FloatBuffer projBuf = stack.mallocFloat(16);
                    identity.get(projBuf);
                    GL20.glUniformMatrix4fv(projectionLoc, false, projBuf);
                }
                if (timeLoc >= 0) {
                    GL20.glUniform1f(timeLoc, (System.currentTimeMillis() - SharedBackgroundParticles.SHADER_START_TIME_MS) / 1000.0f);
                }
                if (speedLoc >= 0) {
                    GL20.glUniform1f(speedLoc, 0.9f);
                }
                if (accentLoc >= 0) {
                    float r = ((accentColor >> 16) & 0xFF) / 255.0f;
                    float g = ((accentColor >> 8) & 0xFF) / 255.0f;
                    float b = (accentColor & 0xFF) / 255.0f;
                    GL20.glUniform4f(accentLoc, r, g, b, 1.0f);
                }
                if (alphaLoc >= 0) {
                    GL20.glUniform1f(alphaLoc, Math.max(0f, Math.min(1f, alpha)));
                }

                GL30.glBindVertexArray(vao);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
                GL15.glBufferData(GL15.GL_ARRAY_BUFFER, vertices, GL15.GL_STREAM_DRAW);
                GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, 6);
                return true;
            } catch (Exception ignored) {
                return false;
            } finally {
                GlState.pop(snapshot);
            }
        }

        private boolean ensureInit() {
            if (initFailed) {
                return false;
            }
            if (program != null) {
                return true;
            }
            try {
                program = ShaderProgram.fromResources(
                        "assets/nexis/shaders/core/menu_background.vsh",
                        "assets/nexis/shaders/core/menu_background.fsh"
                );
                positionLoc = GL20.glGetAttribLocation(program.id(), "Position");
                uvLoc = GL20.glGetAttribLocation(program.id(), "UV");
                colorLoc = GL20.glGetAttribLocation(program.id(), "Color");
                modelViewLoc = program.getUniformLocation("ModelViewMat");
                projectionLoc = program.getUniformLocation("ProjMat");
                timeLoc = program.getUniformLocation("Time");
                speedLoc = program.getUniformLocation("Speed");
                accentLoc = program.getUniformLocation("AccentColor");
                alphaLoc = program.getUniformLocation("Alpha");

                vao = GL30.glGenVertexArrays();
                vbo = GL15.glGenBuffers();
                GL30.glBindVertexArray(vao);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
                int stride = 9 * Float.BYTES;
                if (positionLoc >= 0) {
                    GL20.glEnableVertexAttribArray(positionLoc);
                    GL20.glVertexAttribPointer(positionLoc, 3, GL11.GL_FLOAT, false, stride, 0L);
                }
                if (uvLoc >= 0) {
                    GL20.glEnableVertexAttribArray(uvLoc);
                    GL20.glVertexAttribPointer(uvLoc, 2, GL11.GL_FLOAT, false, stride, 3L * Float.BYTES);
                }
                if (colorLoc >= 0) {
                    GL20.glEnableVertexAttribArray(colorLoc);
                    GL20.glVertexAttribPointer(colorLoc, 4, GL11.GL_FLOAT, false, stride, 5L * Float.BYTES);
                }
                GL30.glBindVertexArray(0);
                GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
                return true;
            } catch (Exception ignored) {
                initFailed = true;
                return false;
            }
        }
    }

}
