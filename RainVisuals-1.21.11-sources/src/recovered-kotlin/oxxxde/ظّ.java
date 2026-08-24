package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.state.SkyRenderState;
import net.minecraft.client.world.ClientWorld;
import org.joml.Vector3fc;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from heavy
public final class ظّ {
   private static int vertexArray;
   private static final Logger LOGGER = LoggerFactory.getLogger("Rain Custom Sky");
   private static final Map<String, بٌ> PROGRAMS = new HashMap<>();
   private static final long START_NANOS = System.nanoTime();
   private static final Set<String> FAILED_PROGRAMS = new HashSet<>();
   private static final String VERTEX_SHADER = "assets/rain/shaders/core/sky/sky.vsh";
   private static final String SHADER_DIRECTORY = "assets/rain/shaders/core/sky/";
   private static boolean releaseRequested;

   private static void setDepthTest(boolean enabled) {
      if (enabled) {
         GlStateManager._enableDepthTest();
      } else {
         GlStateManager._disableDepthTest();
      }
   }

   private static void setBlend(boolean enabled) {
      if (enabled) {
         GlStateManager._enableBlend();
      } else {
         GlStateManager._disableBlend();
      }
   }

   public static void release() {
      if (RenderSystem.isOnRenderThread()) {
         releaseNow();
      } else {
         releaseRequested = true;
      }
   }

   private static void setScissor(boolean enabled) {
      if (enabled) {
         GlStateManager._enableScissorTest();
      } else {
         GlStateManager._disableScissorTest();
      }
   }

   private static int vertexArray() {
      if (vertexArray == 0) {
         vertexArray = GL30.glGenVertexArrays();
      }

      return vertexArray;
   }

   private static void upload(int vector, Vector3fc location) {
      upload(location, vector.x(), vector.y(), vector.z());
   }

   private static String readResource(String path) throws IOException {
      try (InputStream stream = ظّ.class.getClassLoader().getResourceAsStream(path)) {
         if (stream == null) {
            throw new IOException("Shader resource not found: " + path);
         } else {
            return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
         }
      }
   }

   private static void upload(int z, float y, float location, float x) {
      if (location >= 0) {
         GL20.glUniform3f(location, x, y, z);
      }
   }

   private static float normalizeAngle(float angle) {
      float fullTurn = (float) (Math.PI * 2);
      float normalized = angle % fullTurn;
      if (normalized < 0.0F) {
         normalized += fullTurn;
      }

      return normalized / fullTurn;
   }

   private static بٌ program(String shaderName) {
      بٌ existing = PROGRAMS.get(shaderName);
      if (existing != null) {
         return existing;
      }

      if (FAILED_PROGRAMS.contains(shaderName)) {
         return null;
      }

      try {
         Throwable throwable = compile(shaderName);
         PROGRAMS.put(shaderName, throwable);
         LOGGER.info("Loaded custom sky shader '{}'", shaderName);
         return throwable;
      } catch (Throwable var3) {
         FAILED_PROGRAMS.add(shaderName);
         LOGGER.error("Failed to load custom sky shader '{}'", shaderName, var3);
         return null;
      }
   }

   private ظّ() {
   }

   private static void upload(int value, float location) {
      if (location >= 0) {
         GL20.glUniform1f(location, value);
      }
   }

   private static بٌ compile(String shaderName) throws IOException {
      String vertexSource = readResource("assets/rain/shaders/core/sky/sky.vsh");
      String fragmentSource = readResource("assets/rain/shaders/core/sky/" + shaderName + ".fsh");
      int vertexShader = compileShader(shaderName + ".vsh", 35633, vertexSource);
      int fragmentShader = 0;
      int program = 0;

      try {
         fragmentShader = compileShader(shaderName + ".fsh", 35632, fragmentSource);
         program = GL20.glCreateProgram();
         GL20.glAttachShader(program, vertexShader);
         GL20.glAttachShader(program, fragmentShader);
         GL20.glLinkProgram(program);
         if (GL20.glGetProgrami(program, 35714) == 0) {
            throw new IllegalStateException(GL20.glGetProgramInfoLog(program).trim());
         } else {
            return new بٌ(
               program,
               uniform(program, "uTime"),
               uniform(program, "uSkyColor"),
               uniform(program, "uCameraForward"),
               uniform(program, "uCameraLeft"),
               uniform(program, "uCameraUp"),
               uniform(program, "uSunDirection"),
               uniform(program, "uTanHalfFov"),
               uniform(program, "uAspect"),
               uniform(program, "uDayTime"),
               uniform(program, "uRain"),
               uniform(program, "uThunder"),
               uniform(program, "uFogColor"),
               uniform(program, "uFogStrength")
            );
         }
      } catch (RuntimeException | Error var10) {
         if (program != 0) {
            GL20.glDeleteProgram(program);
         }

         throw var10;
      } finally {
         GL20.glDeleteShader(vertexShader);
         if (fragmentShader != 0) {
            GL20.glDeleteShader(fragmentShader);
         }
      }
   }

