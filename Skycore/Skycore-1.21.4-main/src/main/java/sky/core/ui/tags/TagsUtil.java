package sky.core.ui.tags;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import sky.core.module.impl.visuals.TagsModule;

public final class TagsUtil {
    private TagsUtil() {
    }

    public static boolean shouldHideVanillaNameTag(Entity entity) {
        TagsModule module = TagsModule.INSTANCE;
        if (!module.isEnabled() || !module.hideOriginal.get()) {
            return false;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null || client.world == null) {
            return false;
        }

        if (entity instanceof ItemEntity) {
            return module.show.is("Items");
        }

        if (entity instanceof LivingEntity living && living.isAlive()) {
            return isEntityTarget(living, module);
        }

        return false;
    }

    public static boolean isEntityTarget(LivingEntity entity, TagsModule module) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (entity == client.player) {
            return module.show.is("Self") && !client.options.getPerspective().isFirstPerson();
        }
        if (entity instanceof PlayerEntity player) {
            if (hasNoArmor(player)) {
                return module.show.is("Naked");
            }
            return module.show.is("Players");
        }
        if (entity instanceof VillagerEntity) {
            return module.show.is("Villagers");
        }
        if (entity instanceof AnimalEntity) {
            return module.show.is("Animals");
        }
        if (entity instanceof MobEntity) {
            return module.show.is("Monsters");
        }
        return false;
    }

    private static boolean hasNoArmor(PlayerEntity player) {
        for (ItemStack stack : player.getArmorItems()) {
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
