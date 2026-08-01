package fun.nexisdlc.ui.screen;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

final class SharedBackgroundParticles {
    /** Единая точка отсчёта времени для шейдерного фона — одинакова во всех экранах. */
    static final long SHADER_START_TIME_MS = System.currentTimeMillis();

    /**
     * Момент (System.currentTimeMillis()), когда splash-анимация полностью завершила исчезновение.
     * -1 означает, что сплаш ещё не завершился.
     */
    static volatile long splashFinishedTimeMs = -1L;

    private static final long BACKGROUND_FADE_DURATION_MS = 900L;

    /**
     * Возвращает прогресс плавного появления фона меню [0..1].
     * 0 — фон полностью прозрачен, 1 — фон полностью виден.
     * Если сплаш так и не был зафиксирован (>10 сек с запуска), возвращает 1.
     */
    static float getBackgroundFadeAlpha() {
        long finished = splashFinishedTimeMs;
        if (finished < 0L) {
            // Fallback: если прошло >10 сек с запуска — показываем фон полностью
            if (System.currentTimeMillis() - SHADER_START_TIME_MS > 10_000L) {
                return 1f;
            }
            return 0f;
        }
        long elapsed = System.currentTimeMillis() - finished;
        return Math.min(1f, (float) elapsed / BACKGROUND_FADE_DURATION_MS);
    }

    private static final Identifier PARTICLE_TEXTURE = Identifier.of("nexis", "images/etc/star.png");
    private static final float SPAWN_INTERVAL = 0.08f;
    private static final Random RANDOM = new Random();
    private static final List<Particle> PARTICLES = new ArrayList<>();
    private static float spawnTimer = 0.0f;

    private SharedBackgroundParticles() {
    }

    static void tick() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc == null || mc.getWindow() == null) {
            return;
        }

        spawnTimer += 1.0f / 20.0f;
        if (spawnTimer >= SPAWN_INTERVAL) {
            float width = Math.max(1.0f, mc.getWindow().getWidth());
            float height = Math.max(1.0f, mc.getWindow().getHeight());
            float xNorm = RANDOM.nextFloat();
            float yNorm = -30.0f / height;
            float speedYNorm = ThreadLocalRandom.current().nextFloat(25f, 60f) / height;
            float speedXNorm = ThreadLocalRandom.current().nextFloat(-8f, 8f) / width;
            float alpha = ThreadLocalRandom.current().nextFloat(0.6f, 0.9f);
            float size = 15.0f + RANDOM.nextFloat() * 5f;
            float rotation = ThreadLocalRandom.current().nextFloat(-30f, 30f);
            int color = RANDOM.nextBoolean() ? ClientColors.GRADIENT_START.getRGB() : ClientColors.GRADIENT_END.getRGB();

            PARTICLES.add(new Particle(xNorm, yNorm, speedYNorm, speedXNorm, alpha, size, rotation, color));
            spawnTimer = 0.0f;
        }

        PARTICLES.removeIf(particle -> !particle.isAlive(mc.getWindow().getHeight()));
    }

    static void render(Renderer2D renderer, float screenWidth, float screenHeight) {
        for (Particle particle : PARTICLES) {
            particle.render(renderer, screenWidth, screenHeight);
        }
    }

    private static final class Particle {
        private final float startXNorm;
        private final float startYNorm;
        private final float speedYNorm;
        private final float speedXNorm;
        private final float alpha;
        private final float size;
        private final float fixedRotation;
        private final int color;
        private final long spawnTime;

        private Particle(float startXNorm, float startYNorm, float speedYNorm, float speedXNorm, float alpha, float size, float fixedRotation, int color) {
            this.startXNorm = startXNorm;
            this.startYNorm = startYNorm;
            this.speedYNorm = speedYNorm;
            this.speedXNorm = speedXNorm;
            this.alpha = alpha;
            this.size = size;
            this.fixedRotation = fixedRotation;
            this.color = color;
            this.spawnTime = System.nanoTime();
        }

        private void render(Renderer2D renderer, float screenWidth, float screenHeight) {
            double elapsed = (System.nanoTime() - spawnTime) / 1_000_000_000.0;
            float t = (float) elapsed;

            float fadeIn = Math.min(1.0f, t / 0.5f);
            float fadeOut = Math.max(0.0f, 1.0f - (0.08f * t));
            float currentAlpha = alpha * fadeIn * fadeOut;
            if (currentAlpha <= 0.001f) {
                return;
            }

            float currentX = (startXNorm + speedXNorm * t) * screenWidth;
            float currentY = (startYNorm + speedYNorm * t) * screenHeight;

            int a = (int) (255 * currentAlpha);
            int r = (color >> 16) & 0xFF;
            int g = (color >> 8) & 0xFF;
            int b = color & 0xFF;
            int finalColor = (a << 24) | (r << 16) | (g << 8) | b;

            renderer.pushTranslation(currentX, currentY);
            renderer.pushRotation(fixedRotation);
            renderer.drawTexture(PARTICLE_TEXTURE, -size / 2f, -size / 2f, size, size, finalColor);
            renderer.popRotation();
            renderer.popTransform();
        }

        private boolean isAlive(float screenHeight) {
            double elapsed = (System.nanoTime() - spawnTime) / 1_000_000_000.0;
            float t = (float) elapsed;
            float currentY = (startYNorm + speedYNorm * t) * screenHeight;
            float fadeOut = Math.max(0.0f, 1.0f - (0.08f * t));
            return currentY < screenHeight + 20f && fadeOut > 0.0f;
        }
    }
}
