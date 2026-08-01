package zenith.zov.utility.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.Swinganimation;
import zenith.EventImpl;
import zenith.ZenithClient;
import zenith.floatHolder_6;
import zenith.ZenithInternal076;
import zenith.EventBus;
import zenith.ZenithInternal083;
import zenith.EventImpl_27;
import zenith.Event;
import zenith.Aura$II1Il11l111II11IIl;
import zenith.ZenithInternal127;
import zenith.ZenithInternal126$Helper;

@Mixin({LivingEntity.class})
public class MixinLivingEntity implements ZenithInternal076, ZenithInternal083 {
   float safeYaw = 0.0F;
   float safePitch = 0.0F;
   @Shadow
   protected double serverX;
   @Shadow
   protected double serverY;
   @Shadow
   protected double serverZ;
   @Unique
   public List<Aura$II1Il11l111II11IIl> positonHistory = new ArrayList<>();
   @Unique
   double prevServerX;
   @Unique
   double prevServerY;
   @Unique
   double prevServerZ;

   @Inject(
      method = {"jump"},
      at = {@At("RETURN")}
   )
   public void replaceMovePacketPitch(CallbackInfo callbackinfo) {
      if (this == l11I1I1ll1Illll1I1l1111l1II.player) {
         EventBus.StringHolder_8((Event)(new EventImpl()));
      }
   }

   @Redirect(
      method = {"jump"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getYaw()F"
      )
   )
   public float replaceMovePacketPitch(LivingEntity LivingEntity) {
      if (this != l11I1I1ll1Illll1I1l1111l1II.player) {
         return LivingEntity.getYaw();
      } else {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         return il1ll111liili1ll11liil == null ? LivingEntity.getYaw() : il1ll111liili1ll11liil.AutoBrewing();
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;travel(Lnet/minecraft/util/math/Vec3d;)V",
         shift = Shift.AFTER
      )}
   )
   public void gownso(CallbackInfo callbackinfo) {
      if (this == l11I1I1ll1Illll1I1l1111l1II.player
         && ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null) {
         l11I1I1ll1Illll1I1l1111l1II.player.setYaw(this.safeYaw);
         l11I1I1ll1Illll1I1l1111l1II.player.setPitch(this.safePitch);
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;travel(Lnet/minecraft/util/math/Vec3d;)V"
      )}
   )
   public void replaceMo(CallbackInfo callbackinfo) {
      if (this == l11I1I1ll1Illll1I1l1111l1II.player
         && ZenithClient.getInstance().ZenithInternal057().I111Ill1lIllIIIl() != null) {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         this.safeYaw = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
         this.safePitch = l11I1I1ll1Illll1I1l1111l1II.player.getPitch();
         l11I1I1ll1Illll1I1l1111l1II.player.setYaw(il1ll111liili1ll11liil.AutoBrewing());
         l11I1I1ll1Illll1I1l1111l1II.player.setPitch(il1ll111liili1ll11liil.Basefinder());
      }
   }

   @ModifyExpressionValue(
      method = {"calcGlidingVelocity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getPitch()F"
      )}
   )
   private float hookModifyFallFlyingPitch(float f) {
      if (this != MinecraftClient.getInstance().player) {
         return f;
      } else {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         return il1ll111liili1ll11liil == null ? f : il1ll111liili1ll11liil.Basefinder();
      }
   }

   @ModifyExpressionValue(
      method = {"calcGlidingVelocity"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   private Vec3d hookModifyFallFlyingRotationVector(Vec3d Vec3d) {
      if (this != MinecraftClient.getInstance().player) {
         return Vec3d;
      } else {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         return il1ll111liili1ll11liil == null ? Vec3d : il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      }
   }

   @ModifyConstant(
      method = {"getHandSwingDuration()I"},
      constant = {@Constant(
         intValue = 6
      )}
   )
   private int modifySwingDuration(int i) {
      Swinganimation i1111lilll1li11iil = Swinganimation.I111l11lIl1llIIl1IlI1I1lII1;
      return (LivingEntity)this == MinecraftClient.getInstance().player && i1111lilll1li11iil.Spider()
         ? (int)i1111lilll1li11iil.ll11llIIl1II1lI1Il1I.lll1lI1llll1IIllIIIII1lll()
         : i;
   }

   @Inject(
      method = {"onDeath(Lnet/minecraft/entity/damage/DamageSource;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void onDead(DamageSource DamageSource, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EventImpl_27((LivingEntity)this)));
   }

   @Inject(
      method = {"isPushable"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isPushable(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      ZenithInternal127 lilili1lilli111illllliill = new ZenithInternal127(ZenithInternal126$Helper.IlIlllI1I1lI1lI1);
      EventBus.StringHolder_8((Event)lilili1lilli111illllliill);
      if (lilili1lilli111illllliill.Event()) {
         callbackinforeturnable.setReturnValue(false);
      }
   }

   @Override
   public List<Aura$II1Il11l111II11IIl> zenithDLC$getPositionHistory() {
      return this.positonHistory;
   }

   @Override
   public double zenithDLC$getPrevServerX() {
      return this.prevServerX;
   }

   @Override
   public double zenithDLC$getPrevServerY() {
      return this.prevServerY;
   }

   @Override
   public double zenithDLC$getPrevServerZ() {
      return this.prevServerZ;
   }

   @Inject(
      method = {"updateTrackedPositionAndAngles"},
      at = {@At("HEAD")}
   )
   private void updateTrackedPositionAndAnglesHook(double d0, double d1, double d2, float f, float f1, int i, CallbackInfo callbackinfo) {
      this.prevServerX = this.serverX;
      this.prevServerY = this.serverY;
      this.prevServerZ = this.serverZ;
      this.positonHistory.addFirst(new Aura$II1Il11l111II11IIl(this.serverX, this.serverY, this.serverZ));
      this.positonHistory.removeIf(Aura$II1Il11l111II11IIl::I1ll1llllI1ll);
   }
}
