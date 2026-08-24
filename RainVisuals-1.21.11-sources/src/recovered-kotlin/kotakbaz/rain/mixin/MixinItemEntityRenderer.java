package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.ItemPhysicModule;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.render.item.ItemRenderState.LayerRenderState;
import net.minecraft.client.render.model.json.Transformation;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.بر;

// $VF: Compiled from MixinItemEntityRenderer.java
@Mixin(ItemEntityRenderer.class)
public abstract class MixinItemEntityRenderer extends EntityRenderer<ItemEntity, ItemEntityRenderState> {
   @Unique
   private static final float rain$rotationStep = 0.25F;
   @Shadow
   private Random random;
   @Unique
   private static final double rain$uniqueOffsetStep = 0.007957747154594767;

   @Unique
   private boolean rain$requiresOffset(BlockState state) {
      return state.isOf(Blocks.SNOW) || state.isOf(Blocks.SOUL_SAND) || state.isOf(Blocks.MUD);
   }

   @Unique
   private boolean rain$hasAdditionalOffset(ItemEntity entity) {
      BlockPos pos = entity.getBlockPos();
      BlockState current = entity.getEntityWorld().getBlockState(pos);
      BlockState below = entity.getEntityWorld().getBlockState(pos.down());
      return this.rain$requiresOffset(current) || this.rain$requiresOffset(below);
   }

   @Unique
   private void rain$renderFlatFacingCamera(ItemEntityRenderState submitter, MatrixStack state, OrderedRenderCommandQueue matrices) {
      Box box = state.itemRenderState.getModelBoundingBox();
      float bob = MathHelper.sin(state.age / 10.0F + state.uniqueOffset) * 0.1F + 0.1F;
      float yOffset = (float)(-box.minY + 0.0625);
      matrices.push();
      matrices.translate(0.0F, bob + yOffset, 0.0F);
      if (this.dispatcher.camera != null) {
         matrices.multiply(this.dispatcher.camera.getRotation());
      }

      ItemEntityRenderer.render(matrices, submitter, state.light, state, this.random, box);
      matrices.pop();
   }

   protected MixinItemEntityRenderer(Context context) {
      super(context);
   }

   @Unique
   private int rain$getModelCount(int count) {
      if (count > 48) {
         return 5;
      } else if (count > 32) {
         return 4;
      } else if (count > 16) {
         return 3;
      } else {
         return count > 1 ? 2 : 1;
      }
   }

   @Inject(method = "method_62470", at = @At("TAIL"))
   private void rain$updatePhysicsState(ItemEntity entity, ItemEntityRenderState ci, float state, CallbackInfo tickProgress) {
      if (ItemPhysicModule.INSTANCE.isPhysicsMode() && !state.itemRenderState.isEmpty()) {
         بر physics = (بر)state;
         physics.rain$setBlock(this.rain$isBlockItem(state.itemRenderState));
         this.rain$updateRotation(entity, physics.rain$isBlock());
         physics.rain$setAdditionalOffset(this.rain$hasAdditionalOffset(entity));
         physics.rain$setXRot(entity.getPitch());
         physics.rain$setYRot(entity.getYaw());
      }
   }

   @Unique
   private boolean rain$renderPhysics(ItemEntityRenderState matrices, MatrixStack state, OrderedRenderCommandQueue submitter) {
      if (state.age < 1.0F) {
         return false;
      }

      LayerRenderState firstLayer = ((ItemRenderStateAccessor)state.itemRenderState).rain$callGetFirstLayer();
      if (firstLayer == null) {
         return false;
      }

      Transformation transform = ((ItemRenderStateLayerAccessor)firstLayer).rain$getTransform();
      if (transform == null) {
         return false;
      }

      بر physics = (بر)state;
      int modelCount = state.renderedAmount;
      boolean isBlock = physics.rain$isBlock();
      matrices.push();
      this.random.setSeed(state.seed);
      matrices.multiply(RotationAxis.POSITIVE_X.rotation((float) (Math.PI / 2)));
      matrices.multiply(RotationAxis.POSITIVE_Z.rotation(physics.rain$getYRot()));
      if (state.age != 0.0F) {
         if (isBlock) {
            matrices.translate(0.0, -0.2, -0.08);
         } else if (physics.rain$hasAdditionalOffset()) {
            matrices.translate(0.0, 0.0, -0.14 - state.uniqueOffset * 0.007957747154594767);
         } else {
            matrices.translate(0.0, 0.0, -0.04 - state.uniqueOffset * 0.007957747154594767);
         }

         double scaleY = transform.scale().y();
         if (isBlock) {
            matrices.translate(0.0, scaleY, 0.0);
         }

         matrices.multiply(RotationAxis.POSITIVE_Y.rotation(physics.rain$getXRot()));
         if (isBlock) {
            matrices.translate(0.0, -scaleY, 0.0);
         }
      }

      if (!isBlock) {
         matrices.translate(0.0F, 0.0F, -0.09375F * (modelCount - 1) * 0.5F);
      }

      float scaleX = transform.scale().x();
      float scaleY = transform.scale().y();
      float scaleZ = transform.scale().z();

      for (int i = 0; i < modelCount; i++) {
         matrices.push();
         if (i > 0 && isBlock) {
            float offsetX = (this.random.nextFloat() * 2.0F - 1.0F) * scaleX;
            float offsetY = (this.random.nextFloat() * 2.0F - 1.0F) * scaleY;
            float offsetZ = (this.random.nextFloat() * 2.0F - 1.0F) * scaleZ;
            matrices.translate(offsetX, offsetY, offsetZ);
         }

         state.itemRenderState.render(matrices, submitter, state.light, OverlayTexture.DEFAULT_UV, state.outlineColor);
         matrices.pop();
         if (!isBlock) {
            matrices.translate(0.0F, 0.0F, 0.09375F * scaleZ);
         }
      }

      matrices.pop();
      return true;
   }

   @Unique
   private boolean rain$isBlockItem(ItemRenderState itemRenderState) {
      return itemRenderState.isSideLit();
   }

   @Inject(method = "method_3996", at = @At("HEAD"), cancellable = true)
   private void rain$renderCustomMode(
      ItemEntityRenderState matrices, MatrixStack cameraState, OrderedRenderCommandQueue state, CameraRenderState submitter, CallbackInfo ci
   ) {
      if (!state.itemRenderState.isEmpty()) {
         if (ItemPhysicModule.INSTANCE.is2DMode()) {
            this.rain$renderFlatFacingCamera(state, matrices, submitter);
            super.render(state, matrices, submitter, cameraState);
            ci.cancel();
         } else if (ItemPhysicModule.INSTANCE.isPhysicsMode()) {
            if (this.rain$renderPhysics(state, matrices, submitter)) {
               super.render(state, matrices, submitter, cameraState);
               ci.cancel();
            }
         }
      }
   }

   @Unique
   private void rain$updateRotation(ItemEntity isBlock, boolean entity) {
      MinecraftClient client = MinecraftClient.getInstance();
      float delta = client.getRenderTickCounter().getDynamicDeltaTicks() * 0.25F;
      if (client.isPaused()) {
         delta = 0.0F;
      }

      if (isBlock) {
         if (!entity.isOnGround()) {
            entity.setPitch(entity.getPitch() + delta * 2.0F);
         }
      } else if (entity.isOnGround()) {
         entity.setPitch(0.0F);
      } else {
         entity.setPitch(entity.getPitch() + delta * 2.0F);
      }
   }
}
