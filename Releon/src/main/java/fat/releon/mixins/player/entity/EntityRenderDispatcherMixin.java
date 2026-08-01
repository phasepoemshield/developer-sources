package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import fat.releon.Releon;
import l.Helper133;
import l.Helper147;
import l.Helper148;
import l.Helper160;
import l.Helper183;
import l.Helper309;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderDispatcher.class})
public class EntityRenderDispatcherMixin implements Helper160 {
   public EntityRenderDispatcherMixin() {
   }

   @ModifyExpressionValue(
      method = {"render(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/EntityRenderer;)V"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/render/entity/state/EntityRenderState;invisible:Z"
      )}
   )
   private boolean renderHitboxHook(boolean var1, @Local(ordinal = 0,argsOnly = true) Entity var2) {
      return var2 instanceof ArmorStandEntity;
   }

   @Inject(
      method = {"renderHitbox"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void renderHitboxHook(MatrixStack var0, VertexConsumer var1, Entity var2, float var3, float var4, float var5, float var6, CallbackInfo var7) {
      if (!Releon.method71().method21().entities.containsKey(var2.getType())) {
         renderBox(var2);
      }

      var7.cancel();
   }

   @Unique
   private static void renderBox(Entity var0) {
      if (var0 != mc.player || !mc.options.getPerspective().equals(Perspective.FIRST_PERSON)) {
         int var1 = Helper309.method3075(var0) ? Helper133.method1164() : Helper133.method1162();
         Vec3d var2 = Helper147.method1247(var0).subtract(var0.getPos());
         Box var3 = var0.getBoundingBox().offset(var2);
         if (Helper148.method1256(var3)) {
            if (var0 instanceof LivingEntity var4) {
               float var5 = var0.getWidth();
               Vec3d var6 = var0.getEyePos().add(var2).add(-var5 / 2.0F, 0.0, -var5 / 2.0F);
               Helper183.method1546(var3, Helper133.method1137(var1, 1 + var4.hurtTime), 2.0F, true, true, true);
               Helper183.method1563(var6, var6.add(var5, 0.0, 0.0), Helper133.RED, 2.0F, true);
               Helper183.method1563(var6.add(var5, 0.0, 0.0), var6.add(var5, 0.0, var5), Helper133.RED, 2.0F, true);
               Helper183.method1563(var6, var6.add(0.0, 0.0, var5), Helper133.RED, 2.0F, true);
               Helper183.method1563(var6.add(0.0, 0.0, var5), var6.add(var5, 0.0, var5), Helper133.RED, 2.0F, true);
            } else {
               Helper183.method1546(var3, var1, 2.0F, true, true, true);
            }
         }
      }
   }
}
