/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.TextInput
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.ChestDialogViewProvider
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage$Phase
 *  com.viaversion.viabackwards.utils.ChatUtil
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.TextInput;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.ChestDialogViewProvider;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage;
import com.viaversion.viabackwards.utils.ChatUtil;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class ChestDialogStorage
implements StorableObject {
    private static final byte MIN_FAKE_ID = 64;
    private static final byte MAX_FAKE_ID = 126;
    private static final AtomicInteger FAKE_ID_COUNTER = new AtomicInteger(64);
    private static final Tag[] RESPONSE_BUTTON_LABELS = new Tag[]{ChatUtil.translate((String)""), ChatUtil.translate((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{4}), ChatUtil.translate((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{3}), ChatUtil.translate((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{2}), ChatUtil.translate((String)"gui.waitingForResponse.button.inactive", (Object[])new Object[]{1}), ChatUtil.translate((String)"gui.back")};
    private final ChestDialogViewProvider provider;
    private final Dialog dialog;
    private int containerId;
    private Dialog previousDialog;
    public int page;
    private Item[] items;
    private int confirmationYesIndex = -1;
    private int confirmationNoIndex = -1;
    private int actionIndex = -1;
    private // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable ChestDialogStorage.Phase phase;
    private int ticksWaitingForResponse = 0;
    private boolean closeButtonEnabled;
    private Tag closeButtonLabel;
    private TextInput currentTextInput;
    private boolean allowClosing;

    public Item[] items() {
        return this.items;
    }

    public void tick(UserConnection connection) {
        int index;
        if (this.phase != Phase.WAITING_FOR_RESPONSE) {
            return;
        }
        if ((index = this.ticksWaitingForResponse++ / 20) > RESPONSE_BUTTON_LABELS.length - 1) {
            return;
        }
        this.closeButtonEnabled = index >= 1;
        this.closeButtonLabel = RESPONSE_BUTTON_LABELS[index];
        this.provider.updateDialog(connection, this.dialog);
    }

    public ChestDialogStorage(ChestDialogViewProvider provider, Dialog dialog) {
        this.provider = provider;
        this.dialog = dialog;
    }

    public // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable ChestDialogStorage.Phase phase() {
        return this.phase;
    }

    public Dialog dialog() {
        return this.dialog;
    }

    public TextInput currentTextInput() {
        return this.currentTextInput;
    }

    public Tag closeButtonLabel() {
        return this.closeButtonLabel;
    }

    public int containerId() {
        return this.containerId;
    }

    public boolean allowClosing() {
        return this.allowClosing;
    }

    public void setAllowClosing(boolean allowClosing) {
        this.allowClosing = allowClosing;
    }

    public boolean closeButtonEnabled() {
        return this.closeButtonEnabled;
    }

    public @Nullable Dialog previousDialog() {
        return this.previousDialog;
    }

    public void setPreviousDialog(Dialog previousDialog) {
        this.previousDialog = previousDialog;
    }

    public int actionIndex() {
        return this.actionIndex;
    }

    public void setCurrentTextInput(TextInput currentTextInput) {
        this.currentTextInput = currentTextInput;
    }

    public int confirmationNoIndex() {
        return this.confirmationNoIndex;
    }

    public int confirmationYesIndex() {
        return this.confirmationYesIndex;
    }

    public void setPhase(UserConnection connection, // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable ChestDialogStorage.Phase phase) {
        if (phase == Phase.DIALOG_VIEW || phase == Phase.ANVIL_VIEW) {
            if (this.phase != null) {
                PacketWrapper containerClose = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.CONTAINER_CLOSE, (UserConnection)connection);
                containerClose.write((Type)Types.VAR_INT, (Object)this.containerId);
                containerClose.send(Protocol1_21_6To1_21_5.class);
            }
            this.currentTextInput = null;
            int id = FAKE_ID_COUNTER.getAndIncrement();
            if (id > 126) {
                FAKE_ID_COUNTER.set(64);
                this.containerId = 64;
            } else {
                this.containerId = (byte)id;
            }
        }
        this.phase = phase;
    }

    public void setItems(Item[] items, int confirmationYesIndex, int confirmationNoIndex, int actionIndex) {
        this.items = items;
        this.confirmationYesIndex = confirmationYesIndex;
        this.confirmationNoIndex = confirmationNoIndex;
        this.actionIndex = actionIndex;
    }
}

