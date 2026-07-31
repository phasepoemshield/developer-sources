package fun.wonderful.mixin;

import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ItemEntity.class})
public interface ItemEntityAccessor {
    @Accessor(value="thrower")
    public Entity wonderful$getThrower();

    @Accessor(value="owner")
    public UUID wonderful$getOwner();
}