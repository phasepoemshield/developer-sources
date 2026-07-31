package l;

import antidaunleak.api.annotation.Native;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.util.math.MathHelper;

public class AutoPilot extends Helper242 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   public ItemEntity target;
   private float lastYaw;
   private float lastPitch;
   private float targetYaw;
   private float targetPitch;
   Helper336 rot = new Helper336(0.0F, 0.0F);

   public AutoPilot() {
      super("AutoPilot", "Xyeta", Helper269.MISC);
   }

   public static AutoPilot method1799() {
      return Helper222.method1979(AutoPilot.class);
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.getNetworkHandler() != null) {
         this.target = this.method1800();
         if (this.target != null) {
            double var2 = this.target.getPos().getX() - mc.player.getPos().getX();
            double var4 = this.target.getPos().getY() - (mc.player.getPos().getY() + mc.player.getEyeHeight(mc.player.getPose()));
            double var6 = this.target.getPos().getZ() - mc.player.getPos().getZ();
            this.targetYaw = (float)(Math.atan2(var6, var2) * 180.0 / Math.PI - 90.0);
            this.targetPitch = (float)(-Math.atan2(var4, Math.sqrt(var2 * var2 + var6 * var6)) * 180.0 / Math.PI);
            float var8 = 1024.0F;
            float var9 = MathHelper.wrapDegrees(this.targetYaw - this.lastYaw);
            float var10 = MathHelper.clamp(var9, -var8, var8);
            this.lastYaw += var10;
            float var11 = MathHelper.wrapDegrees(this.targetPitch - this.lastPitch);
            float var12 = MathHelper.clamp(var11, -var8, var8);
            this.lastPitch += var12;
            mc.player.setYaw(this.lastYaw);
            mc.player.setPitch(this.lastPitch);
            this.rot.method3335(this.lastYaw);
            this.rot.method3336(this.lastPitch);
            Helper351.INSTANCE.method3502(this.rot, Helper334.DEFAULT, Helper153.HIGH_IMPORTANCE_1, this);
         } else {
            this.lastYaw = mc.player.getYaw();
            this.lastPitch = mc.player.getPitch();
         }
      } else {
         this.target = null;
      }
   }

   private ItemEntity method1800() {
      List var1 = mc.world
         .getEntitiesByClass(ItemEntity.class, mc.player.getBoundingBox().expand(50.0), var1x -> var1x.isAlive() && this.method1801(var1x))
         .stream()
         .sorted(Comparator.comparingDouble(var0 -> mc.player.squaredDistanceTo(var0)))
         .collect(Collectors.toList());
      return var1.isEmpty() ? null : (ItemEntity)var1.get(0);
   }

   private boolean method1801(ItemEntity var1) {
      ItemStack var2 = var1.getStack();
      return var2.getItem() == Items.SPAWNER
         || var2.getItem() == Items.PLAYER_HEAD
         || var2.getItem() == Items.ENCHANTED_GOLDEN_APPLE
         || var2.getItem().toString().contains("_spawn_egg");
   }

   @Override
   public void deactivate() {
      this.target = null;
      if (mc.player != null) {
         mc.getNetworkHandler()
            .sendPacket(
               new Full(
                  mc.player.getPos().getX(),
                  mc.player.getPos().getY(),
                  mc.player.getPos().getZ(),
                  mc.player.getYaw(),
                  mc.player.getPitch(),
                  mc.player.isOnGround(),
                  false
               )
            );
      }
   }
}
