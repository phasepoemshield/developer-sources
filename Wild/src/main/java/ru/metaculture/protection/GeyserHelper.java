package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "GeyserHelper",
   O0000000000 = Category.Player,
   O000000000 = "Подсвечивает лут который можно слутать с ивента 'Гейзер' на FunTime"
)
public class GeyserHelper extends Module {
   private final Map<ItemEntity, Long> O000000000O000 = new ConcurrentHashMap<>();
   private final List<GeyserHelper.W128> O000000000O00O = new ArrayList<>();
   private final Map<Integer, Long> O000000000O0O = new ConcurrentHashMap<>();
   public final BooleanSetting O000000000O = new BooleanSetting("Синхронизация с NameTags", true);
   public final ModeSetting O000000000O0 = new ModeSetting("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр").O00000000(this.O000000000O::O0000000000);
   public final NumberSetting O000000000O00 = new NumberSetting("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true).O00000000(this.O000000000O::O0000000000);
   private final O0000000OOO00 O000000000O0O0 = new O0000000OOO00() {};
   private boolean O000000000O0OO = false;
   private float O000000000OO = 0.0F;
   private float O000000000OO0 = 0.0F;
   private float O000000000OO00 = 0.0F;
   private float O000000000OO0O = 0.0F;
   private float O000000000OOO = 0.0F;
   private boolean O000000000OOO0 = false;
   private long O000000000OOOO = 0L;
   private final List<GeyserHelper.W127> O00000000O = new ArrayList<>();
   private int O00000000O0;
   private int O00000000O00;
   private float O00000000O000 = 1.0F;
   private String O00000000O0000 = "Тёмный";

   public GeyserHelper() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
      this.O000000000O0O0.O00000000(this.O000000000O);
      this.O000000000O0O0.O00000000(this.O000000000O0);
      this.O000000000O0O0.O00000000(this.O000000000O00);
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000O0O.clear();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O000000000O000.clear();
      this.O000000000O00O.clear();
      this.O000000000O0O.clear();
      this.O000000000O0OO = false;
      this.O000000000OOO = 0.0F;
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.world != null) {
         if (o0000000O000OO.O00000000000() instanceof PlaySoundS2CPacket var2) {
            String var4 = ((SoundEvent)var2.getSound().value()).toString();
            if (this.O00000000(var4)) {
               this.O00000000(var2.getX(), var2.getY(), var2.getZ());
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.world != null) {
         this.O000000000O000.keySet().removeIf(itemEntity -> !itemEntity.isAlive() || itemEntity.getStack().isEmpty());
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (O0000000000.world != null && O0000000000.player != null) {
         this.O00000000O.clear();
         this.O0000000000O0();
         float var2 = O0000000000.getRenderTickCounter().getTickProgress(true);
         RenderManager var3 = o0000000O00O.O00000000000();
         Camera var4 = O0000000000.gameRenderer.getCamera();
         Vec3d var5 = var4.getPos();
         float var6 = (float)O0000000000.mouse.getX();
         float var7 = (float)O0000000000.mouse.getY();
         boolean var8 = O0000000000.currentScreen instanceof ChatScreen;
         this.O000000000O00O.clear();
         NameTags var9 = this.O0000000000O00();
         boolean var10 = var9 != null && var9.O0000000000000 && var9.O000000000O0.O000000000("Предметы");
         HashSet var11 = new HashSet();
         if (!this.O000000000O000.isEmpty()) {
            for (Entry var13 : this.O000000000O000.entrySet()) {
               ItemEntity var14 = (ItemEntity)var13.getKey();
               Vec3d var15 = var14.getLerpedPos(var2);
               double var16 = var10 ? 0.52 : 0.7;
               Vec3d var18 = new Vec3d(var15.x, var15.y + var16, var15.z);
               if (!(var18.squaredDistanceTo(var5) < 1.0E-6)) {
                  Vec3d var19 = O0000O000OOOOO.O00000000(var18);
                  if (!(var19.z <= 0.001F) && !(var19.z > 1.0)) {
                     double var20 = var5.distanceTo(var18);
                     var11.add(var14.getId());
                     this.O000000000O0O.putIfAbsent(var14.getId(), System.currentTimeMillis());
                     float var22 = MathHelper.clamp((float)(System.currentTimeMillis() - this.O000000000O0O.get(var14.getId())) / 300.0F, 0.0F, 1.0F);
                     float var23 = 1.0F - (float)Math.pow(1.0F - var22, 4.0);
                     this.O00000000(var3, var14, (Long)var13.getValue(), (float)var19.x, (float)var19.y, (float)var20, var10, var23);
                  }
               }
            }
         }

         this.O000000000O0O.keySet().retainAll(var11);
         this.O00000000(var3);
         if (var8) {
            boolean var24 = GLFW.glfwGetMouseButton(O0000000000.getWindow().getHandle(), 0) == 1;
            boolean var25 = var24 && !this.O000000000OOO0;
            this.O000000000OOO0 = var24;
            if (var25 && System.currentTimeMillis() - this.O000000000OOOO > 150L) {
               this.O000000000OOOO = System.currentTimeMillis();
               boolean var26 = false;

               for (GeyserHelper.W127 var30 : this.O00000000O) {
                  if (this.O00000000(var6, var7, var30.x, var30.y, var30.w, var30.h)) {
                     var26 = true;
                     this.O000000000O0OO = !this.O000000000O0OO;
                     if (this.O000000000O0OO) {
                        this.O000000000OO = var30.x;
                        this.O000000000OO0 = var30.y;
                        this.O000000000OO00 = var30.w;
                        this.O000000000OO0O = var30.h;
                     }
                     break;
                  }
               }

               if (!var26 && this.O000000000O0OO) {
                  boolean var29 = this.O00000000(var6, var7, this.O000000000OO - 250.0F, this.O000000000OO0 - 150.0F, 600.0F, 500.0F);
                  if (!var29) {
                     this.O000000000O0OO = false;
                  }
               }
            }

            float var27 = this.O000000000O0OO ? 1.0F : 0.0F;
            this.O000000000OOO = this.O000000000OOO + (var27 - this.O000000000OOO) * 0.15F;
            if (this.O000000000OOO > 0.01F) {
               O00000O0O00O.O00000000(
                  var3,
                  this.O000000000O0O0,
                  this.O000000000OO,
                  this.O000000000OO0,
                  this.O000000000OO00,
                  this.O000000000OO0O,
                  O0000000000.getWindow().getScaledWidth(),
                  O0000000000.getWindow().getScaledHeight(),
                  this.O000000000OOO,
                  var6,
                  var7,
                  var25,
                  var24
               );
            }
         } else {
            this.O000000000O0OO = false;
            this.O000000000OOO = 0.0F;
            this.O000000000OOO0 = false;
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ItemEntity itemEntity, long l, float f, float g, float h, boolean bl, float i) {
      float var10 = (float)MathHelper.clamp(16.0 / Math.max((double)h, 12.0), 0.75, 1.15);
      float var11 = 6.0F * var10;
      ItemStack var12 = itemEntity.getStack();
      float var13 = 24.0F * var10;
      long var14 = System.currentTimeMillis() - l;
      String var16 = String.format("%.0f сек", (float)var14 / 1000.0F);
      float var17 = 6.0F * var10;
      float var18 = 20.0F * var10;
      float var19 = RenderManager.O00000000(FontRegistry.O00000000, var16, var13).O00000000 + var17 * 2.0F;
      if (bl) {
         float var20 = 12.0F * var10;
         float var21 = var20 * i;
         float var22 = g + var21;
         float var23 = f - var19 / 2.0F;
         this.O00000000(o0000O00OO0O0, var23, var22, var19, var18, var11, i);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var23 + var17, var22 + 14.0F * var10, var13, var16, this.O00000000(this.O00000000O00, i));
         this.O00000000O.add(new GeyserHelper.W127(var23, var22, var19, var18));
      } else {
         float var28 = 8.0F * var10 * (1.0F - i);
         float var29 = g + var28;
         float var30 = 22.0F * var10;
         float var31 = 4.0F * var10;
         float var24 = var30 + var31 + var19;
         float var25 = f - var24 / 2.0F;
         this.O00000000(o0000O00OO0O0, var25, var29, var30, var30, var11, i);
         float var26 = var29 + (var30 - var18) / 2.0F;
         this.O00000000(o0000O00OO0O0, var25 + var30 + var31, var26, var19, var18, var11, i);
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000, var25 + var30 + var31 + var17, var26 + 14.0F * var10, var13, var16, this.O00000000(this.O00000000O00, i)
         );
         float var27 = (var30 - 16.0F * var10) / 2.0F;
         this.O000000000O00O.add(new GeyserHelper.W128(var12, var25 + var27, var29 + var27, var25, var29, var30, itemEntity.getId(), var10));
         this.O00000000O.add(new GeyserHelper.W127(var25, var29, var24, var30));
      }
   }

   private void O0000000000O0() {
      NameTags var1 = this.O0000000000O00();
      boolean var2 = this.O000000000O.O0000000000() && var1 != null;
      String var3 = var2 ? var1.O000000000OOO0.O0000000000() : this.O000000000O0.O0000000000();
      float var4 = var2 ? var1.O00000000O00O0.O0000000000() : this.O000000000O00.O0000000000();
      if (var3.equals("Светлый")) {
         this.O00000000O0 = RenderManager.W382.O0000000000(240, 240, 245, (int)(255.0F * var4));
         this.O00000000O00 = RenderManager.W382.O0000000000(30, 30, 30, 255);
      } else if (var3.equals("Блюр")) {
         this.O00000000O0 = RenderManager.W382.O0000000000(10, 10, 10, (int)(120.0F * var4));
         this.O00000000O00 = RenderManager.W382.O0000000000(250, 250, 250, 255);
      } else {
         this.O00000000O0 = RenderManager.W382.O0000000000(25, 25, 26, (int)(255.0F * var4));
         this.O00000000O00 = RenderManager.W382.O0000000000(240, 240, 240, 255);
      }

      this.O00000000O000 = var4;
      this.O00000000O0000 = var3;
   }

   private NameTags O0000000000O00() {
      try {
         return (NameTags)WildClient.O00000000.O000000000.O000000000(NameTags.class);
      } catch (Exception var2) {
         return null;
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      float var8 = this.O00000000O000 * k;
      if (!(var8 <= 0.05F)) {
         if (this.O00000000O0000.equals("Блюр")) {
            o0000O00OO0O0.O00000000(23.0F);
            o0000O00OO0O0.O00000000(f, g, h, i, j, var8);
         }

         int var9 = this.O00000000(this.O00000000O0, k);
         o0000O00OO0O0.O00000000(f, g, h, i, j, var9);
      }
   }

   private int O00000000(int i, float f) {
      int var3 = i >> 24 & 0xFF;
      int var4 = i >> 16 & 0xFF;
      int var5 = i >> 8 & 0xFF;
      int var6 = i & 0xFF;
      return RenderManager.W382.O0000000000(var4, var5, var6, (int)(var3 * f));
   }

   private boolean O00000000(String string) {
      String var2 = string.toLowerCase();
      return var2.contains("extinguish") || var2.contains("fizz") || var2.contains("burn") || var2.contains("lava");
   }

   private void O00000000(double d, double e, double f) {
      O0000000000.execute(() -> {
         if (O0000000000.world != null) {
            for (Entity var8 : O0000000000.world.getEntities()) {
               if (var8 instanceof ItemEntity var9 && var9.squaredDistanceTo(d, e, f) <= 9.0) {
                  this.O000000000O000.putIfAbsent(var9, System.currentTimeMillis());
               }
            }
         }
      });
   }

   private boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   private void O00000000(RenderManager o0000O00OO0O0) {
      if (o0000O00OO0O0 != null && !this.O000000000O00O.isEmpty()) {
         for (GeyserHelper.W128 var3 : this.O000000000O00O) {
            float var4 = ItemRenderUtil.O00000000(var3.clipX());
            float var5 = ItemRenderUtil.O00000000(var3.clipY());
            float var6 = Math.max(1.0F, ItemRenderUtil.O00000000(var3.clipSize()));
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var4, var5, var6, var6, var6 * 0.27F, var6 * 0.27F, var6 * 0.27F, var6 * 0.27F);

            try {
               ItemRenderUtil.O00000000(
                  o0000O00OO0O0,
                  var3.stack(),
                  ItemRenderUtil.O00000000(var3.x()),
                  ItemRenderUtil.O00000000(var3.y()),
                  ItemRenderUtil.O0000000000(var3.scale()),
                  var3.seed(),
                  true,
                  var3.seed()
               );
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         this.O000000000O00O.clear();
      }
   }

   record W127(float x, float y, float w, float h) {
   }

   record W128(ItemStack stack, float x, float y, float clipX, float clipY, float clipSize, int seed, float scale) {
   }
}
