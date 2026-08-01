package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class KillEffect extends Helper242 {
   private final Setting2 volume = new Setting2("Volume", "Volume").method2086(100.0F).method2079(0, 100);
   private final Setting3 playSound = new Setting3("Play Sound", "Play Sound").method2201(true);
   private final Setting3 mobs = new Setting3("Mobs", "Mobs").method2201(false);
   private final Setting5 effectType = new Setting5("Effect Type", "Effect Type").method2381("Cross", "Soul").method2383("Soul");
   private final Map<Entity, Helper220> renderEntities = new ConcurrentHashMap<>();

   public KillEffect() {
      super("KillEffect", "Kill Effect", Helper269.RENDER);
      this.setup(new Helper264[]{this.volume, this.playSound, this.mobs, this.effectType});
   }

   @Helper104
   public void method1969(Event19 var1) {
      if (mc.world != null && mc.player != null) {
         Entity var2 = var1.method3920();
         if (var2 instanceof LivingEntity) {
            if (this.mobs.method2200() || var2 instanceof PlayerEntity) {
               if (var2 != mc.player && !this.renderEntities.containsKey(var2)) {
                  if (this.playSound.method2200()) {
                     mc.world.playSound(mc.player, var2.getBlockPos(), Helper56.ORTHODOX, SoundCategory.BLOCKS, this.volume.method2082() / 100.0F, 1.0F);
                  }

                  OtherClientPlayerEntity var3 = null;
                  if (this.effectType.method2385("Soul") && var2 instanceof PlayerEntity) {
                     var3 = new OtherClientPlayerEntity(mc.world, ((PlayerEntity)var2).getGameProfile());
                     var3.setPitch(-30.0F);
                     var3.setYaw(var2.getYaw());
                     var3.headYaw = var2.getYaw();
                     var3.bodyYaw = var2.getYaw();
                     var3.setCustomNameVisible(false);
                     var3.setCustomName(Text.literal("Ghost_" + ((PlayerEntity)var2).getGameProfile().getId()));
                     mc.world.addEntity(var3);
                  }

                  this.renderEntities.put(var2, new Helper220(System.currentTimeMillis(), var2.getYaw(), var2.getPos(), var2, var3));
               }
            }
         }
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.world != null && mc.player != null) {
         MatrixStack var2 = var1.method3708();
         float var3 = var1.method3709();
         ArrayList var4 = new ArrayList();
         this.renderEntities.forEach((var4x, var5) -> {
            if (System.currentTimeMillis() - var5.method1962() > 3000L) {
               var4.add(var4x);
               if (var5.method1968() != null) {
                  mc.world.removeEntity(var5.method1968().getId(), RemovalReason.DISCARDED);
               }
            } else {
               float var6 = (float)(System.currentTimeMillis() - var5.method1962()) / 3000.0F;
               if (this.effectType.method2385("Cross")) {
                  int var7 = new Color(255, 255, 255, (int)(150.0F * (1.0F - var6))).getRGB();
                  float var8 = (float)Math.toRadians(var5.method1963() + 95.0F);
                  Vec3d var9 = var5.method1964();
                  Helper183.method1563(var9.add(0.0, 0.0, 0.0), var9.add(0.0, 3.0, 0.0), var7, 5.0F, true);
                  float var10 = 1.0F;
                  float var11 = 2.3F;
                  Vec3d var12 = var9.add(-var10 * Math.sin(var8), var11, var10 * Math.cos(var8));
                  Vec3d var13 = var9.add(var10 * Math.sin(var8), var11, -var10 * Math.cos(var8));
                  Helper183.method1563(var12, var13, var7, 5.0F, true);
               } else if (this.effectType.method2385("Soul")) {
                  float var14 = var6 * 3.0F;
                  int var15 = (int)(255.0F * (1.0F - var6));
                  Vec3d var16 = var5.method1964().add(0.0, var14, 0.0);
                  net.minecraft.entity.Entity var17 = var5.method1965();
                  if (var5.method1968() != null) {
                     var17 = var5.method1968();
                     var17.setPos(var16.x, var16.y, var16.z);
                  }

                  Helper183.method1541((Entity)var17, var16, var5.method1963(), var15, var2, var3);
               }
            }
         });
         var4.forEach(this.renderEntities::remove);
      }
   }
}
