package org.zenith.core;

import org.zenith.event.PacketSendEvent;
import org.zenith.module.Module;
import org.zenith.module.TridentAimbot;

import org.zenith.managers.EmoteMetadata;
import org.zenith.ZenithClient;

import org.zenith.module.AutoCraft;

import org.zenith.event.Event18Ext3;
import org.zenith.event.EventMouseButton;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;

public final class ContainerScanner {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final AutoCraft autoCraft2;
   public WaypointData zClass047 = WaypointData.call100();
   public boolean boolean185;

   public boolean Easing(EventMouseButton var1) {
      if (this.zClass047.call038()) {
         return false;
      } else if (AutoCraft.minecraftClient3.player != null
         && AutoCraft.minecraftClient3.world != null) {
         if (var1.TridentAimbot() != 1 || var1.ContainerScanner() != 1) {
            return true;
         } else if (AutoCraft.minecraftClient3.currentScreen != null) {
            return true;
         } else {
            if (AutoCraft.minecraftClient3.crosshairTarget instanceof BlockHitResult blockhitresult
               && AutoCraft.minecraftClient3.crosshairTarget.getType() == Type.BLOCK) {
               ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.autoCraft2
                  .CloudRouter(
                     this.zClass047.call061(), this.zClass047.call062()
                  );
               if (iiilili1lli1i11lilillliiii1iii == null) {
                  this.zClass047 = WaypointData.call100();
                  this.call155();
                  return true;
               }

               BlockPos blockpos = blockhitresult.getBlockPos();
               if (this.zClass047.call079() == WaypointKind.val191
                  && AutoCraft.minecraftClient3.world.getBlockState(blockpos).getBlock() != Blocks.CRAFTING_TABLE) {
                  this.autoCraft2
                     .VisualSettingsStore(
                        "\u042d\u0442\u043e\u0442 \u0431\u043b\u043e\u043a \u043d\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0432\u0435\u0440\u0441\u0442\u0430\u043a\u043e\u043c"
                     );
                  return true;
               }

               if ((
                     this.zClass047.call079() == WaypointKind.val189
                        || this.zClass047.call079() == WaypointKind.val190
                  )
                  && !this.ItemRegistry(blockpos)) {
                  this.autoCraft2
                     .VisualSettingsStore(
                        "\u042d\u0442\u043e\u0442 \u0442\u0438\u043f \u0441\u0443\u043d\u0434\u0443\u043a\u043e\u0432 \u043f\u043e\u043a\u0430 \u043d\u0435 \u043f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u0435\u0442\u0441\u044f"
                     );
                  return true;
               }

               BlockPosEntry iili1i11ii1l1l11il = BlockPosEntry.FileLogger(blockpos);
               if (this.zClass047.call079() == WaypointKind.val189
                  && !this.zClass047.double127().isBlank()) {
                  iiilili1lli1i11lilillliiii1iii.call034()
                     .put(this.zClass047.double127(), iili1i11ii1l1l11il);
                  this.autoCraft2.call184();
                  this.autoCraft2
                     .PacketSendEvent(
                        "\u0421\u0443\u043d\u0434\u0443\u043a-\u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d \u0434\u043b\u044f "
                           + iiilili1lli1i11lilillliiii1iii.on23(
                              this.zClass047.double127(), this.autoCraft2
                           )
                     );
               } else if (this.zClass047.call079() == WaypointKind.val190) {
                  iiilili1lli1i11lilillliiii1iii.on23(iili1i11ii1l1l11il);
                  this.autoCraft2
                     .PacketSendEvent(
                        "\u0421\u0443\u043d\u0434\u0443\u043a-\u0441\u043a\u043b\u0430\u0434 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d \u0434\u043b\u044f "
                           + iiilili1lli1i11lilillliiii1iii.getDisplayName()
                     );
               } else if (this.zClass047.call079() == WaypointKind.val191) {
                  iiilili1lli1i11lilillliiii1iii.UiAnimation(iili1i11ii1l1l11il);
                  this.autoCraft2
                     .PacketSendEvent(
                        "\u0412\u0435\u0440\u0441\u0442\u0430\u043a \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d \u0434\u043b\u044f "
                           + iiilili1lli1i11lilillliiii1iii.getDisplayName()
                     );
               }

               this.zClass047 = WaypointData.call100();
               this.call155();
               ZenithClient.on23().TradeGuardService().save();
               return true;
            }

            this.autoCraft2
               .VisualSettingsStore(
                  "\u041d\u0430\u0432\u0435\u0434\u0438\u0442\u0435\u0441\u044c \u043d\u0430 \u0431\u043b\u043e\u043a \u0434\u043b\u044f \u043f\u0440\u0438\u0432\u044f\u0437\u043a\u0438 \u0410\u0432\u0442\u043e\u043a\u0440\u0430\u0444\u0442\u0430"
               );
            return true;
         }
      } else {
         return true;
      }
   }

