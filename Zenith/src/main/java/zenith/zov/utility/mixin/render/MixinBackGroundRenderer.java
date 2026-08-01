package zenith.zov.utility.mixin.render;

import net.minecraft.entity.Entity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.BackgroundRenderer.ControlsListWidget6;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import zenith.floatHolder_2;
import zenith.PatternHolder;
import zenith.EventBus;
import zenith.Norender;
import zenith.Event;

@Mixin({BackgroundRenderer.class})
public class MixinBackGroundRenderer {
   @Inject(
      method = {"getFogModifier(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/client/render/BackgroundRenderer$StatusEffectFogModifier;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onGetFogModifier(Entity Entity, float f, CallbackInfoReturnable<Object> callbackinforeturnable) {
      Norender lii1l1ili11ill1l1 = Norender.I11I1Il11lIlIl;
      if (lii1l1ili11ill1l1.IlllIIl1l1()) {
         callbackinforeturnable.setReturnValue(null);
      }
   }

   @Inject(
      method = {"getFogColor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void getFogColorHook(
      Camera Camera, float f, ClientWorld ClientWorld, int j, float f1, CallbackInfoReturnable<Vector4f> callbackinforeturnable
   ) {
      floatHolder_2 i1lliiill1il1l1lilii1liil = new floatHolder_2();
      EventBus.StringHolder_8((Event)i1lliiill1il1l1lilii1liil);
      if (i1lliiill1il1l1lilii1liil.Event()) {
         int i = i1lliiill1il1l1lilii1liil.AutocraftHolder();
         callbackinforeturnable.setReturnValue(
            new Vector4f(
               PatternHolder.ZenithInternal125(i),
               PatternHolder.ZenithInternal062(i),
               PatternHolder.ZenithInternal111(i),
               PatternHolder.ZenithInternal055(i)
            )
         );
      }
   }

   @Inject(
      method = {"applyFog"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void modifyFog(
      Camera Camera,
      ControlsListWidget6 ControlsListWidget6,
      Vector4f vector4f,
      float f,
      boolean flag,
      float f1,
      CallbackInfoReturnable<Fog> callbackinforeturnable
   ) {
      floatHolder_2 i1lliiill1il1l1lilii1liil = new floatHolder_2();
      EventBus.StringHolder_8((Event)i1lliiill1il1l1lilii1liil);
      if (i1lliiill1il1l1lilii1liil.Event()) {
         int i = i1lliiill1il1l1lilii1liil.AutocraftHolder();
         callbackinforeturnable.setReturnValue(
            new Fog(
               2.0F,
               i1lliiill1il1l1lilii1liil.Betterminecraft(),
               FogShape.CYLINDER,
               PatternHolder.ZenithInternal125(i),
               PatternHolder.ZenithInternal062(i),
               PatternHolder.ZenithInternal111(i),
               PatternHolder.ZenithInternal055(i)
            )
         );
      }
   }
}
