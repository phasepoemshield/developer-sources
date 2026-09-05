/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.connection.StorableObjectTask
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.task;

import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.connection.StorableObjectTask;

public final class ChestDialogViewTask
extends StorableObjectTask<ChestDialogStorage> {
    public ChestDialogViewTask() {
        super(ChestDialogStorage.class);
    }

    public void run(UserConnection userConnection, ChestDialogStorage storableObject) {
        storableObject.tick(userConnection);
    }
}

