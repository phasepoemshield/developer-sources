package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.Vec3d;

public class EventFireworkMotion
extends Event {
    private LivingEntity entity;
    private FireworkRocketEntity fireworkRocketEntity;
    private Vec3d vector3d;

    @Generated
    public LivingEntity getEntity() {
        return this.entity;
    }

    @Generated
    public FireworkRocketEntity getFireworkRocketEntity() {
        return this.fireworkRocketEntity;
    }

    @Generated
    public Vec3d getVector3d() {
        return this.vector3d;
    }

    @Generated
    public void setEntity(LivingEntity entity) {
        this.entity = entity;
    }

    @Generated
    public void setFireworkRocketEntity(FireworkRocketEntity fireworkRocketEntity) {
        this.fireworkRocketEntity = fireworkRocketEntity;
    }

    @Generated
    public void setVector3d(Vec3d vector3d) {
        this.vector3d = vector3d;
    }

    @Generated
    public EventFireworkMotion(LivingEntity entity, FireworkRocketEntity fireworkRocketEntity, Vec3d vector3d) {
        this.entity = entity;
        this.fireworkRocketEntity = fireworkRocketEntity;
        this.vector3d = vector3d;
    }
}