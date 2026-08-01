// Module: AutoWeb
// Category: misc
// Original class: Autoweb
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.Comparator;
import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.AbstractClientPlayerEntity;

@ModuleInfo(
   name = "AutoWeb",
   description = "",
   category = Category.MISC
)
public final class Autoweb extends Module {
   public static final Autoweb l1lI1I11II11l1111111lIII = new Autoweb();
   private final NumberSetting IlllI11III1llllllll1I111lII1 = new NumberSetting(
      "module.autoWeb.searchXZ", 4.0F, 0.0F, 6.0F, 0.1F, "module.autoWeb.searchXZ.desc", "b"
   );
   private final NumberSetting lIlIl1l1ll1111lIllIl1lII1l = new NumberSetting(
      "module.autoWeb.search", 4.0F, 1.0F, 6.0F, 0.1F, "module.autoWeb.search.desc", "b"
   );
   private final NumberSetting lIIl1lI1I11II11IIIIlllII1Il1ll = new NumberSetting(
      "module.autoWeb.distance", 4.0F, 1.0F, 6.0F, 0.1F, "module.autoWeb.distance.desc", "b"
   );
   private final ModeSetting I11lI1llIIlI1l11I1II = new ModeSetting(
      "module.autoWeb.hand", "module.autoWeb.hand.desc", "module.autoWeb.rightHand", "module.autoWeb.leftHand"
   );
   private PlayerEntity llI1I1Il1IlIIll1IIl111ll111I;
   private Slot l1IIl1IIl1lIlll = null;
   private floatHolder_6 lI1lI1I11lIIlII111l111ll = null;
   private floatHolder_6 l111111ll1I1IIllIlIII111I11I1 = null;
   private Autoweb$II1Il11l111II11IIl Ill1Il1II1I11ll1111I1ll1lIllI = null;
   private longHolder ll1lI1lIlIIl = new longHolder();
   List<BlockPos> list;

   private Autoweb() {
   }

   @Override
   public void onEnable() {
      if (ZenithInternal066.lII1IlIll11()) {
         this.StringHolder_11(false);
      } else {
         super.l11l1lII();
      }
   }

   @EventTarget
   public void EventTarget(ZenithInternal055 il1ii11111lil1l1llllllli11i) {
      if (Autotrap.III1lIIllIl1lI1lIll11I1l.II11l11ll111II1Il11II1IlIII1l()) {
         if (!il1ii11111lil1l1llllllli11i.Event() && l11I1I1ll1Illll1I1l1111l1II.player.age % 2 == 0) {
            BlockHitResult BlockHitResult = this.Ill1Il1II1I11ll1111I1ll1lIllI != null
               ? this.Ill1Il1II1I11ll1111I1ll1lIllI
                  .isRotate(ZenithClient.getInstance().ZenithInternal057().ll1ll1l11l1lllIIIIl1())
               : null;
            if (BlockHitResult != null
               && l11I1I1ll1Illll1I1l1111l1II.player
                     .getStackInHand(this.I11lI1llIIlI1l11I1II.ClearHeadersHandler(0) ? Hand.MAIN_HAND : Hand.OFF_HAND)
                     .getItem()
                  == Items.COBWEB) {
               ZenithInternal066.StringHolder_8(
                  BlockHitResult, this.I11lI1llIIlI1l11I1II.ClearHeadersHandler(0) ? Hand.MAIN_HAND : Hand.OFF_HAND
               );
               ListHolder_2.StringHolder_8(new net.minecraft.util.math.Box(BlockHitResult.getBlockPos()), -1, 1.0F);
               this.lI1lI1I11lIIlII111l111ll = null;
               this.Ill1Il1II1I11ll1111I1ll1lIllI = null;
            }
         }
      }
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_30 ll1iil11ii) {
      if (Autotrap.III1lIIllIl1lI1lIll11I1l.II11l11ll111II1Il11II1IlIII1l()) {
         this.llI1I1Il1IlIIll1IIl111ll111I = this.l1lll11111I1l();
         if (this.llI1I1Il1IlIIll1IIl111ll111I != null) {
            this.I1I1llI11llI11I1lI();
            floatHolder_6 il1ll111liili1ll11liil = this.lI1lI1I11lIIlII111l111ll;
            if (il1ll111liili1ll11liil != null) {
               II1ll1II1l11lI.StringHolder_8(
                  new SupplierHolder(
                     il1ll111liili1ll11liil,
                     () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
                     llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
                  ),
                  5,
                  this
               );
            }
         }
      }
   }

