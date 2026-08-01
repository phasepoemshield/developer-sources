package zenith;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;

@ModuleInfo(
   name = "CastleFly",
   description = "",
   category = Category.MOVEMENT
)
public final class Castlefly extends Module {
   public static final Castlefly ll1I111l1l1lIllllIlI1l1 = new Castlefly();
   private BlockPosHolder$Helper IIlI1l1l1Il1;
   private ModeSetting I1lllI1IlllIl11Ill1lIl1 = new ModeSetting(
      "module.flyBypass.mode", "module.flyBypass.mode.desc", "module.flyBypass.safeMode", "module.flyBypass.riskMode"
   );
   private boolean I1Il1llI1l11 = false;
   private int I11l1llII1Il;
   private final NumberSetting IIIIlIIl11I1lll11 = new NumberSetting(
      "module.flyBypass.delay", 500.0F, 50.0F, 1000.0F, 50.0F, "module.flyBypass.delay.desc", "ms"
   );
   private final Queue<Reachv3$II1Il11l111II11IIl> lIIIIIIll1l = new ConcurrentLinkedQueue<>();
   private BlockHitResult l11I11l1l1IlI1l1l11I1lllll1 = null;
   int lIIl1I1IIl1lIl1l = 0;

   private Castlefly() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      TextHolder.EventImpl_27("Для работы держите ЛЮБОЙ блок руках");
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.I1Il1llI1l11 = true;
   }

   @EventTarget
   public void Event(EventImpl_34 ll1li1l111llllli1) {
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8() && !ii1l11il1i1i.Event()) {
         try {
            Packet Packet = ii1l11il1i1i.Swinganimation();
            if (this.lIIIIIIll1l.isEmpty() && l11I1I1ll1Illll1I1l1111l1II.world == null) {
               return;
            }

            if (Packet instanceof ChatMessageC2SPacket || Packet instanceof HealthUpdateS2CPacket || Packet instanceof GameMessageS2CPacket || Packet instanceof CommandExecutionC2SPacket) {
               return;
            }

            ii1l11il1i1i.ZenithInternal069();
            net.minecraft.util.math.Vec3d Vec3d = null;
            if (Packet instanceof BlockUpdateS2CPacket BlockUpdateS2CPacket) {
               Vec3d = new net.minecraft.util.math.Vec3d(BlockUpdateS2CPacket.getPos());
            }

            this.lIIIIIIll1l.add(new Reachv3$II1Il11l111II11IIl(Packet, Vec3d));
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_17 illli1llllii1ii111ili) {
      long i = System.currentTimeMillis();
      if (l11I1I1ll1Illll1I1l1111l1II.world == null || l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.lIIIIIIll1l.clear();
      }

      try {
         this.lIIIIIIll1l
            .removeIf(
               liiiiill1iililliil11illli1ll$ii1il11l111ii11iil -> {
                  boolean flag = i - liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.I1lll1IlllI1l1IlIl11ll11()
                     >= (long)(this.IIIIlIIl11I1lll11.lll1lI1llll1IIllIIIII1lll() * 2.0F);
                  if (!flag && l11I1I1ll1Illll1I1l1111l1II.world != null && !this.I1Il1llI1l11) {
                     return false;
                  } else {
                     try {
                        liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.Swinganimation().apply(l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler());
                     } catch (Throwable throwable) {
                     }

                     return true;
                  }
               }
            );
      } catch (Exception exception) {
         exception.printStackTrace();
      }

      if (this.I1Il1llI1l11) {
         this.I1Il1llI1l11 = false;
         super.l1l1lI111l1II1Illl111l1l1ll1l();
      }
   }

   @EventTarget
   public void EventImpl_21(EventImpl_30 ll1iil11ii) {
      this.l11I11l1l1IlI1l1l11I1lllll1 = null;
      if (l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof BlockHitResult BlockHitResultx) {
         this.l11I11l1l1IlI1l1l11I1lllll1 = BlockHitResultx;
      }

      if (this.I1lllI1IlllIl11Ill1lIl1.ClearHeadersHandler(0)) {
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().StringHolder_8(new floatHolder_9(0.0F, 900.0F)),
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(
                     llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().StringHolder_8(new floatHolder_9(0.0F, 900.0F))
                  ),
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
            ),
            20,
            this,
            2
         );
      } else {
         this.IIlI1l1l1Il1 = null;
         if (l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed() && !ZenithInternal047.IlIllI1lI11Ill11llII1111l()) {
            this.I11l1llII1Il = (int)Math.floor(l11I1I1ll1Illll1I1l1111l1II.player.getY() - 1.0);
         }

         PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(2);
         BlockPos BlockPos = new BlockPos(
            (int)Math.floor(lll111ll1i1l11l1.Debug().x),
            (int)Math.floor(l11I1I1ll1Illll1I1l1111l1II.player.getY() - 1.0),
            (int)Math.floor(lll111ll1i1l11l1.Debug().z)
         );
         this.IIlI1l1l1Il1 = this.hasTimeElapsed(BlockPos);
         if (this.IIlI1l1l1Il1 != null) {
            BlockHitResult BlockHitResult = new BlockHitResult(
               new net.minecraft.util.math.Vec3d(
                  (double)this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il().getX() + 0.5,
                  (double)this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il().getY() + 0.5,
                  (double)this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il().getZ() + 0.5
               ),
               this.IIlI1l1l1Il1.ll1lII11I1II1Il(),
               this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il(),
               false
            );
            floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.longHolder_6(BlockHitResult.getPos());
            II1ll1II1l11lI.StringHolder_8(
               new SupplierHolder(
                  il1ll111liili1ll11liil,
                  () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
                  llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
               ),
               20,
               this,
               1
            );
         }
      }
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void byteHolder_2(PlayerInputHolder ili11i1il11) {
      ZenithInternal047.StringHolder_8(
         ili11i1il11,
         ZenithClient.getInstance().ZenithInternal057().ll1ll1l11l1lllIIIIl1().AutoBrewing(),
         ZenithInternal131.ll1II1l1lII11IlII1().AutoBrewing()
      );
   }

   @EventTarget
   public void byteHolder(EventImpl_22 l11llilil1) {
      if (this.lIIl1I1IIl1lIl1l > 0) {
         this.lIIl1I1IIl1lIl1l--;
      } else {
         if (this.I1lllI1IlllIl11Ill1lIl1.ClearHeadersHandler(0)) {
            if (l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof BlockHitResult BlockHitResultx
               && BlockHitResultx.getType() == net.minecraft.util.hit.HitResult.class_240.BLOCK) {
               ZenithInternal066.StringHolder_8(BlockHitResultx, Hand.MAIN_HAND);
               this.lIIl1I1IIl1lIl1l = 2;
            }
         } else if (l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof BlockHitResult BlockHitResult
            && this.IIlI1l1l1Il1 != null
            && this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il().equals(BlockHitResult.getBlockPos())) {
            net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getEyePos();
            BlockPos BlockPos = BlockHitResult.getBlockPos().offset(this.IIlI1l1l1Il1.ll1lII11I1II1Il());
            if (!StringHolder_8(Vec3d, BlockPos, this.IIlI1l1l1Il1.ll1lII11I1II1Il())) {
               return;
            }

            ZenithInternal066.StringHolder_8(
               new BlockHitResult(
                  this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il().toCenterPos().add((double)((float)(Math.random() / 2.0))),
                  this.IIlI1l1l1Il1.ll1lII11I1II1Il(),
                  this.IIlI1l1l1Il1.lIll1Il1111l1ll1l1Il(),
                  false
               ),
               Hand.MAIN_HAND
            );
            this.lIIl1I1IIl1lIl1l = 1;
         }
      }
   }

   public static boolean StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, BlockPos BlockPos, Direction Direction) {
      double d0 = Double.MAX_VALUE;
      double d1 = Double.MIN_VALUE;
      net.minecraft.util.math.Box Boxx = new net.minecraft.util.math.Box(
         Vec3d.x,
         l11I1I1ll1Illll1I1l1111l1II.player.getY() - 1.0,
         Vec3d.z,
         Vec3d.x,
         Vec3d.y + d1,
         Vec3d.z
      );
      net.minecraft.util.math.Box Boxx = new net.minecraft.util.math.Box(BlockPos.offset(Direction));
      if (Boxx.intersects(Boxx)) {
         return true;
      } else {
         return switch (Direction) {
            case NORTH -> Boxx.minZ > Boxx.minZ;
            case SOUTH -> Boxx.maxZ < Boxx.maxZ;
            case EAST -> Boxx.maxX < Boxx.maxX;
            case WEST -> Boxx.minX > Boxx.minX;
            case UP -> Boxx.maxY < Boxx.maxY;
            case DOWN -> Boxx.minY > Boxx.minY;
            default -> throw new MatchException(null, null);
         };
      }
   }

   private BlockPosHolder$Helper longHolder_5(BlockPos BlockPos) {
      BlockPosHolder$Helper ilililiiill1l1lilillii1$ii1il11l111ii11iil = null;
      ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos);
      if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
         return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
      } else {
         ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(-1, 0, 0));
         if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
            return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
         } else {
            ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(1, 0, 0));
            if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
               return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
            } else {
               ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(0, 0, 1));
               if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                  return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
               } else {
                  ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(0, 0, -1));
                  if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                     return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                  } else {
                     ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(-2, 0, 0));
                     if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                        return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                     } else {
                        ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(2, 0, 0));
                        if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                           return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                        } else {
                           ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(BlockPos.add(0, 0, 2));
                           if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                              return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                           } else {
                              ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(
                                 BlockPos.add(0, 0, -2)
                              );
                              if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                                 return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                              } else {
                                 ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(
                                    BlockPos.add(0, -1, 0)
                                 );
                                 if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                                    return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                                 } else {
                                    ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(
                                       BlockPos.add(1, -1, 0)
                                    );
                                    if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                                       return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                                    } else {
                                       ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(
                                          BlockPos.add(-1, -1, 0)
                                       );
                                       if (ilililiiill1l1lilillii1$ii1il11l111ii11iil != null) {
                                          return ilililiiill1l1lilillii1$ii1il11l111ii11iil;
                                       } else {
                                          ilililiiill1l1lilillii1$ii1il11l111ii11iil = ZenithInternal066.ZenithInternal056(
                                             BlockPos.add(0, -1, 1)
                                          );
                                          return ilililiiill1l1lilillii1$ii1il11l111ii11iil != null
                                             ? ilililiiill1l1lilillii1$ii1il11l111ii11iil
                                             : ZenithInternal066.ZenithInternal056(BlockPos.add(0, -1, -1));
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean ZenithInternal095(double d0, double d1) {
      return !l11I1I1ll1Illll1I1l1111l1II.world
         .getBlockCollisions(
            l11I1I1ll1Illll1I1l1111l1II.player, l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().expand(-0.1, 0.0, -0.1).offset(d0, -2.0, d1)
         )
         .iterator()
         .hasNext();
   }
}
