/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07082
 *  minecraft.class08035
 */
package net.fabricmc.fabric.api.entity.event.v1;

import minecraft.class07082;
import minecraft.class08035;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowBed;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowNearbyMonsters;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowResettingTime;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowSettingSpawn;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$AllowSleeping;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$ModifySleepingDirection;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$ModifyWakeUpPosition;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$SetBedOccupationState;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$StartSleeping;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents$StopSleeping;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class EntitySleepEvents {
    public static final Event<EntitySleepEvents$AllowSleeping> ALLOW_SLEEPING = EventFactory.createArrayBacked(EntitySleepEvents$AllowSleeping.class, entitySleepEvents$AllowSleepingArray -> (class080362, class072092) -> {
        for (EntitySleepEvents$AllowSleeping entitySleepEvents$AllowSleeping : entitySleepEvents$AllowSleepingArray) {
            class08035 class080352 = entitySleepEvents$AllowSleeping.allowSleep(class080362, class072092);
            if (class080352 == null) continue;
            return class080352;
        }
        return null;
    });
    public static final Event<EntitySleepEvents$StartSleeping> START_SLEEPING = EventFactory.createArrayBacked(EntitySleepEvents$StartSleeping.class, entitySleepEvents$StartSleepingArray -> (class074382, class072092) -> {
        for (EntitySleepEvents$StartSleeping entitySleepEvents$StartSleeping : entitySleepEvents$StartSleepingArray) {
            entitySleepEvents$StartSleeping.onStartSleeping(class074382, class072092);
        }
    });
    public static final Event<EntitySleepEvents$StopSleeping> STOP_SLEEPING = EventFactory.createArrayBacked(EntitySleepEvents$StopSleeping.class, entitySleepEvents$StopSleepingArray -> (class074382, class072092) -> {
        for (EntitySleepEvents$StopSleeping entitySleepEvents$StopSleeping : entitySleepEvents$StopSleepingArray) {
            entitySleepEvents$StopSleeping.onStopSleeping(class074382, class072092);
        }
    });
    public static final Event<EntitySleepEvents$AllowBed> ALLOW_BED = EventFactory.createArrayBacked(EntitySleepEvents$AllowBed.class, entitySleepEvents$AllowBedArray -> (class074382, class072092, class005002, bl) -> {
        for (EntitySleepEvents$AllowBed entitySleepEvents$AllowBed : entitySleepEvents$AllowBedArray) {
            class07082 class070822 = entitySleepEvents$AllowBed.allowBed(class074382, class072092, class005002, bl);
            if (class070822 == class07082.i) continue;
            return class070822;
        }
        return class07082.i;
    });
    public static final Event<EntitySleepEvents$AllowNearbyMonsters> ALLOW_NEARBY_MONSTERS = EventFactory.createArrayBacked(EntitySleepEvents$AllowNearbyMonsters.class, entitySleepEvents$AllowNearbyMonstersArray -> (class080362, class072092, bl) -> {
        for (EntitySleepEvents$AllowNearbyMonsters entitySleepEvents$AllowNearbyMonsters : entitySleepEvents$AllowNearbyMonstersArray) {
            class07082 class070822 = entitySleepEvents$AllowNearbyMonsters.allowNearbyMonsters(class080362, class072092, bl);
            if (class070822 == class07082.i) continue;
            return class070822;
        }
        return class07082.i;
    });
    public static final Event<EntitySleepEvents$AllowResettingTime> ALLOW_RESETTING_TIME = EventFactory.createArrayBacked(EntitySleepEvents$AllowResettingTime.class, entitySleepEvents$AllowResettingTimeArray -> class080362 -> {
        for (EntitySleepEvents$AllowResettingTime entitySleepEvents$AllowResettingTime : entitySleepEvents$AllowResettingTimeArray) {
            if (entitySleepEvents$AllowResettingTime.allowResettingTime(class080362)) continue;
            return false;
        }
        return true;
    });
    public static final Event<EntitySleepEvents$ModifySleepingDirection> MODIFY_SLEEPING_DIRECTION = EventFactory.createArrayBacked(EntitySleepEvents$ModifySleepingDirection.class, entitySleepEvents$ModifySleepingDirectionArray -> (class074382, class072092, class072112) -> {
        for (EntitySleepEvents$ModifySleepingDirection entitySleepEvents$ModifySleepingDirection : entitySleepEvents$ModifySleepingDirectionArray) {
            class072112 = entitySleepEvents$ModifySleepingDirection.modifySleepDirection(class074382, class072092, class072112);
        }
        return class072112;
    });
    public static final Event<EntitySleepEvents$AllowSettingSpawn> ALLOW_SETTING_SPAWN = EventFactory.createArrayBacked(EntitySleepEvents$AllowSettingSpawn.class, entitySleepEvents$AllowSettingSpawnArray -> (class080362, class072092) -> {
        for (EntitySleepEvents$AllowSettingSpawn entitySleepEvents$AllowSettingSpawn : entitySleepEvents$AllowSettingSpawnArray) {
            if (entitySleepEvents$AllowSettingSpawn.allowSettingSpawn(class080362, class072092)) continue;
            return false;
        }
        return true;
    });
    public static final Event<EntitySleepEvents$SetBedOccupationState> SET_BED_OCCUPATION_STATE = EventFactory.createArrayBacked(EntitySleepEvents$SetBedOccupationState.class, entitySleepEvents$SetBedOccupationStateArray -> (class074382, class072092, class005002, bl) -> {
        for (EntitySleepEvents$SetBedOccupationState entitySleepEvents$SetBedOccupationState : entitySleepEvents$SetBedOccupationStateArray) {
            if (!entitySleepEvents$SetBedOccupationState.setBedOccupationState(class074382, class072092, class005002, bl)) continue;
            return true;
        }
        return false;
    });
    public static final Event<EntitySleepEvents$ModifyWakeUpPosition> MODIFY_WAKE_UP_POSITION = EventFactory.createArrayBacked(EntitySleepEvents$ModifyWakeUpPosition.class, entitySleepEvents$ModifyWakeUpPositionArray -> (class074382, class072092, class005002, class068892) -> {
        for (EntitySleepEvents$ModifyWakeUpPosition entitySleepEvents$ModifyWakeUpPosition : entitySleepEvents$ModifyWakeUpPositionArray) {
            class068892 = entitySleepEvents$ModifyWakeUpPosition.modifyWakeUpPosition(class074382, class072092, class005002, class068892);
        }
        return class068892;
    });

    private EntitySleepEvents() {
    }
}

