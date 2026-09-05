/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.transfer.v1.storage;

import net.fabricmc.fabric.api.transfer.v1.storage.TransferVariant;

public final class StoragePreconditions {
    private StoragePreconditions() {
    }

    public static void notBlankNotNegative(TransferVariant<?> transferVariant, long l) {
        StoragePreconditions.notBlank(transferVariant);
        StoragePreconditions.notNegative(l);
    }

    public static void notBlank(TransferVariant<?> transferVariant) {
        if (transferVariant.isBlank()) {
            throw new IllegalArgumentException("Transfer variant may not be blank.");
        }
    }

    public static void notNegative(long l) {
        if (l < 0L) {
            throw new IllegalArgumentException("Amount may not be negative, but it is: " + l);
        }
    }
}