   public ContainerScanner(AutoCraft var1) {
      this.autoCraft2 = var1;
   }

   public boolean call149() {
      return !this.zClass047.call038();
   }

   public String call116() {
      return this.zClass047.call038() ? "" : this.zClass047.Easing(this.autoCraft2);
   }

   public void call240() {
      this.zClass047 = WaypointData.call100();
   }

   public void reset() {
      this.zClass047 = WaypointData.call100();
      this.EmoteMetadata(true);
   }

   public void Event18Ext3(String var1) {
      ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.autoCraft2.call086();
      if (iiilili1lli1i11lilillliiii1iii != null && var1 != null && !var1.isBlank()) {
         this.zClass047 = new WaypointData(
            WaypointKind.val189,
            iiilili1lli1i11lilillliiii1iii.string112(),
            iiilili1lli1i11lilillliiii1iii.getId(),
            var1
         );
         this.call117();
         AutoCraft.minecraftClient3.setScreen(null);
      }
   }

   public void string89() {
      ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.autoCraft2.call086();
      if (iiilili1lli1i11lilillliiii1iii != null) {
         this.zClass047 = new WaypointData(
            WaypointKind.val190,
            iiilili1lli1i11lilillliiii1iii.string112(),
            iiilili1lli1i11lilillliiii1iii.getId(),
            ""
         );
         this.call117();
         AutoCraft.minecraftClient3.setScreen(null);
      }
   }

   public void path6() {
      ItemFilterRules iiilili1lli1i11lilillliiii1iii = this.autoCraft2.call086();
      if (iiilili1lli1i11lilillliiii1iii != null) {
         this.zClass047 = new WaypointData(
            WaypointKind.val191,
            iiilili1lli1i11lilillliiii1iii.string112(),
            iiilili1lli1i11lilillliiii1iii.getId(),
            ""
         );
         this.call117();
         AutoCraft.minecraftClient3.setScreen(null);
      }
   }

   public void call117() {
      if (!this.boolean185 && !this.autoCraft2.isEnabledRaw()) {
         EventManager.register(this.autoCraft2);
         this.boolean185 = true;
      }
   }

   public void call155() {
      this.EmoteMetadata(false);
   }

   public void EmoteMetadata(boolean var1) {
      if (this.boolean185) {
         if (!var1 && this.autoCraft2.isEnabledRaw()) {
            this.boolean185 = false;
         } else {
            EventManager.unregister(this.autoCraft2);
            this.boolean185 = false;
         }
      }
   }

   public boolean ItemRegistry(BlockPos var1) {
      BlockEntity blockentity = AutoCraft.minecraftClient3.world.getBlockEntity(var1);
      return blockentity instanceof ChestBlockEntity || blockentity instanceof BarrelBlockEntity || blockentity instanceof ShulkerBoxBlockEntity;
   }
}