   public void I1I1llI11llI11I1lI() {
      if (Autotrap.III1lIIllIl1lI1lIll11I1l.II11l11ll111II1Il11II1IlIII1l()) {
         try {
            Slot Slotx = ListHolder_5.StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler, Slot -> Slotxx.getStack().getItem() == Items.COBWEB
            );
            byte b0 = 0;
            if (Slotx != null) {
               BlockPos BlockPosx = this.llI1I1Il1IlIIll1IIl111ll111I.getBlockPos();
               this.list = ZenithInternal066.StringHolder_8(
                     BlockPosx,
                     (float)((int)Math.ceil((double)this.IlllI11III1llllllll1I111lII1.lll1lI1llll1IIllIIIII1lll())),
                     (float)((int)Math.ceil((double)this.lIlIl1l1ll1111lIllIl1lII1l.lll1lI1llll1IIllIIIII1lll()))
                  )
                  .stream()
                  .filter(
                     BlockPos -> {
                        BlockState BlockStatex = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosxx);
                        return BlockStatex.isAir()
                           && this.llI1I1Il1IlIIll1IIl111ll111I
                              .getBoundingBox()
                              .expand(
                                 (double)this.IlllI11III1llllllll1I111lII1.lll1lI1llll1IIllIIIII1lll(),
                                 (double)this.lIlIl1l1ll1111lIllIl1lII1l.lll1lI1llll1IIllIIIII1lll(),
                                 (double)this.IlllI11III1llllllll1I111lII1.lll1lI1llll1IIllIIIII1lll()
                              )
                              .intersects(new net.minecraft.util.math.Box(BlockPosxx));
                     }
                  )
                  .sorted(Comparator.comparingDouble(BlockPos -> BlockPosxxx.getSquaredDistance(BlockPosx)))
                  .toList();

               label81:
               for (BlockPos BlockPosx : this.list) {
                  BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPosx);
                  if (BlockState.isReplaceable() && !BlockState.isAir()) {
                     floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(
                        new net.minecraft.util.math.Vec3d(
                           (double)((float)BlockPosx.getX() + 0.5F),
                           (double)((float)BlockPosx.getY() + 0.5F),
                           (double)((float)BlockPosx.getZ() + 0.5F)
                        )
                     );
                     BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
                        l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
                        il1ll111liili1ll11liil,
                        3.0,
                        BlockHitResult -> BlockHitResultxx != null && this.list.contains(BlockHitResultxx.getBlockPos())
                     );
                     if (BlockHitResult != null && BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS) {
                        this.Ill1Il1II1I11ll1111I1ll1lIllI = il1ll111liili1ll11liil2 -> {
                           BlockHitResult BlockHitResultxx = ZenithInternal088.StringHolder_8(
                              l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
                              il1ll111liili1ll11liil2,
                              (double)this.lIIl1lI1I11II11IIIIlllII1Il1ll.lll1lI1llll1IIllIIIII1lll(),
                              BlockHitResult -> BlockHitResultxxx != null
                                    && !l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResultxxx.getBlockPos()).isReplaceable()
                                    && this.list.contains(BlockHitResultxxx.getBlockPos().offset(BlockHitResultxxx.getSide()))
                           );
                           return BlockHitResultxx != null && BlockHitResultxx.getType() != net.minecraft.util.hit.HitResult.class_240.MISS ? BlockHitResultxx : null;
                        };
                        this.lI1lI1I11lIIlII111l111ll = il1ll111liili1ll11liil;
                     }
                  } else {
                     Direction[] aDirection = Direction.values();
                     int i = aDirection.length;
                     int j = 0;

                     while (true) {
                        if (j < i) {
                           Direction Direction = aDirection[j];
                           net.minecraft.util.math.Vec3d Vec3d = net.minecraft.util.math.Vec3d.ofCenter(BlockPosx)
                              .add(net.minecraft.util.math.Vec3d.of(Direction.getVector()).multiply(0.5));
                           floatHolder_6 il1ll111liili1ll11liil1 = ZenithInternal131.longHolder_6(Vec3d);
                           BlockHitResult BlockHitResultx = ZenithInternal088.StringHolder_8(
                              l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
                              il1ll111liili1ll11liil1,
                              (double)this.lIIl1lI1I11II11IIIIlllII1Il1ll.lll1lI1llll1IIllIIIII1lll(),
                              BlockHitResult -> BlockHitResultxx != null
                                    && !l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResultxx.getBlockPos()).isReplaceable()
                                    && this.list.contains(BlockHitResultxx.getBlockPos().offset(BlockHitResultxx.getSide()))
                           );
                           if (BlockHitResultx == null || BlockHitResultx.getType() == net.minecraft.util.hit.HitResult.class_240.MISS) {
                              j++;
                              continue;
                           }

                           if (b0 == 0) {
                              this.Ill1Il1II1I11ll1111I1ll1lIllI = il1ll111liili1ll11liil2 -> {
                                 BlockHitResult BlockHitResultxx = ZenithInternal088.StringHolder_8(
                                    l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
                                    il1ll111liili1ll11liil2,
                                    (double)this.lIIl1lI1I11II11IIIIlllII1Il1ll.lll1lI1llll1IIllIIIII1lll(),
                                    BlockHitResult -> BlockHitResultxxx != null
                                          && !l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResultxxx.getBlockPos()).isReplaceable()
                                          && this.list.contains(BlockHitResultxxx.getBlockPos().offset(BlockHitResultxxx.getSide()))
                                 );
                                 return BlockHitResultxx != null && BlockHitResultxx.getType() != net.minecraft.util.hit.HitResult.class_240.MISS
                                    ? BlockHitResultxx
                                    : null;
                              };
                              this.lI1lI1I11lIIlII111l111ll = il1ll111liili1ll11liil1;
                           } else {
                              this.l111111ll1I1IIllIlIII111I11I1 = il1ll111liili1ll11liil1;
                           }

                           b0++;
                        }

