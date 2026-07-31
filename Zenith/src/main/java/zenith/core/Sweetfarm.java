package zenith;

import zenith.hud.*;

import it.unimi.dsi.fastutil.ints.IntPredicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.potion.Potion;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.potion.Potions;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "SweetFarm",
   category = Category.PLAYER,
   description = ""
)
public final class Sweetfarm extends Module {
   public static final Sweetfarm lIl11Il1lIlll1ll1 = new Sweetfarm();
   private boolean I1II11lI11II1l1IIl = false;
   private boolean lII111I11I1I11I1II = false;
   private final longHolder llIl1IlIlI1 = new longHolder();
   private int l1II1lI1I1lI1lIII1l1lI1 = -1;
   private int I1lIIl11IIl1II1I1lI1l1ll = -1;
   private final longHolder lI1l1llI1 = new longHolder();
   private final Set<Integer> IlIlIlI11l1l = new HashSet<>();
   private BlockHitResult l11lIlIlI1111Il1Ill11l1lIll = null;
   private BooleanSetting llIlIllIl1111111lIl1I1l1 = new BooleanSetting("1.20.x", "module.sweetFarm.mode.desc", false);

   private Sweetfarm() {
   }

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player
               .playerScreenHandler
               .slots
               .stream()
               .filter(Slot -> Slotx.id != 40 && Slotx.getStack().getItem() == Items.SWEET_BERRIES)
               .count()
            < 20L
         && (
            !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GenericContainerScreen GenericContainerScreenx)
               || !GenericContainerScreenx.getTitle().getString().contains("Скупщик")
               || !(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler GenericContainerScreenHandlerx)
         )) {
         this.IlIlIlI11l1l.clear();
      } else if (this.lI1l1llI1.HostnameVerifierImpl(30L)) {
         this.lI1l1llI1.reset();
         if (!(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GenericContainerScreen) && this.llIl1IlIlI1.HostnameVerifierImpl(3000L)) {
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("buyer");
            this.llIl1IlIlI1.reset();
         } else if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GenericContainerScreen GenericContainerScreen
            && GenericContainerScreen.getTitle().getString().contains("Скупщик")
            && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler GenericContainerScreenHandler) {
            for (Slot Slot : l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots) {
               if (!this.IlIlIlI11l1l.contains(Slot.id)
                  && Slot.id > GenericContainerScreenHandler.getInventory().size()
                  && Slot.getStack().getItem() == Items.SWEET_BERRIES) {
                  this.IlIlIlI11l1l.add(Slot.id);
                  ListHolder_5.StringHolder_8(Slot, 0, SlotActionType.QUICK_MOVE, false);
                  return;
               }
            }

            ListHolder_5.StringHolder_8(53, 0, SlotActionType.QUICK_MOVE, false);
            l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_30 ll1iil11ii) {
      this.lII111I11I1I11I1II = false;
      this.I1II11lI11II1l1IIl = false;
      if (ZenithClient.getInstance().ZenithInternal138().HeightHandler() == null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.age % 80 == 0) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8("4", Text.of("Отметьте точку .region pos1"), 4000L);
         }
      } else if (ZenithClient.getInstance().ZenithInternal138().floatHolder_4() == null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.age % 80 == 0) {
            ZenithClient.getInstance()
               .ZenithInternal015()
               .StringHolder_8(
                  "4",
                  Text.of("Отметьте точку .region ")
                     .copy()
                     .append(
                        Text.of("pos2")
                           .copy()
                           .setStyle(
                              Style.EMPTY
                                 .withColor(
                                    II1l111II1Il11II111llllIl1.NotificationsHolder()
                                       .IllIlIll11lIlI1()
                                       .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                       .lllIlll1Ill111l111Il11II11lII()
                                 )
                           )
                     ),
                  4000L
               );
         }
      } else if (l11I1I1ll1Illll1I1l1111l1II.player
            .playerScreenHandler
            .slots
            .stream()
            .filter(Slot -> Slotx.id != 40 && Slotx.getStack().getItem() == Items.SWEET_BERRIES)
            .count()
         <= 20L) {
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GenericContainerScreen GenericContainerScreen
            && GenericContainerScreen.getTitle().getString().contains("Скупщик")
            && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler GenericContainerScreenHandler) {
            return;
         }

         int i = ListHolder_5.StringHolder_8(
            (IntPredicate)(j -> l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j).getUseAction() == UseAction.EAT)
         );
         if (i == -1) {
            TextHolder.EventImpl_27("У вас должна быт еда в хотбаре ");
            this.lI1Il11I1l1III11IIlI1lI1II11I();
         } else if (l11I1I1ll1Illll1I1l1111l1II.player.getHungerManager().getFoodLevel() <= 18) {
            if (this.l1II1lI1I1lI1lIII1l1lI1 == -1) {
               this.l1II1lI1I1lI1lIII1l1lI1 = l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot;
            }

            l11I1I1ll1Illll1I1l1111l1II.player.setYaw((float)((double)l11I1I1ll1Illll1I1l1111l1II.player.getYaw() + Math.random()));
            l11I1I1ll1Illll1I1l1111l1II.options.useKey.setPressed(true);
            l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(i);
            l11I1I1ll1Illll1I1l1111l1II.crosshairTarget = BlockHitResult.createMissed(net.minecraft.util.math.Vec3d.ZERO, Direction.UP, BlockPos.ORIGIN);
         } else if (this.l1II1lI1I1lI1lIII1l1lI1 != -1) {
            l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(this.l1II1lI1I1lI1lIII1l1lI1);
            this.l1II1lI1I1lI1lIII1l1lI1 = -1;
         } else {
            i = ListHolder_5.StringHolder_8(
               (IntPredicate)(j -> this.ZenithInternal064(l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(j)))
            );
            if (i != -1) {
               if (!l11I1I1ll1Illll1I1l1111l1II.player.isInvisible()) {
                  if (this.I1lIIl11IIl1II1I1lI1l1ll == -1) {
                     this.I1lIIl11IIl1II1I1lI1l1ll = l11I1I1ll1Illll1I1l1111l1II.player.inventory.selectedSlot;
                  }

                  l11I1I1ll1Illll1I1l1111l1II.player.setYaw((float)((double)l11I1I1ll1Illll1I1l1111l1II.player.getYaw() + Math.random()));
                  l11I1I1ll1Illll1I1l1111l1II.options.useKey.setPressed(true);
                  l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(i);
                  l11I1I1ll1Illll1I1l1111l1II.crosshairTarget = BlockHitResult.createMissed(
                     net.minecraft.util.math.Vec3d.ZERO, Direction.UP, BlockPos.ORIGIN
                  );
                  return;
               }

               if (this.I1lIIl11IIl1II1I1lI1l1ll != -1) {
                  l11I1I1ll1Illll1I1l1111l1II.player.inventory.setSelectedSlot(this.I1lIIl11IIl1II1I1lI1l1ll);
                  this.I1lIIl11IIl1II1I1lI1l1ll = -1;
                  return;
               }
            }

            List list = EventTarget(
               ZenithClient.getInstance().ZenithInternal138().HeightHandler(),
               ZenithClient.getInstance().ZenithInternal138().floatHolder_4()
            );
            BlockPos BlockPosx = list.stream()
               .filter(
                  BlockPos -> (
                           l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosxx).isOf(Blocks.DIRT)
                              || l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosxx).isOf(Blocks.GRASS_BLOCK)
                        )
                        && l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosxx.offset(Direction.UP)).isAir()
               )
               .sorted(
                  Comparator.comparing(BlockPos -> l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(net.minecraft.util.math.Vec3d.of(BlockPosxx)))
               )
               .min(Comparator.comparing(BlockPos -> 1))
               .orElse(null);
            BlockPos BlockPosx = list.stream()
               .filter(BlockPos -> {
                  BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosxx);
                  return BlockState.isOf(Blocks.SWEET_BERRY_BUSH) && (Integer)BlockState.get(SweetBerryBushBlock.AGE) == 3;
               })
               .sorted(
                  Comparator.comparing(BlockPos -> l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(net.minecraft.util.math.Vec3d.ofCenter(BlockPosxx)))
               )
               .min(Comparator.comparing(BlockPos -> 1))
               .orElse(null);
            Slot Slot = ListHolder_5.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler, Items.SWEET_BERRIES);
            net.minecraft.util.math.Vec3d Vec3d = PlayerEntityHolder.FileHolder_2(1)
               .l1l111I11I1I
               .add(
                  0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getDimensions(l11I1I1ll1Illll1I1l1111l1II.player.getPose()).eyeHeight(), 0.0
               );
            floatHolder_6 il1ll111liili1ll11liil;
            if (BlockPosx == null
               || Slot == null
               || BlockPosx != null && !(l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(BlockPosx.toCenterPos()) > 10.0)) {
               if (BlockPosx != null) {
                  il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(
                     BlockPosx.toCenterPos().add(0.0, -0.5, 0.0).subtract(Vec3d)
                  );
               } else {
                  il1ll111liili1ll11liil = null;
               }
            } else {
               il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(BlockPosx.toCenterPos().add(0.0, 0.5, 0.0).subtract(Vec3d));
            }

            if (il1ll111liili1ll11liil != null) {
               II1ll1II1l11lI.StringHolder_8(new SupplierHolder(il1ll111liili1ll11liil, () -> {
                  this.lII111I11I1I11I1II = true;
                  return llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil);
               }, llI1lIIIlII111I11l1lIIl11.IlIll11I1lll1II1llI1I1II()), 7, this);
            }

            if (l11I1I1ll1Illll1I1l1111l1II.player.getStackInHand(Hand.OFF_HAND).getItem() != Items.SWEET_BERRIES
               && ListHolder_8.Event(Sweetfarm.class)
               && ListHolder_8.Event(Sweetfarm.class)
               && Slot != null) {
               ListHolder_8.StringHolder_8(Sweetfarm.class, () -> {
                  if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                     ListHolder_5.IIl1IlI1l11Il();
                  }

                  ListHolder_5.StringHolder_8(Slot, Hand.OFF_HAND, true);
               });
            }
         }
      }
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
            l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
            II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1(),
            l11I1I1ll1Illll1I1l1111l1II.player.getBlockInteractionRange(),
            BlockHitResult -> {
               if (BlockHitResultx == null) {
                  return false;
               } else {
                  BlockState BlockStatex = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResultx.getBlockPos());
                  return BlockStatex.isOf(Blocks.SWEET_BERRY_BUSH) && (Integer)BlockStatex.get(SweetBerryBushBlock.AGE) == 3
                     || (BlockStatex.isOf(Blocks.DIRT) || BlockStatex.isOf(Blocks.GRASS_BLOCK))
                        && l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResultx.getBlockPos().up()).isAir();
               }
            }
         );
         if (BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS) {
            BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResult.getBlockPos());
            if (!this.llIlIllIl1111111lIl1I1l1.Spider()
               && (this.l11lIlIlI1111Il1Ill11l1lIll == null || !this.l11lIlIlI1111Il1Ill11l1lIll.getBlockPos().equals(BlockHitResult.getBlockPos()))) {
               this.l11lIlIlI1111Il1Ill11l1lIll = BlockHitResult;
               return;
            }

            if (this.llIlIllIl1111111lIl1I1l1.Spider()) {
               ZenithInternal066.StringHolder_8(0.0, II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1());
               ZenithInternal066.StringHolder_8(0.0, II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1());
            }

            if (BlockState.isOf(Blocks.SWEET_BERRY_BUSH) && (Integer)BlockState.get(SweetBerryBushBlock.AGE) == 3) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager.updateBlockBreakingProgress(BlockHitResult.getBlockPos(), BlockHitResult.getSide());
               l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.MAIN_HAND);
               if (this.llIlIllIl1111111lIl1I1l1.Spider()) {
                  ZenithInternal066.StringHolder_8(BlockHitResult, Hand.OFF_HAND);
               }
            } else if (!(l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof EntityHitResult)
               && l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResult.getBlockPos().up()).isAir()) {
               ZenithInternal066.StringHolder_8(BlockHitResult, Hand.OFF_HAND);
            }

            this.I1II11lI11II1l1IIl = true;
         }
      }
   }

   private boolean ZenithInternal064(ItemStack ItemStack) {
      if (ItemStack.contains(DataComponentTypes.POTION_CONTENTS)) {
         PotionContentsComponent PotionContentsComponent = (PotionContentsComponent)ItemStack.get(DataComponentTypes.POTION_CONTENTS);
         if (PotionContentsComponent.potion().isPresent() && ((Potion)((RegistryEntry)PotionContentsComponent.potion().get()).value()).equals(Potions.INVISIBILITY)) {
            return true;
         }

         for (StatusEffectInstance StatusEffectInstance : PotionContentsComponent.getEffects()) {
            if (StatusEffectInstance.getEffectType().equals(StatusEffects.INVISIBILITY)) {
               return true;
            }
         }
      }

      return false;
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void longHolder_5(PlayerInputHolder ili11i1il11) {
      if (this.lII111I11I1I11I1II
         && !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)
         && !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof InventoryScreen)
         && l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
         ili11i1il11.ZenithInternal061(true);
      }
   }

   public static List<BlockPos> EventTarget(BlockPos BlockPos, BlockPos BlockPos) {
      ArrayList arraylist = new ArrayList();
      int i = Math.min(BlockPos.getX(), BlockPosx.getX());
      int j = Math.max(BlockPos.getX(), BlockPosx.getX());
      int k = Math.min(BlockPos.getY(), BlockPosx.getY());
      int l = Math.max(BlockPos.getY(), BlockPosx.getY());
      int i1 = Math.min(BlockPos.getZ(), BlockPosx.getZ());
      int j1 = Math.max(BlockPos.getZ(), BlockPosx.getZ());

      for (int k1 = i; k1 <= j; k1++) {
         for (int l1 = k; l1 <= l; l1++) {
            for (int i2 = i1; i2 <= j1; i2++) {
               arraylist.add(new BlockPos(k1, l1, i2));
            }
         }
      }

      return arraylist;
   }

   @EventTarget
   public void Event(ZenithInternal055 il1ii11111lil1l1llllllli11i) {
      if (this.I1II11lI11II1l1IIl) {
         il1ii11111lil1l1llllllli11i.ZenithInternal069();
      }
   }
}
