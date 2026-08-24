/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.entity.EntityRendererFactory$Context
 *  net.minecraft.client.render.entity.ItemEntityRenderer
 *  net.minecraft.client.render.entity.state.EntityRenderState
 *  net.minecraft.client.render.entity.state.ItemEntityRenderState
 *  net.minecraft.client.render.entity.state.ItemStackEntityRenderState
 *  net.minecraft.client.render.item.ItemRenderState
 *  net.minecraft.client.render.item.ItemRenderState$LayerRenderState
 *  net.minecraft.client.render.model.json.Transformation
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.random.Random
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.mixin.ItemRenderStateAccessor;
import kotakbaz.rain.mixin.ItemRenderStateLayerAccessor;
import kotakbaz.rain.module.modules.render.ItemPhysicModule;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.render.entity.state.ItemStackEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.render.model.json.Transformation;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.random.Random;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0628\u0631;

@Mixin(value={ItemEntityRenderer.class})
public abstract class MixinItemEntityRenderer
extends EntityRenderer<ItemEntity, ItemEntityRenderState> {
    @Unique
    private static final float rain$rotationStep = 0.25f;
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
    private void rain$renderFlatFacingCamera(ItemEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue submitter) {
        Box box = state.itemRenderState.getModelBoundingBox();
        float bob = MathHelper.sin((double)(state.age / 10.0f + state.uniqueOffset)) * 0.1f + 0.1f;
        float yOffset = (float)(-box.minY + 0.0625);
        matrices.push();
        matrices.translate(0.0f, bob + yOffset, 0.0f);
        if (this.dispatcher.camera != null) {
            matrices.multiply((Quaternionfc)this.dispatcher.camera.getRotation());
        }
        ItemEntityRenderer.render((MatrixStack)matrices, (OrderedRenderCommandQueue)submitter, (int)state.light, (ItemStackEntityRenderState)state, (Random)this.random, (Box)box);
        matrices.pop();
    }

    protected MixinItemEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Unique
    private int rain$getModelCount(int count) {
        if (count > 48) {
            return 5;
        }
        if (count > 32) {
            return 4;
        }
        if (count > 16) {
            return 3;
        }
        if (count > 1) {
            return 2;
        }
        return 1;
    }

    @Inject(method={"method_62470"}, at={@At(value="TAIL")})
    private void rain$updatePhysicsState(ItemEntity entity, ItemEntityRenderState state, float tickProgress, CallbackInfo ci) {
        if (!ItemPhysicModule.INSTANCE.isPhysicsMode() || state.itemRenderState.isEmpty()) {
            return;
        }
        \u0628\u0631 physics = (\u0628\u0631)state;
        physics.rain$setBlock(this.rain$isBlockItem(state.itemRenderState));
        this.rain$updateRotation(entity, physics.rain$isBlock());
        physics.rain$setAdditionalOffset(this.rain$hasAdditionalOffset(entity));
        physics.rain$setXRot(entity.getPitch());
        physics.rain$setYRot(entity.getYaw());
    }

    @Unique
    private boolean rain$renderPhysics(ItemEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue submitter) {
        if (state.age < 1.0f) {
            return false;
        }
        ItemRenderState.LayerRenderState firstLayer = ((ItemRenderStateAccessor)state.itemRenderState).rain$callGetFirstLayer();
        if (firstLayer == null) {
            return false;
        }
        Transformation transform = ((ItemRenderStateLayerAccessor)firstLayer).rain$getTransform();
        if (transform == null) {
            return false;
        }
        \u0628\u0631 physics = (\u0628\u0631)state;
        int modelCount = state.renderedAmount;
        boolean isBlock = physics.rain$isBlock();
        matrices.push();
        this.random.setSeed((long)state.seed);
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotation(1.5707964f));
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotation(physics.rain$getYRot()));
        if (state.age != 0.0f) {
            if (isBlock) {
                matrices.translate(0.0, -0.2, -0.08);
            } else if (physics.rain$hasAdditionalOffset()) {
                matrices.translate(0.0, 0.0, -0.14 - (double)state.uniqueOffset * 0.007957747154594767);
            } else {
                matrices.translate(0.0, 0.0, -0.04 - (double)state.uniqueOffset * 0.007957747154594767);
            }
            double scaleY = transform.scale().y();
            if (isBlock) {
                matrices.translate(0.0, scaleY, 0.0);
            }
            matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotation(physics.rain$getXRot()));
            if (isBlock) {
                matrices.translate(0.0, -scaleY, 0.0);
            }
        }
        if (!isBlock) {
            matrices.translate(0.0f, 0.0f, -0.09375f * (float)(modelCount - 1) * 0.5f);
        }
        float scaleX = transform.scale().x();
        float scaleY = transform.scale().y();
        float scaleZ = transform.scale().z();
        for (int i = 0; i < modelCount; ++i) {
            matrices.push();
            if (i > 0 && isBlock) {
                float offsetX = (this.random.nextFloat() * 2.0f - 1.0f) * scaleX;
                float offsetY = (this.random.nextFloat() * 2.0f - 1.0f) * scaleY;
                float offsetZ = (this.random.nextFloat() * 2.0f - 1.0f) * scaleZ;
                matrices.translate(offsetX, offsetY, offsetZ);
            }
            state.itemRenderState.render(matrices, submitter, state.light, OverlayTexture.DEFAULT_UV, state.outlineColor);
            matrices.pop();
            if (isBlock) continue;
            matrices.translate(0.0f, 0.0f, 0.09375f * scaleZ);
        }
        matrices.pop();
        return true;
    }

    @Unique
    private boolean rain$isBlockItem(ItemRenderState itemRenderState) {
        return itemRenderState.isSideLit();
    }

    @Inject(method={"method_3996"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$renderCustomMode(ItemEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue submitter, CameraRenderState cameraState, CallbackInfo ci) {
        if (state.itemRenderState.isEmpty()) {
            return;
        }
        if (ItemPhysicModule.INSTANCE.is2DMode()) {
            this.rain$renderFlatFacingCamera(state, matrices, submitter);
            super.render((EntityRenderState)state, matrices, submitter, cameraState);
            ci.cancel();
            return;
        }
        if (!ItemPhysicModule.INSTANCE.isPhysicsMode()) {
            return;
        }
        if (!this.rain$renderPhysics(state, matrices, submitter)) {
            return;
        }
        super.render((EntityRenderState)state, matrices, submitter, cameraState);
        ci.cancel();
    }

    @Unique
    private void rain$updateRotation(ItemEntity entity, boolean isBlock) {
        MinecraftClient client = MinecraftClient.getInstance();
        float delta = client.getRenderTickCounter().getDynamicDeltaTicks() * 0.25f;
        if (client.isPaused()) {
            delta = 0.0f;
        }
        if (isBlock) {
            if (!entity.isOnGround()) {
                entity.setPitch(entity.getPitch() + delta * 2.0f);
            }
            return;
        }
        if (entity.isOnGround()) {
            entity.setPitch(0.0f);
            return;
        }
        entity.setPitch(entity.getPitch() + delta * 2.0f);
    }
}

