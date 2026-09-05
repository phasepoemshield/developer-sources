/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.ProtocolLogger
 */
package com.viaversion.viabackwards.api.entities.storage;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.EntityPositionStorage;
import com.viaversion.viabackwards.api.rewriters.EntityRewriterBase;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.ProtocolLogger;
import java.util.function.Supplier;

public class EntityPositionHandler {
    public static final double RELATIVE_MOVE_FACTOR = 4096.0;
    private final EntityRewriterBase<?, ?> entityRewriter;
    private final Class<? extends EntityPositionStorage> storageClass;
    private final Supplier<? extends EntityPositionStorage> storageSupplier;
    private boolean warnedForMissingEntity;

    public EntityPositionHandler(EntityRewriterBase<?, ?> entityRewriter, Class<? extends EntityPositionStorage> storageClass, Supplier<? extends EntityPositionStorage> storageSupplier) {
        this.entityRewriter = entityRewriter;
        this.storageClass = storageClass;
        this.storageSupplier = storageSupplier;
    }

    public EntityPositionStorage getStorage(UserConnection user, int entityId) {
        EntityPositionStorage entityStorage;
        StoredEntityData storedEntity = this.entityRewriter.tracker(user).entityData(entityId);
        if (storedEntity == null || (entityStorage = (EntityPositionStorage)storedEntity.get(EntityPositionStorage.class)) == null) {
            ((BackwardsProtocol)this.entityRewriter.protocol()).getLogger().warning("Untracked entity with id " + entityId + " in " + this.storageClass.getSimpleName());
            return null;
        }
        return entityStorage;
    }

    public static void writeFacingDegrees(PacketWrapper wrapper, double x, double y, double z, double targetX, double targetY, double targetZ) {
        double dX = targetX - x;
        double dY = targetY - y;
        double dZ = targetZ - z;
        double r = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
        double yaw = -Math.atan2(dX, dZ) / Math.PI * 180.0;
        if (yaw < 0.0) {
            yaw = 360.0 + yaw;
        }
        double pitch = -Math.asin(dY / r) / Math.PI * 180.0;
        wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)yaw));
        wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((float)pitch));
    }

    public void cacheEntityPosition(PacketWrapper wrapper, int entityId, double x, double y, double z, boolean create, boolean relative) {
        EntityPositionStorage positionStorage;
        StoredEntityData storedEntity = this.entityRewriter.tracker(wrapper.user()).entityData(entityId);
        if (storedEntity == null) {
            if (Via.getManager().isDebug()) {
                ProtocolLogger logger = ((BackwardsProtocol)this.entityRewriter.protocol()).getLogger();
                logger.warning("Stored entity with id " + entityId + " missing at position: " + x + " - " + y + " - " + z + " in " + this.storageClass.getSimpleName());
                if (entityId == -1 && x == 0.0 && y == 0.0 && z == 0.0) {
                    logger.warning("DO NOT REPORT THIS TO VIA, THIS IS A PLUGIN ISSUE");
                } else if (!this.warnedForMissingEntity) {
                    this.warnedForMissingEntity = true;
                    logger.warning("This is very likely caused by a plugin sending a teleport packet for an entity outside of the player's range.");
                }
            }
            return;
        }
        if (create) {
            positionStorage = this.storageSupplier.get();
            storedEntity.put((Object)positionStorage);
        } else {
            positionStorage = (EntityPositionStorage)storedEntity.get(this.storageClass);
            if (positionStorage == null) {
                ((BackwardsProtocol)this.entityRewriter.protocol()).getLogger().warning("Stored entity with id " + entityId + " missing " + this.storageClass.getSimpleName());
                return;
            }
        }
        if (relative) {
            positionStorage.addRelativePosition(x, y, z);
        } else {
            positionStorage.setPosition(x, y, z);
        }
    }

    public void cacheEntityPosition(PacketWrapper wrapper, boolean create, boolean relative) {
        this.cacheEntityPosition(wrapper, (Double)wrapper.get((Type)Types.DOUBLE, 0), (Double)wrapper.get((Type)Types.DOUBLE, 1), (Double)wrapper.get((Type)Types.DOUBLE, 2), create, relative);
    }

    public void cacheEntityPosition(PacketWrapper wrapper, double x, double y, double z, boolean create, boolean relative) {
        this.cacheEntityPosition(wrapper, (Integer)wrapper.get((Type)Types.VAR_INT, 0), x, y, z, create, relative);
    }

    public static void writeFacingAngles(PacketWrapper wrapper, double x, double y, double z, double targetX, double targetY, double targetZ) {
        double dX = targetX - x;
        double dY = targetY - y;
        double dZ = targetZ - z;
        double r = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
        double yaw = -Math.atan2(dX, dZ) / Math.PI * 180.0;
        if (yaw < 0.0) {
            yaw = 360.0 + yaw;
        }
        double pitch = -Math.asin(dY / r) / Math.PI * 180.0;
        wrapper.write((Type)Types.BYTE, (Object)((byte)(yaw * 256.0 / 360.0)));
        wrapper.write((Type)Types.BYTE, (Object)((byte)(pitch * 256.0 / 360.0)));
    }
}