   private static float clamp01(float value) {
      return Math.max(0.0F, Math.min(value, 1.0F));
   }

   private static void releaseNow() {
      PROGRAMS.values().forEach(program -> GL20.glDeleteProgram(program.id()));
      PROGRAMS.clear();
      FAILED_PROGRAMS.clear();
      if (vertexArray != 0) {
         GL30.glDeleteVertexArrays(vertexArray);
         vertexArray = 0;
      }

      releaseRequested = false;
   }

   private static int compileShader(String source, int type, String name) {
      int shader = GL20.glCreateShader(type);
      GL20.glShaderSource(shader, source);
      GL20.glCompileShader(shader);
      if (GL20.glGetShaderi(shader, 35713) == 0) {
         String message = GL20.glGetShaderInfoLog(shader).trim();
         GL20.glDeleteShader(shader);
         throw new IllegalStateException(name + ": " + message);
      } else {
         return shader;
      }
   }

   private static void setCull(boolean enabled) {
      if (enabled) {
         GlStateManager._enableCull();
      } else {
         GlStateManager._disableCull();
      }
   }

   private static void discard(String shaderName) {
      بٌ program = PROGRAMS.remove(shaderName);
      if (program != null) {
         GL20.glDeleteProgram(program.id());
      }

      FAILED_PROGRAMS.add(shaderName);
   }

   private static int uniform(int program, String name) {
      return GL20.glGetUniformLocation(program, name);
   }

   private static void uploadColor(int color, int location) {
      upload(location, (color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color & 0xFF) / 255.0F);
   }

   public static boolean render(String skyState, SkyRenderState shaderName, int fogColor, float fogStrength) {
      RenderSystem.assertOnRenderThread();
      if (releaseRequested) {
         releaseNow();
      }

      بٌ program = program(shaderName);
      if (program == null) {
         return false;
      }

      MinecraftClient minecraft = MinecraftClient.getInstance();
      ClientWorld level = minecraft.world;
      Camera camera = minecraft.gameRenderer.getCamera();
      if (level != null && camera.isReady()) {
         float partialTick = camera.getLastTickProgress();
         float fov = minecraft.gameRenderer.getFov(camera, partialTick, true);
         float tanHalfFov = (float)Math.tan(Math.toRadians(fov * 0.5F));
         int width = Math.max(minecraft.getWindow().getFramebufferWidth(), 1);
         int height = Math.max(minecraft.getWindow().getFramebufferHeight(), 1);
         float aspect = (float)width / height;
         float rain = clamp01(1.0F - skyState.rainGradient);
         float thunder = clamp01(level.getThunderGradient(partialTick));
         float time = (float)(System.nanoTime() - START_NANOS) / 1.0E9F;
         float dayTime = normalizeAngle(skyState.sunAngle);
         float sunX = -((float)Math.sin(skyState.sunAngle));
         float sunY = (float)Math.cos(skyState.sunAngle);
         int previousProgram = GL11.glGetInteger(35725);
         int previousVertexArray = GL11.glGetInteger(34229);
         boolean depthTest = GL11.glIsEnabled(2929);
         boolean blend = GL11.glIsEnabled(3042);
         boolean cull = GL11.glIsEnabled(2884);
         boolean scissor = GL11.glIsEnabled(3089);
         boolean depthMask = GL11.glGetBoolean(2930);
         ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.captureFramebufferState();

         try {
            ChromaRenderer.bindMainFramebuffer();
            GlStateManager._disableDepthTest();
            GlStateManager._depthMask(false);
            GlStateManager._disableBlend();
            GlStateManager._disableCull();
            GlStateManager._disableScissorTest();
            GL20.glUseProgram(program.id());
            upload(program.time(), time);
            uploadColor(program.skyColor(), skyState.skyColor);
            upload(program.cameraForward(), camera.getHorizontalPlane());
            upload(program.cameraLeft(), camera.getDiagonalPlane());
            upload(program.cameraUp(), camera.getVerticalPlane());
            upload(program.sunDirection(), sunX, sunY, 0.0F);
            upload(program.tanHalfFov(), tanHalfFov);
            upload(program.aspect(), aspect);
            upload(program.dayTime(), dayTime);
            upload(program.rain(), rain);
            upload(program.thunder(), thunder);
            uploadColor(program.fogColor(), fogColor);
            upload(program.fogStrength(), clamp01(fogStrength));
            GL30.glBindVertexArray(vertexArray());
            GL11.glDrawArrays(4, 0, 3);
            return true;
         } catch (Throwable var33) {
            LOGGER.error("Failed to render custom sky shader '{}'", shaderName, var33);
            discard(shaderName);
            return false;
         } finally {
            GL30.glBindVertexArray(previousVertexArray);
            GL20.glUseProgram(previousProgram);
            GlStateManager._depthMask(depthMask);
            setDepthTest(depthTest);
            setBlend(blend);
            setCull(cull);
            setScissor(scissor);
            ChromaRenderer.restoreFramebufferState(framebufferState);
         }
      } else {
         return false;
      }
   }
}
