package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PlayerEntityModel.class)
public interface PlayerEntityModelAccessor {
    @Accessor("leftSleeve")
    ModelPart nexis$getLeftSleeve();

    @Accessor("rightSleeve")
    ModelPart nexis$getRightSleeve();

    @Accessor("leftPants")
    ModelPart nexis$getLeftPants();

    @Accessor("rightPants")
    ModelPart nexis$getRightPants();

    @Accessor("jacket")
    ModelPart nexis$getJacket();
}
