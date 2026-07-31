/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_10039
 *  net.minecraft.class_10428
 *  net.minecraft.class_10444
 *  net.minecraft.class_10444$class_10446
 *  net.minecraft.class_1542
 *  net.minecraft.class_1921
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_5617$class_5618
 *  net.minecraft.class_5819
 *  net.minecraft.class_7833
 *  net.minecraft.class_804
 *  net.minecraft.class_897
 *  net.minecraft.class_916
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.client.render.item.a;
import kotakbaz.rain.mixin.ItemRenderStateAccessor;
import kotakbaz.rain.mixin.ItemRenderStateLayerAccessor;
import kotakbaz.rain.module.modules.render.c_0;
import net.minecraft.class_10017;
import net.minecraft.class_10039;
import net.minecraft.class_10428;
import net.minecraft.class_10444;
import net.minecraft.class_1542;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5617;
import net.minecraft.class_5819;
import net.minecraft.class_7833;
import net.minecraft.class_804;
import net.minecraft.class_897;
import net.minecraft.class_916;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_916.class})
public abstract class MixinItemEntityRenderer
extends class_897<class_1542, class_10039> {
    @Unique
    private static final float rain$rotationStep = 0.25f;
    @Unique
    private static final double rain$uniqueOffsetStep = 0.007957747154594767;
    @Shadow
    private class_5819 field_4725;

    protected MixinItemEntityRenderer(class_5617.class_5618 context) {
        super(context);
    }

    @Inject(method={"method_3996"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$renderCustomMode(class_10039 state2, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (state2.field_55310.method_65606()) {
            return;
        }
        if (c_0.INSTANCE.is2DMode()) {
            this.rain$renderFlatFacingCamera(state2, matrices, vertexConsumers, light);
            super.method_3936((class_10017)state2, matrices, vertexConsumers, light);
            ci.cancel();
            return;
        }
        if (!c_0.INSTANCE.isPhysicsMode()) {
            return;
        }
        if (!this.rain$renderPhysics(state2, matrices, vertexConsumers, light)) {
            return;
        }
        super.method_3936((class_10017)state2, matrices, vertexConsumers, light);
        ci.cancel();
    }

    @Inject(method={"method_62470"}, at={@At(value="TAIL")})
    private void rain$updatePhysicsState(class_1542 entity, class_10039 state2, float tickProgress, CallbackInfo ci) {
        if (!c_0.INSTANCE.isPhysicsMode() || state2.field_55310.method_65606()) {
            return;
        }
        a physics = (a)state2;
        physics.rain$setBlock(this.rain$isBlockItem(state2.field_55310));
        this.rain$updateRotation(entity, physics.rain$isBlock());
        physics.rain$setAdditionalOffset(this.rain$hasAdditionalOffset(entity));
        physics.rain$setXRot(entity.method_36455());
        physics.rain$setYRot(entity.method_36454());
    }

    @Unique
    private void rain$renderFlatFacingCamera(class_10039 state2, class_4587 matrices, class_4597 vertexConsumers, int light) {
        class_238 box = state2.field_55310.method_72173();
        float bob = class_3532.method_15374((float)(state2.field_53328 / 10.0f + state2.field_53435)) * 0.1f + 0.1f;
        float yOffset = (float)(-box.field_1322 + 0.0625);
        matrices.method_22903();
        matrices.method_46416(0.0f, bob + yOffset, 0.0f);
        matrices.method_22907((Quaternionfc)this.field_4676.method_24197());
        class_916.method_56858((class_4587)matrices, (class_4597)vertexConsumers, (int)light, (class_10428)state2, (class_5819)this.field_4725, (class_238)box);
        matrices.method_22909();
    }

    @Unique
    private boolean rain$renderPhysics(class_10039 state2, class_4587 matrices, class_4597 vertexConsumers, int light) {
        if (state2.field_53328 < 1.0f) {
            return false;
        }
        class_10444.class_10446 firstLayer = ((ItemRenderStateAccessor)state2.field_55310).rain$callGetFirstLayer();
        if (firstLayer == null) {
            return false;
        }
        class_804 transform = ((ItemRenderStateLayerAccessor)firstLayer).rain$getTransform();
        if (transform == null) {
            return false;
        }
        a physics = (a)state2;
        int modelCount = this.rain$getModelCount(state2.field_55311);
        boolean isBlock = physics.rain$isBlock();
        matrices.method_22903();
        this.field_4725.method_43052((long)state2.field_55312);
        matrices.method_22907((Quaternionfc)class_7833.field_40714.rotation(1.5707964f));
        matrices.method_22907((Quaternionfc)class_7833.field_40718.rotation(physics.rain$getYRot()));
        if (state2.field_53328 != 0.0f) {
            if (isBlock) {
                matrices.method_22904(0.0, -0.2, -0.08);
            } else if (physics.rain$hasAdditionalOffset()) {
                matrices.method_22904(0.0, 0.0, -0.14 - (double)state2.field_53435 * 0.007957747154594767);
            } else {
                matrices.method_22904(0.0, 0.0, -0.04 - (double)state2.field_53435 * 0.007957747154594767);
            }
            double scaleY = transform.comp_3749().y();
            if (isBlock) {
                matrices.method_22904(0.0, scaleY, 0.0);
            }
            matrices.method_22907((Quaternionfc)class_7833.field_40716.rotation(physics.rain$getXRot()));
            if (isBlock) {
                matrices.method_22904(0.0, -scaleY, 0.0);
            }
        }
        if (!isBlock) {
            matrices.method_46416(0.0f, 0.0f, -0.09375f * (float)(modelCount - 1) * 0.5f);
        }
        float scaleX = transform.comp_3749().x();
        float scaleY = transform.comp_3749().y();
        float scaleZ = transform.comp_3749().z();
        for (int i = 0; i < modelCount; ++i) {
            matrices.method_22903();
            if (i > 0 && isBlock) {
                float offsetX = (this.field_4725.method_43057() * 2.0f - 1.0f) * scaleX;
                float offsetY = (this.field_4725.method_43057() * 2.0f - 1.0f) * scaleY;
                float offsetZ = (this.field_4725.method_43057() * 2.0f - 1.0f) * scaleZ;
                matrices.method_46416(offsetX, offsetY, offsetZ);
            }
            state2.field_55310.method_65604(matrices, vertexConsumers, light, class_4608.field_21444);
            matrices.method_22909();
            if (isBlock) continue;
            matrices.method_46416(0.0f, 0.0f, 0.09375f * scaleZ);
        }
        matrices.method_22909();
        return true;
    }

    @Unique
    private void rain$updateRotation(class_1542 entity, boolean isBlock) {
        class_310 client = class_310.method_1551();
        float delta = client.method_61966().method_60638() * 0.25f;
        if (client.method_1493()) {
            delta = 0.0f;
        }
        if (isBlock) {
            if (!entity.method_24828()) {
                entity.method_36457(entity.method_36455() + delta * 2.0f);
            }
            return;
        }
        if (entity.method_24828()) {
            entity.method_36457(0.0f);
            return;
        }
        entity.method_36457(entity.method_36455() + delta * 2.0f);
    }

    @Unique
    private boolean rain$isBlockItem(class_10444 itemRenderState) {
        class_10444.class_10446 firstLayer = ((ItemRenderStateAccessor)itemRenderState).rain$callGetFirstLayer();
        class_1921 renderLayer = firstLayer == null ? null : ((ItemRenderStateLayerAccessor)firstLayer).rain$getRenderLayer();
        return itemRenderState.method_65608() && (renderLayer == null || "item_entity_translucent_cull".equals(renderLayer.method_68484()));
    }

    @Unique
    private boolean rain$hasAdditionalOffset(class_1542 entity) {
        class_2338 pos = entity.method_24515();
        class_2680 current = entity.method_37908().method_8320(pos);
        class_2680 below = entity.method_37908().method_8320(pos.method_10074());
        return this.rain$requiresOffset(current) || this.rain$requiresOffset(below);
    }

    @Unique
    private boolean rain$requiresOffset(class_2680 state2) {
        return state2.method_27852(class_2246.field_10477) || state2.method_27852(class_2246.field_10114) || state2.method_27852(class_2246.field_37576);
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

