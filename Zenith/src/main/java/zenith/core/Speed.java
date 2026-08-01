package zenith;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;

@ModuleInfo(
   name = "Speed",
   description = "speed",
   category = Category.MOVEMENT
)
public final class Speed extends Module {
   public static final Speed l11llI1II1Il1l1III1 = new Speed();
   private final ModeSetting lIIlIlIl11III1I = new ModeSetting(
      "module.speed.mode", "module.speed.mode.desc", "module.speed.mode.holyWorld", "module.speed.mode.grimOld"
   );
   private final NumberSetting I1llllIlIlllI1I111 = new NumberSetting(
      "module.speed.collisionRadius", 0.3F, 0.0F, 1.0F, 0.01F, "module.speed.collisionRadius.desc", "b"
   );
   private final NumberSetting I1II1ll1Il = new NumberSetting("module.speed.speed", 0.8F, 0.0F, 2.0F, 0.01F, "module.speed.speed.desc", "x");
   private final BooleanSetting lllII11l1I1 = new BooleanSetting("module.speed.onlyAura", "module.speed.onlyAura.desc", true);
   private int IllIIlIl11llIIlIIl1 = 0;
   boolean Il1l1l1lIll11Il111IlIIlIIll = false;
   int lIIIII1I1I1I1I11I11l1 = 0;

   private Speed() {
   }

   @Override
   public void onEnable() {
      this.lIIIII1I1I1I1I11I11l1 = 0;
      this.Il1l1l1lIll11Il111IlIIlIIll = false;
      super.l11l1lII();
   }

   @EventTarget
   public void EventBus(booleanHolder_3 il11lill1lil1l1iill) {
      if (this.Il1l1l1lIll11Il111IlIIlIIll) {
         il11lill1lil1l1iill.longHolder_3(false);
         this.Il1l1l1lIll11Il111IlIIlIIll = false;
      }
   }

   @EventTarget(
      ZenithInternal095 = 4
   )
   public void ZenithInternal028(EventImpl_22 l11llilil1) {
      if (this.lIIIII1I1I1I1I11I11l1 > 0) {
         this.lIIIII1I1I1I1I11I11l1--;
      }

      if (Aura.ll1II1l1lII11IlII1.Spider() || !this.lllII11l1I1.Spider()) {
         this.ByteBufferHolder_2(null);
      }
   }

   private void ByteBufferHolder_2(PlayerInputHolder ili11i1il11) {
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.isSprinting();
      if (flag) {
         l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(false);
      }

      PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(1);
      if (flag) {
         l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(true);
      }

      net.minecraft.util.math.Box Box = lll111ll1i1l11l1.IlIIll1l1lllll1I
         .expand(
            (double)this.I1llllIlIlllI1I111.lll1lI1llll1IIllIIIII1lll(),
            (double)this.I1llllIlIlllI1I111.lll1lI1llll1IIllIIIII1lll(),
            (double)this.I1llllIlIlllI1I111.lll1lI1llll1IIllIIIII1lll()
         );
      Object object = null;
      if (!this.lllII11l1I1.Spider()) {
         if (Aura.ll1II1l1lII11IlII1.lI1IIllII11I() == null) {
            for (Entity Entity : l11I1I1ll1Illll1I1l1111l1II.world.getEntities()) {
               if (Entity != l11I1I1ll1Illll1I1l1111l1II.player
                  && (Entity instanceof LivingEntity || Entity instanceof BoatEntity)
                  && Box.intersects(Entity.getBoundingBox())) {
                  object = Entity;
                  break;
               }
            }
         }
      } else {
         if (Aura.ll1II1l1lII11IlII1.lI1IIllII11I() == null) {
            return;
         }

         if (Box.intersects(Aura.ll1II1l1lII11IlII1.lI1IIllII11I().getBoundingBox())) {
            object = Aura.ll1II1l1lII11IlII1.lI1IIllII11I();
         }
      }

      if (object instanceof PlayerEntity) {
         net.minecraft.util.math.Vec3d Vec3dx = lll111ll1i1l11l1.l1l111I11I1I;
         net.minecraft.util.math.Vec3d Vec3dx = (Reachv3.Il11lIlllI111I1l1111.Spider()
                  && Reachv3.Il11lIlllI111I1l1111.IIIlIII1llI1I1ll11Il1lII() != null
               ? ((Entity)object).dimensions.getBoxAt(Reachv3.Il11lIlllI111I1l1111.IIIlIII1llI1I1ll11Il1lII())
               : (object instanceof PlayerEntity ? PlayerEntityHolder.ZenithInternal095((PlayerEntity)object, 2).IlIIll1l1lllll1I : object.getBoundingBox()))
            .getCenter();
         floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(Vec3dx.subtract(lll111ll1i1l11l1.l1l111I11I1I));
         double d0 = Vec3dx.x - Vec3dx.x;
         double d1 = Vec3dx.z - Vec3dx.z;
         double d2 = Math.sqrt(d0 * d0 + d1 * d1);
         double d3 = l11I1I1ll1Illll1I1l1111l1II.player.isSubmergedInWater() ? 0.1 : 0.03;
         double d4 = 0.0;
         double d5 = Math.max(0.0, d2 - d4);
         double d6 = Math.min(d3, d5);
         double d7 = Math.toRadians((double)il1ll111liili1ll11liil.AutoBrewing());
         double[] adouble = new double[]{d0 * d6, d1 * d6};
         l11I1I1ll1Illll1I1l1111l1II.player.addVelocity(adouble[0], 0.0, adouble[1]);
         if (this.lIIlIlIl11III1I.ClearHeadersHandler(0)) {
            if (l11I1I1ll1Illll1I1l1111l1II.player.lastSprinting) {
               l11I1I1ll1Illll1I1l1111l1II.player.addVelocity(-adouble[0], 0.0, -adouble[1]);
            }

            l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(false);
            l11I1I1ll1Illll1I1l1111l1II.options.sprintKey.setPressed(false);
            this.Il1l1l1lIll11Il111IlIIlIIll = true;
         }

         if (l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().intersects(object.getBoundingBox())) {
            this.lIIIII1I1I1I1I11I11l1 = 3;
            return;
         }
      } else {
         this.lIIIII1I1I1I1I11I11l1 = 0;
      }
   }

   public int I1IlllIl11I1l() {
      return this.lIIIII1I1I1I1I11I11l1;
   }
}
