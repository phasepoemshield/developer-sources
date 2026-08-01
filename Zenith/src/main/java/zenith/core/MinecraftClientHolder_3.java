package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.VertexFormat.LootPool96;

public class MinecraftClientHolder_3 {
   private static net.minecraft.client.MinecraftClient l1II11IllIl1IIII1l1lIllI1l1 = net.minecraft.client.MinecraftClient.getInstance();
   private static StringHolder_28 l1IIlIIIIlllIl;
   private static final String IIIl11I1I11Il11lIl11I11I11 = "sirius_aqua";
   private static final Map<String, StringHolder_28> II1lllllII11IIlIlII1l11I1l1I1 = new HashMap<>();
   private static final Set<String> ll1111lllIIlIIIIl1I1I1 = new HashSet<>();
   private static SimpleFramebuffer ll11I11l11I1IlllI1I1;
   private static boolean initialized = false;

   public static void llIl1II1I111IlIIlIl() {
      if (!initialized) {
         try {
            l1IIlIIIIlllIl = Inventory("sirius_aqua");
            initialized = true;
         } catch (Exception exception) {
            System.err.println("Failed to initialize hand shaders!");
            exception.printStackTrace();
         }
      }
   }

   public static StringHolder_28 Information(String s) {
      if (s == null || s.isBlank()) {
         return l1IIlIIIIlllIl;
      } else if (ll1111lllIIlIIIIl1I1I1.contains(s)) {
         return l1IIlIIIIlllIl;
      } else {
         try {
            return Inventory(s);
         } catch (Exception exception) {
            ll1111lllIIlIIIIl1I1I1.add(s);
            System.err.println("Failed to initialize hand shader: " + s);
            exception.printStackTrace();
            return l1IIlIIIIlllIl;
         }
      }
   }

   private static StringHolder_28 Inventory(String s) {
      StringHolder_28 ll1111il1l1l1lii111 = II1lllllII11IIlIlII1l11I1l1I1.get(s);
      if (ll1111il1l1l1lii111 == null) {
         ll1111il1l1l1lii111 = new StringHolder_28("hand", s, "smoke");
         II1lllllII11IIlIlII1l11I1l1I1.put(s, ll1111il1l1l1lii111);
      }

      if ("sirius_aqua".equals(s)) {
         l1IIlIIIIlllIl = ll1111il1l1l1lii111;
      }

      return ll1111il1l1l1lii111;
   }

   public static void IlIl1lll1Il11I1Illll1IIl() {
      if (l1II11IllIl1IIII1l1lIllI1l1 != null && l1II11IllIl1IIII1l1lIllI1l1.getWindow() != null) {
         int i = l1II11IllIl1IIII1l1lIllI1l1.getWindow().getFramebufferWidth();
         int j = l1II11IllIl1IIII1l1lIllI1l1.getWindow().getFramebufferHeight();
         if (ll11I11l11I1IlllI1I1 == null || ll11I11l11I1IlllI1I1.textureWidth != i || ll11I11l11I1IlllI1I1.textureHeight != j) {
            if (ll11I11l11I1IlllI1I1 != null) {
               ll11I11l11I1IlllI1I1.delete();
            }

            ll11I11l11I1IlllI1I1 = new SimpleFramebuffer(i, j, true);
         }
      }
   }

   public static void I11IIll1l1I1I1Il1I1() {
      RenderSystem.assertOnRenderThread();
      net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION);
      BufferBuilder.vertex(-1.0F, -1.0F, 0.0F);
      BufferBuilder.vertex(1.0F, -1.0F, 0.0F);
      BufferBuilder.vertex(1.0F, 1.0F, 0.0F);
      BufferBuilder.vertex(-1.0F, 1.0F, 0.0F);
      net.minecraft.client.render.BufferRenderer.draw(BufferBuilder.end());
   }

   public static StringHolder_28 ll1lI1l111I1ll1I1I() {
      return l1IIlIIIIlllIl;
   }

   public static SimpleFramebuffer I1IllIIl1l111Ill1ll1l1IIl11() {
      return ll11I11l11I1IlllI1I1;
   }

   public static boolean isInitialized() {
      return initialized;
   }
}
