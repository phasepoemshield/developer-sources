package zenith.zov.utility.mixin.entity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithInternal018;
import zenith.ZenithClient;
import zenith.ListHolder_9;
import zenith.booleanHolder$Helper_3;
import zenith.floatHolder$EventTarget;
import zenith.Cape;

@Mixin({PlayerEntity.class})
public abstract class MixinAbstractPlayer implements ZenithInternal018 {
   @Unique
   private final ListHolder_9 zenith$stickSimulation = new ListHolder_9();
   @Unique
   private double zenith$prevX;
   @Unique
   private double zenith$prevY;
   @Unique
   private double zenith$prevZ;
   @Unique
   private boolean zenith$initialized = false;
   @Unique
   private boolean zenith$wasOnGround = true;
   @Unique
   private float zenith$jumpImpulse = 0.0F;

   @Override
   public void zenith$simulate() {
      PlayerEntity PlayerEntity = (PlayerEntity)this;
      this.zenith$stickSimulation.ZenithInternal039(ListHolder_9.IlIIl1lll1ll());
      ZenithInternal018.StringHolder_8(PlayerEntity.getId(), this.zenith$stickSimulation);
      if (!this.zenith$initialized) {
         this.zenith$prevX = PlayerEntity.getX();
         this.zenith$prevY = PlayerEntity.getY();
         this.zenith$prevZ = PlayerEntity.getZ();
         this.zenith$initialized = true;
      } else {
         double d0 = PlayerEntity.getX() - this.zenith$prevX;
         double d1 = PlayerEntity.getY() - this.zenith$prevY;
         double d2 = PlayerEntity.getZ() - this.zenith$prevZ;
         double d3 = PlayerEntity.getVelocity().y;
         boolean flag = PlayerEntity.isOnGround();
         if (this.zenith$wasOnGround && !flag && d3 > 0.0) {
            this.zenith$jumpImpulse = 10.0F;
         }

         float f;
         if (d3 < -0.01) {
            f = (float)Math.abs(d3);
         } else {
            f = 0.0F;
         }

         this.zenith$wasOnGround = flag;
         float f1 = (float)Math.toRadians((double)PlayerEntity.bodyYaw);
         float f2 = MathHelper.sin(f1);
         float f3 = MathHelper.cos(f1);
         double d4 = d0 * (double)f3 + d2 * (double)f2;
         double d5 = -d0 * (double)f2 + d2 * (double)f3;
         float f4 = Cape.l1l1IlllllI111l1II1IIIl1.II1Il1l1II1I111lIll1lI1l11I();
         if (this.zenith$jumpImpulse > 0.1F) {
            for (int i = 1; i < this.zenith$stickSimulation.Illll1Illl1lll111II1lIIl.size(); i++) {
               booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = this.zenith$stickSimulation
                  .Illll1Illl1lll111II1lIIl
                  .get(i);
               float f5 = (float)i / (float)this.zenith$stickSimulation.Illll1Illl1lll111II1lIIl.size();
               lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.Il1llI11II1l.field_172 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.Il1llI11II1l.field_172
                  - this.zenith$jumpImpulse * f5 * (0.2F + f4 * 0.3F);
               lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.Il1llI11II1l.field_171 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.Il1llI11II1l.field_171
                  + this.zenith$jumpImpulse * f5 * (0.15F + f4 * 0.2F);
            }

            this.zenith$jumpImpulse *= 0.6F;
         }

         if (f > 0.01F) {
            float f7 = f * f4 * 20.0F;

            for (int j = 1; j < this.zenith$stickSimulation.Illll1Illl1lll111II1lIIl.size(); j++) {
               booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil = this.zenith$stickSimulation
                  .Illll1Illl1lll111II1lIIl
                  .get(j);
               float f6 = (float)j / (float)this.zenith$stickSimulation.Illll1Illl1lll111II1lIIl.size();
               lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.Il1llI11II1l.field_172 -= f7 * f6;
               lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iil.Il1llI11II1l.field_171 += f7 * f6 * 0.6F;
            }
         }

         float f8 = Cape.l1l1IlllllI111l1II1IIIl1.Ill1IIlI1lIlIIIl111l();
         float f9 = 2.0F + f4 * 4.0F;
         floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1 = new floatHolder$EventTarget(
            (float)(d5 * (double)f9), (float)(d1 * (double)f9 * 0.8F), (float)(d4 * (double)f9)
         );
         this.zenith$stickSimulation.EventBus(lii1ii1lll1i1lll1llill11i11l$illi1l1l1);
         this.zenith$stickSimulation.GetSocketHandler(PlayerEntity.isSneaking());
         this.zenith$stickSimulation.ConstructorHolder(25.0F * f8);
         this.zenith$stickSimulation.IIl11IlIlI1IIlIlIllI1 = (int)(10.0F + Cape.l1l1IlllllI111l1II1IIIl1.I11I1III1I1I11111lllII111l() * 20.0F);
         this.zenith$stickSimulation.I1llI1II1II1Il1lIIl11IIlll111();
         this.zenith$prevX = PlayerEntity.getX();
         this.zenith$prevY = PlayerEntity.getY();
         this.zenith$prevZ = PlayerEntity.getZ();
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void onTick(CallbackInfo callbackinfo) {
      try {
         PlayerEntity PlayerEntity = (PlayerEntity)this;
         if (Cape.l1l1IlllllI111l1II1IIIl1.Spider()
            && (
               PlayerEntity == MinecraftClient.getInstance().player
                  || ZenithClient.getInstance().StringHolder_26().EventBus(PlayerEntity)
            )) {
            this.zenith$simulate();
         }
      } catch (Exception exception) {
         System.out.println("Paster dayn v2");
         exception.printStackTrace();
      }
   }
}
