package moscow.rockstar.module.visuals.esp;

import net.minecraft.entity.Entity;

public record EspTarget(Entity entity, EspTargetType type, EspPlayerType playerType, EspItemType itemType) {
}
