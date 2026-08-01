package fun.nexisdlc.modules.impl.player;

import com.mojang.authlib.GameProfile;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.entity.EventAttack;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@FunctionAdd(name = "FakePlayer", alias = "Fake Player", category = Category.Player, description = "Спавнит фейк игрока на месте")
public class FakePlayer extends Function {
    private static int nextEntityId = -1337;

    private OtherClientPlayerEntity fake;
    private World lastWorld;
    private double spawnX;
    private double spawnY;
    private double spawnZ;
    private float spawnYaw;
    private float spawnPitch;

    @Override
    public void onEnable() {
        if (mc.player == null || mc.world == null) {
            setState(false);
            return;
        }

        String name = mc.player.getName().getString() + "_fake";
        GameProfile profile = new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + name).getBytes(StandardCharsets.UTF_8)), name);
        fake = new OtherClientPlayerEntity(mc.world, profile);
        fake.setId(nextEntityId--);

        spawnX = mc.player.getX();
        spawnY = mc.player.getY();
        spawnZ = mc.player.getZ();
        spawnYaw = mc.player.getYaw();
        spawnPitch = mc.player.getPitch();
        fake.refreshPositionAndAngles(spawnX, spawnY, spawnZ, spawnYaw, spawnPitch);
        fake.setHeadYaw(spawnYaw);
        fake.setHealth(fake.getMaxHealth());
        fake.setNoGravity(true);
        fake.setVelocity(Vec3d.ZERO);

        mc.world.addEntity(fake);
        lastWorld = mc.world;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        if (fake != null) {
            World world = mc.world != null ? mc.world : lastWorld;
            fake.remove(Entity.RemovalReason.DISCARDED);
            if (world instanceof ClientWorld clientWorld) {
                clientWorld.removeEntity(fake.getId(), Entity.RemovalReason.DISCARDED);
            }
        }
        fake = null;
        super.onDisable();
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.world == null || fake == null || mc.world != lastWorld) {
            setState(false);
            return;
        }
        fake.refreshPositionAndAngles(spawnX, spawnY, spawnZ, spawnYaw, spawnPitch);
        fake.setHeadYaw(spawnYaw);
        fake.setYaw(spawnYaw);
        fake.setPitch(spawnPitch);
        fake.setVelocity(Vec3d.ZERO);
        fake.setNoGravity(true);
    }

    @EventHandler
    public void onAttack(EventAttack.Swing event) {
        // if (isFakeEntity(event.getTarget())) {
        //     event.cancel();
        // }
    }

    public boolean isFakeEntity(Entity entity) {
        return entity != null && fake != null && entity.getId() == fake.getId();
    }
}
