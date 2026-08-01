package ru.metaculture.protection;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "AutoLes",
   O0000000000 = Category.Player,
   O000000000 = "Автоматически фармит для вас лес, и зарабатывает на ReallyWorld"
)
public class AutoLes extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Радиус", 4.0F, 1.0F, 6.0F, 0.5F, false);
   public final BooleanSetting O000000000O0 = new BooleanSetting("Махать рукой", true);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Авто-сдача", true);
   public final BooleanSetting O000000000O000 = new BooleanSetting("AutoPay", false);
   public final TextSetting O000000000O00O = new TextSetting("Ник для перевода денег", "");
   public final NumberSetting O000000000O0O = new NumberSetting("Кол-во монет", 1000.0F, 500.0F, 25000.0F, 1000.0F, false)
      .O00000000(() -> !this.O000000000O000.O0000000000());
   public final NumberSetting O000000000O0O0 = new NumberSetting("Расписание/с", 20.0F, 1.0F, 60.0F, 1.0F, false);
   private final Map<BlockPos, BlockState> O000000000O0OO = new ConcurrentHashMap<>();
   private final Map<BlockPos, Long> O000000000OO = new ConcurrentHashMap<>();
   private final Set<BlockPos> O000000000OO0 = ConcurrentHashMap.newKeySet();
   private long O000000000OO00 = 0L;
   private long O000000000OO0O = 0L;
   private long O000000000OOO = 0L;
   private BlockPos O000000000OOO0 = null;

   public AutoLes() {
      this.O00000000(
         new Setting[]{
            this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O0000000000O0O();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O0000000000O00();
      this.O0000000000O0O();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         long var2 = System.currentTimeMillis();
         if (this.O000000000O00.O0000000000() && (float)(var2 - this.O000000000OO00) > this.O000000000O0O0.O0000000000() * 500.0F) {
            O0000000000.getNetworkHandler().sendChatCommand("sellwood");
            this.O000000000OO00 = var2;
         }

         if (this.O000000000O000.O0000000000() && (float)(var2 - this.O000000000OO0O) > this.O000000000O0O0.O0000000000() * 500.0F + 200.0F) {
            O0000000000.getNetworkHandler().sendChatCommand("pay " + this.O000000000O00O.O0000000000() + " " + (int)this.O000000000O0O.O0000000000());
            this.O000000000OO0O = var2;
         }

         this.O00000000(var2);
         this.O000000000(var2);
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (o0000000O000OO.O00000000000() instanceof PlayerActionC2SPacket var2) {
            if (var2.getAction() == Action.STOP_DESTROY_BLOCK || var2.getAction() == Action.START_DESTROY_BLOCK) {
               this.O0000000000(var2.getPos());
            }
         } else if (o0000000O000OO.O00000000000() instanceof PlayerInteractBlockC2SPacket var3) {
            if (O0000000000.player.getStackInHand(var3.getHand()).getItem() instanceof BlockItem) {
               BlockPos var7 = var3.getBlockHitResult().getBlockPos().offset(var3.getBlockHitResult().getSide());
               this.O000000000OO0.add(var7);
               this.O000000000O0OO.remove(var7);
               this.O000000000OO.remove(var7);
            }
         } else if (o0000000O000OO.O00000000000() instanceof BlockUpdateS2CPacket var4) {
            this.O00000000(o0000000O000OO, var4);
         }
      }
   }

   private void O00000000(long l) {
      if (this.O000000000OOO0 != null && (!this.O00000000(this.O000000000OOO0) || !this.O000000000(this.O000000000OOO0))) {
         this.O000000000OOO0 = null;
      }

      if (this.O000000000OOO0 == null) {
         this.O0000000000O0();
      }

      if (this.O000000000OOO0 != null && l - this.O000000000OOO > 0L) {
         O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, this.O000000000OOO0, Direction.UP));
         O0000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, this.O000000000OOO0, Direction.DOWN));
         this.O000000000OOO = l;
      }
   }

   private void O0000000000O0() {
      int var1 = (int)this.O000000000O.O0000000000();
      BlockPos var2 = O0000000000.player.getBlockPos();
      double var3 = Double.MAX_VALUE;
      BlockPos var5 = null;

      for (BlockPos var7 : BlockPos.iterate(var2.add(-var1, -var1, -var1), var2.add(var1, var1, var1))) {
         if (this.O00000000(var7)) {
            double var8 = O0000000000.player.squaredDistanceTo(var7.toCenterPos());
            if (var8 <= var1 * var1 && var8 < var3) {
               var3 = var8;
               var5 = var7.toImmutable();
            }
         }
      }

      this.O000000000OOO0 = var5;
   }

   private boolean O00000000(BlockPos blockPos) {
      return O0000000000.world.getBlockState(blockPos).isIn(BlockTags.LOGS);
   }

   private boolean O000000000(BlockPos blockPos) {
      float var2 = this.O000000000O.O0000000000();
      return O0000000000.player.squaredDistanceTo(blockPos.toCenterPos()) <= var2 * var2;
   }

   private void O0000000000(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      if (!var2.isAir()) {
         this.O000000000O0OO.put(blockPos, var2);
         this.O000000000OO.put(blockPos, System.currentTimeMillis());
         this.O00000000(blockPos, var2);
      }
   }

   private void O00000000(O0000000O000OO o0000000O000OO, BlockUpdateS2CPacket blockUpdateS2CPacket) {
      BlockPos var3 = blockUpdateS2CPacket.getPos();
      BlockState var4 = blockUpdateS2CPacket.getState();
      if (this.O000000000O0OO.containsKey(var3)) {
         BlockState var5 = this.O000000000O0OO.get(var3);
         if (var4.isAir() || !var4.equals(var5)) {
            o0000000O000OO.O000000000();
            this.O00000000(var3, var5);
         }
      } else if (this.O000000000OO0.contains(var3) && var4.isAir()) {
         o0000000O000OO.O000000000();
         O0000000000.execute(() -> {
            if (O0000000000.world != null) {
               O0000000000.world.setBlockState(var3, O0000000000.world.getBlockState(var3), 0);
            }
         });
      }
   }

   private void O000000000(long l) {
      this.O000000000O0OO.forEach((blockPos, blockState) -> {
         BlockState var5 = O0000000000.world.getBlockState(blockPos);
         if (!var5.equals(blockState)) {
            O0000000000.world.setBlockState(blockPos, blockState, 0);
            if (!var5.isAir()) {
               this.O000000000OO.put(blockPos, l);
            }
         }

         for (Direction var9 : Direction.values()) {
            BlockPos var10 = blockPos.offset(var9);
            if (this.O000000000O0OO.containsKey(var10)) {
               BlockState var11 = this.O000000000O0OO.get(var10);
               if (!O0000000000.world.getBlockState(var10).equals(var11)) {
                  O0000000000.world.setBlockState(var10, var11, 0);
               }
            }
         }
      });
      this.O000000000OO.entrySet().removeIf(entry -> {
         if (l - entry.getValue() > 300000L) {
            this.O000000000O0OO.remove(entry.getKey());
            return true;
         } else {
            return false;
         }
      });
   }

   private void O00000000(BlockPos blockPos, BlockState blockState) {
      O0000000000.execute(() -> {
         if (O0000000000.world != null) {
            O0000000000.world.setBlockState(blockPos, blockState, 0);
         }
      });
   }

   private void O0000000000O00() {
      if (O0000000000.world != null) {
         O0000000000.execute(() -> {
            for (BlockPos var2 : this.O000000000O0OO.keySet()) {
               O0000000000.world.setBlockState(var2, Blocks.AIR.getDefaultState(), 0);
            }
         });
      }
   }

   private void O0000000000O0O() {
      this.O000000000OOO0 = null;
      this.O000000000OO00 = 0L;
      this.O000000000OO0O = 0L;
      this.O000000000OOO = 0L;
      this.O000000000O0OO.clear();
      this.O000000000OO0.clear();
      this.O000000000OO.clear();
   }
}
