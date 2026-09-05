/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.protocol.model;

public record EntityLink(long fromEntityUniqueId, long toEntityUniqueId, byte type, boolean immediate, boolean riderInitiated, float vehicleAngularVelocity) {
}

