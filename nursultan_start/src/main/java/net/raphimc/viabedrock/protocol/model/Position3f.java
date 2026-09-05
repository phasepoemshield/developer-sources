/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockFace
 */
package net.raphimc.viabedrock.protocol.model;

import com.viaversion.viaversion.api.minecraft.BlockFace;

public record Position3f(float x, float y, float z) {
    public static final Position3f ZERO = new Position3f(0.0f, 0.0f, 0.0f);

    public Position3f add(float x, float y, float z) {
        return new Position3f(this.x + x, this.y + y, this.z + z);
    }

    public Position3f add(Position3f position) {
        return new Position3f(this.x + position.x, this.y + position.y, this.z + position.z);
    }

    public Position3f subtract(Position3f position) {
        return new Position3f(this.x - position.x, this.y - position.y, this.z - position.z);
    }

    public Position3f subtract(float x, float y, float z) {
        return new Position3f(this.x - x, this.y - y, this.z - z);
    }

    public Position3f getRelative(BlockFace face) {
        return new Position3f(this.x + (float)face.modX(), this.y + (float)face.modY(), this.z + (float)face.modZ());
    }

    public float distanceTo(Position3f position) {
        return (float)Math.sqrt(Math.pow(this.x - position.x, 2.0) + Math.pow(this.y - position.y, 2.0) + Math.pow(this.z - position.z, 2.0));
    }
}

