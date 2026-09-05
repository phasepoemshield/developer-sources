/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider;

import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;

public interface DialogViewProvider
extends Provider {
    public void closeDialog(UserConnection var1);

    public void openDialog(UserConnection var1, Dialog var2);
}

