package zenith.zov.utility.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.Reach;
import zenith.EntityHolder;
import zenith.ZenithInternal005$Helper;
import zenith.Autosprint;
import zenith.ZenithClient;
import zenith.floatHolder_6;
import zenith.EventBus;
import zenith.Event;
import zenith.ZenithInternal127;
import zenith.ZenithInternal126$Helper;

@Mixin({PlayerEntity.class})
public abstract class MixinPlayerEntity {
   @Inject(
      method = {"isPushedByFluids"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isPushedByFluids(CallbackInfoReturnable<Boolean> callbackinforeturnable) {
      ZenithInternal127 lilili1lilli111illllliill = new ZenithInternal127(ZenithInternal126$Helper.llII1IlIl1l1IIl1llI11Ill);
      EventBus.StringHolder_8((Event)lilili1lilli111illllliill);
      if (lilili1lilli111illllliill.Event()) {
         callbackinforeturnable.setReturnValue(false);
      }
   }

   @Redirect(
      method = {"travel"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )
   )
   public Vec3d fixSwing(PlayerEntity PlayerEntity) {
      return this != MinecraftClient.getInstance().player
         ? PlayerEntity.getRotationVector()
         : ZenithClient.getInstance().ZenithInternal057().ll1ll1l11l1lllIIIIl1().lllIl11IIIlIIlI1();
   }

   @Redirect(
      method = {"attack"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/Vec3d;multiply(DDD)Lnet/minecraft/util/math/Vec3d;"
      )
   )
   private Vec3d hookSlowVelocity(Vec3d Vec3d, double d0, double d1, double d2) {
      if (this == MinecraftClient.getInstance().player
         && Autosprint.lIlIIlllIl11l111l1I1I11l.Spider()
         && Autosprint.lIlIIlllIl11l111l1I1I11l.ll1lllllllII1Il1l1()) {
         d0 = d2 = Autosprint.lIlIIlllIl11l111l1I1I11l.IIIlIIlII();
      }

      return Vec3d.multiply(d0, d1, d2);
   }

   @WrapWithCondition(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;setSprinting(Z)V",
         ordinal = 0
      )}
   )
   private boolean hookSlowVelocity(PlayerEntity PlayerEntity, boolean flag) {
      return this != MinecraftClient.getInstance().player
         ? true
         : Autosprint.lIlIIlllIl11l111l1I1I11l.Spider() && Autosprint.lIlIIlllIl11l111l1I1I11l.ll1lllllllII1Il1l1() || flag;
   }

   @ModifyExpressionValue(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;isSprinting()Z"
      )}
   )
   private boolean hookSlowVelocity(boolean flag) {
      return this == MinecraftClient.getInstance().player
            && Autosprint.lIlIIlllIl11l111l1I1I11l.Spider()
            && Autosprint.lIlIIlllIl11l111l1I1I11l.ll1lllllllII1Il1l1()
         ? MinecraftClient.getInstance().player.isSprinting()
         : flag;
   }

   @Inject(
      method = {"getBlockInteractionRange"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void reachBlock(CallbackInfoReturnable<Double> callbackinforeturnable) {
      if (this == MinecraftClient.getInstance().player
         && Reach.I1I1IIlIll.Spider()
         && Reach.I1I1IIlIll.I1lIIIIl11Il1II1ll11llII.Spider()
         && (double)Reach.I1I1IIlIll.IlIIlllIIIlllI1Il1Il11llI1lll.lll1lI1llll1IIllIIIII1lll() > (Double)callbackinforeturnable.getReturnValue()
         )
       {
         callbackinforeturnable.setReturnValue((double)Reach.I1I1IIlIll.IlIIlllIIIlllI1Il1Il11llI1lll.lll1lI1llll1IIllIIIII1lll());
      }
   }

   @Inject(
      method = {"attack"},
      at = {@At("RETURN")}
   )
   public void eventAttackEnd(Entity Entity, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EntityHolder(Entity, ZenithInternal005$Helper.Il1III11llIlIlIl1l1IlI1IIlI)));
   }

   @Inject(
      method = {"attack"},
      at = {@At("HEAD")}
   )
   public void eventAttackHEad(Entity Entity, CallbackInfo callbackinfo) {
      EventBus.StringHolder_8((Event)(new EntityHolder(Entity, ZenithInternal005$Helper.IllIlIll11lIlI1)));
   }

   @Inject(
      method = {"getEntityInteractionRange"},
      at = {@At("RETURN")},
      cancellable = true
   )
   public void reach(CallbackInfoReturnable<Double> callbackinforeturnable) {
      if (this == MinecraftClient.getInstance().player
         && Reach.I1I1IIlIll.Spider()
         && Reach.I1I1IIlIll.I1lIIIIl11Il1II1ll11llII.Spider()
         && (double)Reach.I1I1IIlIll.IIIlllIl1I1.lll1lI1llll1IIllIIIII1lll() > (Double)callbackinforeturnable.getReturnValue()) {
         callbackinforeturnable.setReturnValue((double)Reach.I1I1IIlIll.IIIlllIl1I1.lll1lI1llll1IIllIIIII1lll());
      }
   }

   @ModifyExpressionValue(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getYaw()F"
      )}
   )
   private float hookFixRotation(float f) {
      if (this != MinecraftClient.getInstance().player) {
         return f;
      } else {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         return il1ll111liili1ll11liil == null ? f : il1ll111liili1ll11liil.AutoBrewing();
      }
   }
}
