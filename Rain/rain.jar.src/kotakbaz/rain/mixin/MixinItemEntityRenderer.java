/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.item.a;
import kotakbaz.rain.mixin.ItemRenderStateAccessor;
import kotakbaz.rain.mixin.ItemRenderStateLayerAccessor;
import kotakbaz.rain.module.modules.render.ItemPhysicModule;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.render.entity.state.ItemStackEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.render.model.json.Transformation;
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

@Mixin(value={ItemEntityRenderer.class})
public abstract class MixinItemEntityRenderer
extends EntityRenderer<ItemEntity, ItemEntityRenderState> {
    @Unique
    private static final float rain$rotationStep = 0.25f;
    @Unique
    private static final double rain$uniqueOffsetStep = 0.007957747154594767;
    @Shadow
    private Random field_4725;

    protected MixinItemEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Inject(method={"method_3996"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$renderCustomMode(ItemEntityRenderState state2, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
        if (state2.itemRenderState.isEmpty()) {
            return;
        }
        if (ItemPhysicModule.INSTANCE.is2DMode()) {
            this.rain$renderFlatFacingCamera(state2, matrices, vertexConsumers, light);
            super.render((EntityRenderState)state2, matrices, vertexConsumers, light);
            ci.cancel();
            return;
        }
        if (!ItemPhysicModule.INSTANCE.isPhysicsMode()) {
            return;
        }
        if (!this.rain$renderPhysics(state2, matrices, vertexConsumers, light)) {
            return;
        }
        super.render((EntityRenderState)state2, matrices, vertexConsumers, light);
        ci.cancel();
    }

    @Inject(method={"method_62470"}, at={@At(value="TAIL")})
    private void rain$updatePhysicsState(ItemEntity entity, ItemEntityRenderState state2, float tickProgress, CallbackInfo ci) {
        if (!ItemPhysicModule.INSTANCE.isPhysicsMode() || state2.itemRenderState.isEmpty()) {
            return;
        }
        a physics = (a)state2;
        physics.rain$setBlock(this.rain$isBlockItem(state2.itemRenderState));
        this.rain$updateRotation(entity, physics.rain$isBlock());
        physics.rain$setAdditionalOffset(this.rain$hasAdditionalOffset(entity));
        physics.rain$setXRot(entity.getPitch());
        physics.rain$setYRot(entity.getYaw());
    }

    @Unique
    private void rain$renderFlatFacingCamera(ItemEntityRenderState state2, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        Box box = state2.itemRenderState.getModelBoundingBox();
        float bob = MathHelper.sin((float)(state2.age / 10.0f + state2.uniqueOffset)) * 0.1f + 0.1f;
        float yOffset = (float)(-box.minY + 0.0625);
        matrices.push();
        matrices.translate(0.0f, bob + yOffset, 0.0f);
        matrices.multiply((Quaternionfc)this.dispatcher.getRotation());
        ItemEntityRenderer.renderStack((MatrixStack)matrices, (VertexConsumerProvider)vertexConsumers, (int)light, (ItemStackEntityRenderState)state2, (Random)this.field_4725, (Box)box);
        matrices.pop();
    }

    @Unique
    private boolean rain$renderPhysics(ItemEntityRenderState state2, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        if (state2.age < 1.0f) {
            return false;
        }
        ItemRenderState.LayerRenderState firstLayer = ((ItemRenderStateAccessor)state2.itemRenderState).rain$callGetFirstLayer();
        if (firstLayer == null) {
            return false;
        }
        Transformation transform = ((ItemRenderStateLayerAccessor)firstLayer).rain$getTransform();
        if (transform == null) {
            return false;
        }
        a physics = (a)state2;
        int modelCount = this.rain$getModelCount(state2.renderedAmount);
        boolean isBlock = physics.rain$isBlock();
        matrices.push();
        this.field_4725.setSeed((long)state2.seed);
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotation(1.5707964f));
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotation(physics.rain$getYRot()));
        if (state2.age != 0.0f) {
            if (isBlock) {
                matrices.translate(0.0, -0.2, -0.08);
            } else if (physics.rain$hasAdditionalOffset()) {
                matrices.translate(0.0, 0.0, -0.14 - (double)state2.uniqueOffset * 0.007957747154594767);
            } else {
                matrices.translate(0.0, 0.0, -0.04 - (double)state2.uniqueOffset * 0.007957747154594767);
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
        for (int i2 = 0; i2 < modelCount; ++i2) {
            matrices.push();
            if (i2 > 0 && isBlock) {
                float offsetX = (this.field_4725.nextFloat() * 2.0f - 1.0f) * scaleX;
                float offsetY = (this.field_4725.nextFloat() * 2.0f - 1.0f) * scaleY;
                float offsetZ = (this.field_4725.nextFloat() * 2.0f - 1.0f) * scaleZ;
                matrices.translate(offsetX, offsetY, offsetZ);
            }
            state2.itemRenderState.render(matrices, vertexConsumers, light, OverlayTexture.DEFAULT_UV);
            matrices.pop();
            if (isBlock) continue;
            matrices.translate(0.0f, 0.0f, 0.09375f * scaleZ);
        }
        matrices.pop();
        return true;
    }

    @Unique
    private void rain$updateRotation(ItemEntity entity, boolean isBlock) {
        MinecraftClient client = MinecraftClient.getInstance();
        float delta = client.getRenderTickCounter().getFixedDeltaTicks() * 0.25f;
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

    @Unique
    private boolean rain$isBlockItem(ItemRenderState itemRenderState) {
        ItemRenderState.LayerRenderState firstLayer = ((ItemRenderStateAccessor)itemRenderState).rain$callGetFirstLayer();
        RenderLayer renderLayer = firstLayer == null ? null : ((ItemRenderStateLayerAccessor)firstLayer).rain$getRenderLayer();
        return itemRenderState.isSideLit() && (renderLayer == null || "item_entity_translucent_cull".equals(renderLayer.getName()));
    }

    @Unique
    private boolean rain$hasAdditionalOffset(ItemEntity entity) {
        BlockPos pos = entity.getBlockPos();
        BlockState current = entity.getWorld().getBlockState(pos);
        BlockState below = entity.getWorld().getBlockState(pos.down());
        return this.rain$requiresOffset(current) || this.rain$requiresOffset(below);
    }

    @Unique
    private boolean rain$requiresOffset(BlockState state2) {
        return state2.isOf(Blocks.SNOW) || state2.isOf(Blocks.SOUL_SAND) || state2.isOf(Blocks.MUD);
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
}