                        if (b0 == 2) {
                           break label81;
                        }
                        break;
                     }
                  }
               }

               if (ListHolder_8.Event(Autoweb.class)
                  && (ListHolder_8.Event(Autototem.class) || this.I11lI1llIIlI1l11I1II.ClearHeadersHandler(0))) {
                  if (b0 > 0) {
                     if (l11I1I1ll1Illll1I1l1111l1II.player
                           .getStackInHand(this.I11lI1llIIlI1l11I1II.ClearHeadersHandler(0) ? Hand.MAIN_HAND : Hand.OFF_HAND)
                           .getItem()
                        != Items.COBWEB) {
                        ListHolder_8.StringHolder_8(
                           Autoweb.class,
                           () -> ListHolder_5.StringHolder_8(
                                 Slotx, this.I11lI1llIIlI1l11I1II.ClearHeadersHandler(0) ? Hand.MAIN_HAND : Hand.OFF_HAND, true
                              )
                        );
                        if (this.l1IIl1IIl1lIlll == null) {
                           this.l1IIl1IIl1lIlll = Slotx;
                        }
                     }
                  } else if (this.l1IIl1IIl1lIlll != null) {
                     Slot Slotx = this.l1IIl1IIl1lIlll;
                     ListHolder_8.StringHolder_8(
                        Autoweb.class,
                        () -> ListHolder_5.StringHolder_8(
                              Slot, this.I11lI1llIIlI1l11I1II.ClearHeadersHandler(0) ? Hand.MAIN_HAND : Hand.OFF_HAND, true
                           )
                     );
                     this.l1IIl1IIl1lIlll = null;
                     return;
                  }
               }
            }
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   @EventTarget
   private void EventBus(PlayerInputHolder ili11i1il11) {
      if (this.Ill1Il1II1I11ll1111I1ll1lIllI != null) {
         ZenithInternal047.StringHolder_8(
            ili11i1il11,
            II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1().AutoBrewing(),
            l11I1I1ll1Illll1I1l1111l1II.player.getYaw()
         );
      }
   }

   public PlayerEntity l1lll11111I1l() {
      return l11I1I1ll1Illll1I1l1111l1II.world
         .getPlayers()
         .stream()
         .filter(
            AbstractClientPlayerEntity -> AbstractClientPlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
                  && !ZenithClient.getInstance().StringHolder_26().EventBus(AbstractClientPlayerEntity)
                  && l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(AbstractClientPlayerEntity)
                     < ((double)this.lIIl1lI1I11II11IIIIlllII1Il1ll.lll1lI1llll1IIllIIIII1lll() + 0.1)
                        * ((double)this.lIIl1lI1I11II11IIIIlllII1Il1ll.lll1lI1llll1IIllIIIII1lll() + 0.1)
         )
         .min(
            Comparator.comparingDouble(
               AbstractClientPlayerEntity -> l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(AbstractClientPlayerEntity)
                     - (double)(AbstractClientPlayerEntity == Aura.ll1II1l1lII11IlII1.I1IIl11I11l() ? 100 : 0)
            )
         )
         .orElse(null);
   }
}
