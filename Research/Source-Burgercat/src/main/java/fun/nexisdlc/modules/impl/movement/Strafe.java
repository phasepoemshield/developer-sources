package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.entity.EventMove;
import fun.nexisdlc.client.events.impl.player.SprintEvent;
import fun.nexisdlc.client.events.impl.client.EventSync;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.mixins.accessors.ClientPlayerEntityAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;

@FunctionAdd(name = "BunnyHop", alias = "Bunny Hop", category = Category.Movement, description = "Позволяет банихопить")
public class Strafe extends Function {
    public SliderSetting speedS = new SliderSetting("Скорость", 1.3f, 1f, 6f, 0.1f);

    public static double oldSpeed, contextFriction, fovval;
    public static boolean needSwap, needSprintState, disabled;
    public static int noSlowTicks;

    public Strafe() {
        addSettings(speedS);
    }

    public double calculateSpeed(EventMove move) {
        float speedAttributes = getAIMoveSpeed();
        final float frictionFactor = mc.world.getBlockState(new BlockPos.Mutable().set(mc.player.getX(), getBoundingBox().getMin(Direction.Axis.Y) - move.getY(), mc.player.getZ())).getBlock().getSlipperiness() * 0.91F;
        float n6 = mc.player.hasStatusEffect(StatusEffects.JUMP_BOOST) && mc.player.isUsingItem() ? 0.9f : (float) (oldSpeed > 0.32 && mc.player.isUsingItem() ? 0.88 : 0.91F);
        if (mc.player.isOnGround())
            n6 = frictionFactor;

        float n7 = (float) (0.1631f / Math.pow(n6, 3.0f));
        float n8;
        if (mc.player.isOnGround()) {
            n8 = speedAttributes * n7;
            if (move.getY() > 0)
                n8 += 0.2f;
            disabled = false;
        } else n8 = 0.0255f;

        boolean noslow = false;
        double max2 = oldSpeed + n8;
        double max = 0.0;

        // if (mc.player.isUsingItem() && move.getY() <= 0) {
        //     double n10 = oldSpeed + n8 * 0.25;
        //     double motionY2 = move.getY();
        //     if (motionY2 != 0.0 && Math.abs(motionY2) < 0.08) {
        //         n10 += 0.055;
        //     }
        //     if (max2 > (max = Math.max(0.043, n10))) {
        //         noslow = true;
        //         ++noSlowTicks;
        //     } else {
        //         noSlowTicks = Math.max(noSlowTicks - 1, 0);
        //     }
        // } else {
        //     noSlowTicks = 0;
        // }

        if (noSlowTicks > 3) max2 = max - 0.019;
        else max2 = Math.max(noslow ? 0 : 0.25, max2) - (mc.player.age % 2 == 0 ? 0.001 : 0.002);

        contextFriction = n6;
        if (!mc.player.isOnGround()) {
            needSprintState = !((ClientPlayerEntityAccessor) mc.player).getLastSprinting();
            needSwap = true;
        } else needSprintState = false;

        if (mc.player.isOnGround()) max2 *= 0.924f;
        if (!mc.player.isOnGround()) max2 *= 1.1;

        return max2;
    }

    public float getAIMoveSpeed() {
        boolean prevSprinting = mc.player.isSprinting();
        mc.player.setSprinting(false);
        float speed = mc.player.getMovementSpeed() *
                (mc.player.isOnGround() ? speedS.get() * getGroundRandomizedMultiplier() : speedS.get() * getAirRandomizedMultiplier());
        mc.player.setSprinting(prevSprinting);
        return speed;
    }

    float getGroundRandomizedMultiplier() {
        return 1;
    }

    float getAirRandomizedMultiplier() {
        return 5;
    }

    @Override
    public void onEnable() {
        oldSpeed = 0.0;
        fovval = mc.options.getFovEffectScale().getValue();
        mc.options.getFovEffectScale().setValue(0d);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        mc.options.getFovEffectScale().setValue(fovval);
        super.onDisable();
    }

    public boolean canStrafe() {
        if (mc.player.isSneaking()) {
            return false;
        }
        if (mc.player.isInLava()) {
            return false;
        }
        if (mc.player.isSubmergedInWater()) {
            return false;
        }
        return !mc.player.getAbilities().flying;
    }

    public Box getBoundingBox() {
        return new Box(mc.player.getX() - 0.1, mc.player.getY(), mc.player.getZ() - 0.1, mc.player.getX() + 0.1, mc.player.getY() + 1, mc.player.getZ() + 0.1);
    }

    @EventHandler
    public void onMove(EventMove event) {
        if (canStrafe()) {
            if (PlayerUtils.isMoving()) {
                double[] motions = PlayerUtils.forward(calculateSpeed(event));

                event.setX(motions[0]);
                event.setZ(motions[1]);
            } else {
                oldSpeed = 0;
                event.setX(0);
                event.setZ(0);
            }
            event.cancel();
        } else {
            oldSpeed = 0;
        }
    }

    @EventHandler
    public void onSync(EventSync e) {
        oldSpeed = Math.hypot(mc.player.getX() - mc.player.lastX, mc.player.getZ() - mc.player.lastZ) * contextFriction;
    }

    @EventHandler
    public void onPacketReceive(EventPacket e) {
        if (!e.isReceive()) return;

        if (e.getPacket() instanceof PlayerPositionLookS2CPacket) {
            oldSpeed = 0;
        }
    }

    @EventHandler
    public void actionEvent(SprintEvent eventAction) {
        if (canStrafe()) {
            if (eventAction.isSprinting() != needSprintState) {
                eventAction.setSprinting(!eventAction.isSprinting());
            }
        }
        if (needSwap) {
            eventAction.setSprinting(!((ClientPlayerEntityAccessor) mc.player).getLastSprinting());
            needSwap = false;
        }
    }
}
