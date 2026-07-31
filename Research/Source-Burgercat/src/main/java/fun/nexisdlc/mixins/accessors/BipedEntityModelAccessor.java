package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BipedEntityModel.class)
public interface BipedEntityModelAccessor {
    @Accessor("head")
    ModelPart nexis$getHead();

    @Accessor("hat")
    ModelPart nexis$getHat();

    @Accessor("body")
    ModelPart nexis$getBody();

    @Accessor("rightArm")
    ModelPart nexis$getRightArm();

    @Accessor("leftArm")
    ModelPart nexis$getLeftArm();

    @Accessor("rightLeg")
    ModelPart nexis$getRightLeg();

    @Accessor("leftLeg")
    ModelPart nexis$getLeftLeg();
}
