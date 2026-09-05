/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.DialogStyleConfig
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Button
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog$AfterAction
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.BooleanInput
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.NumberRangeInput
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.SingleOptionInput
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.TextInput
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.widget.ItemWidget
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.widget.TextWidget
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.widget.Widget
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.ChestDialogViewProvider$1
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.ChestDialogViewProvider$MultiTextWidget
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.DialogViewProvider
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage$Phase
 *  com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ClickEvents
 *  com.viaversion.viabackwards.utils.ChatUtil
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.minecraft.item.data.TooltipDisplay
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSortedSets
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.MathUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.DialogStyleConfig;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.Protocol1_21_6To1_21_5;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Button;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.Dialog;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.BooleanInput;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.NumberRangeInput;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.SingleOptionInput;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.input.TextInput;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.widget.ItemWidget;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.widget.TextWidget;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.data.widget.Widget;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.ChestDialogViewProvider;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.provider.DialogViewProvider;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ChestDialogStorage;
import com.viaversion.viabackwards.protocol.v1_21_6to1_21_5.storage.ClickEvents;
import com.viaversion.viabackwards.utils.ChatUtil;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.minecraft.item.data.TooltipDisplay;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.IntSortedSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSortedSets;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ChestDialogViewProvider
implements DialogViewProvider {
    private static final int INVENTORY_SIZE = 27;
    private static final int INVENTORY_LAST_ROW = 18;
    private final Protocol1_21_6To1_21_5 protocol;

    public ChestDialogViewProvider(Protocol1_21_6To1_21_5 protocol) {
        this.protocol = protocol;
    }

    protected Item getItem(UserConnection connection, Widget widget) {
        if (widget instanceof ItemWidget) {
            ItemWidget itemWidget = (ItemWidget)widget;
            return this.getItemWidget(connection, itemWidget);
        }
        if (widget instanceof MultiTextWidget) {
            MultiTextWidget multiTextWidget = (MultiTextWidget)widget;
            return this.getMultiTextWidget(connection, multiTextWidget);
        }
        if (widget instanceof BooleanInput) {
            BooleanInput booleanInput = (BooleanInput)widget;
            return this.getBooleanInput(connection, booleanInput);
        }
        if (widget instanceof NumberRangeInput) {
            NumberRangeInput numberRangeInput = (NumberRangeInput)widget;
            return this.getNumberRangeInput(connection, numberRangeInput);
        }
        if (widget instanceof TextInput) {
            TextInput textInput = (TextInput)widget;
            return this.getTextInput(connection, textInput);
        }
        if (widget instanceof SingleOptionInput) {
            SingleOptionInput singleOptionInput = (SingleOptionInput)widget;
            return this.getSingleOptionInput(connection, singleOptionInput);
        }
        if (widget instanceof Button) {
            Button button = (Button)widget;
            return this.getButton(connection, button);
        }
        if (widget instanceof Dialog) {
            Dialog dialog = (Dialog)widget;
            return this.getDialog(connection, dialog);
        }
        throw new IllegalArgumentException("Unknown widget type: " + widget.getClass().getName());
    }

    public void updateDialog(UserConnection connection, Dialog dialog) {
        ChestDialogStorage storage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        PacketWrapper containerSetContent = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.CONTAINER_SET_CONTENT, (UserConnection)connection);
        containerSetContent.write((Type)Types.VAR_INT, (Object)storage.containerId());
        containerSetContent.write((Type)Types.VAR_INT, (Object)0);
        containerSetContent.write(VersionedTypes.V1_21_5.itemArray, (Object)this.getItems(connection, storage, dialog));
        containerSetContent.write(VersionedTypes.V1_21_5.item, (Object)StructuredItem.empty());
        containerSetContent.send(Protocol1_21_6To1_21_5.class);
    }

    protected Item createTextCopyItem(String value) {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        return this.createItem("minecraft:paper", (Tag)ChatUtil.translate((String)value), config.close());
    }

    protected Item getBooleanInput(UserConnection connection, BooleanInput booleanInput) {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        String item = booleanInput.value() ? "minecraft:lime_dye" : "minecraft:gray_dye";
        Tag[] label = ChatUtil.split((Tag)booleanInput.label(), (String)"\n");
        if (label.length == 1) {
            return this.createItem(item, this.handleTag(connection, booleanInput.label()), new Tag[]{ChatUtil.translate((String)config.toggleValue())});
        }
        Tag[] lore = new Tag[label.length];
        for (int i = 1; i < label.length; ++i) {
            lore[i - 1] = this.handleTag(connection, ChatUtil.fixStyle((Tag)label[i]));
        }
        lore[lore.length - 1] = ChatUtil.translate((String)config.toggleValue());
        return this.createItem(item, this.handleTag(connection, label[0]), lore);
    }

    protected Item getItemWidget(UserConnection connection, ItemWidget itemWidget) {
        String identifier = itemWidget.item().getString("id");
        int count = itemWidget.item().getInt("count", 1);
        CompoundTag label = ChatUtil.translate((String)Key.stripMinecraftNamespace((String)identifier));
        Item item = this.createItem(identifier, (Tag)label);
        item.setAmount(count);
        if (itemWidget.description() != null) {
            item.dataContainer().set(StructuredDataKey.LORE, (Object)new Tag[]{this.handleTag(connection, ChatUtil.fixStyle((Tag)itemWidget.description().label()))});
        }
        if (!itemWidget.showTooltip()) {
            item.dataContainer().set(StructuredDataKey.TOOLTIP_DISPLAY, (Object)new TooltipDisplay(true, (IntSortedSet)IntSortedSets.EMPTY_SET));
        }
        return item;
    }

    protected void openAnvilView(UserConnection connection, ChestDialogStorage storage, Tag title, String value, TextInput textInput) {
        storage.setPhase(connection, ChestDialogStorage.Phase.ANVIL_VIEW);
        PacketWrapper openScreen = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.OPEN_SCREEN, (UserConnection)connection);
        openScreen.write((Type)Types.VAR_INT, (Object)storage.containerId());
        openScreen.write((Type)Types.VAR_INT, (Object)8);
        openScreen.write(Types.TRUSTED_TAG, (Object)title);
        openScreen.send(Protocol1_21_6To1_21_5.class);
        Item[] items = new Item[]{textInput != null ? this.createTextInputItem(value) : this.createTextCopyItem(value)};
        storage.setCurrentTextInput(textInput);
        PacketWrapper containerSetContent = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.CONTAINER_SET_CONTENT, (UserConnection)connection);
        containerSetContent.write((Type)Types.VAR_INT, (Object)storage.containerId());
        containerSetContent.write((Type)Types.VAR_INT, (Object)0);
        containerSetContent.write(VersionedTypes.V1_21_5.itemArray, (Object)items);
        containerSetContent.write(VersionedTypes.V1_21_5.item, (Object)StructuredItem.empty());
        containerSetContent.send(Protocol1_21_6To1_21_5.class);
    }

    protected Item getMultiTextWidget(UserConnection connection, MultiTextWidget multiTextWidget) {
        ArrayList<Tag> lines = new ArrayList<Tag>();
        for (Tag label : multiTextWidget.labels()) {
            Tag[] split;
            for (Tag line : split = ChatUtil.split((Tag)ChatUtil.fixStyle((Tag)label), (String)"\n")) {
                lines.add(this.handleTag(connection, line));
            }
        }
        Tag[] lore = new Tag[lines.size() - 1];
        for (int i = 1; i < lines.size(); ++i) {
            lore[i - 1] = (Tag)lines.get(i);
        }
        return this.createItem("minecraft:paper", (Tag)lines.get(0), lore);
    }

    protected Item getTextInput(UserConnection connection, TextInput textInput) {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        CompoundTag currentValue = ChatUtil.translate((String)String.format(config.currentValue(), textInput.value()));
        if (textInput.label() == null) {
            return this.createItem("minecraft:writable_book", (Tag)currentValue);
        }
        Tag label = this.handleTag(connection, textInput.label());
        return this.createItem("minecraft:writable_book", label, new Tag[]{currentValue, ChatUtil.translate((String)config.editValue())});
    }

    public void closeDialog(UserConnection connection) {
        State state = connection.getProtocolInfo().getClientState();
        if (state == State.CONFIGURATION) {
            return;
        }
        ChestDialogStorage storage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        if (storage == null) {
            return;
        }
        PacketWrapper containerClose = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.CONTAINER_CLOSE, (UserConnection)connection);
        containerClose.write((Type)Types.VAR_INT, (Object)storage.containerId());
        containerClose.send(Protocol1_21_6To1_21_5.class);
        if (storage.previousDialog() != null) {
            this.openDialog(connection, storage.previousDialog());
        } else {
            connection.remove(ChestDialogStorage.class);
        }
    }

    public boolean clickDialog(UserConnection connection, int container, int slot, byte mouse, int mode) {
        ChestDialogStorage currentStorage;
        Button actionButton;
        Button noButton;
        Button yesButton;
        List widgets;
        ChestDialogStorage storage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        if (storage == null || storage.containerId() != container) {
            return false;
        }
        if (mode != 0 || slot < 0 || slot >= 27) {
            this.updateDialog(connection, storage.dialog());
            return true;
        }
        if (storage.phase() == ChestDialogStorage.Phase.ANVIL_VIEW) {
            this.openChestView(connection, storage, ChestDialogStorage.Phase.DIALOG_VIEW);
            return true;
        }
        if (storage.phase() == ChestDialogStorage.Phase.WAITING_FOR_RESPONSE) {
            if (slot == storage.actionIndex() && storage.closeButtonEnabled()) {
                this.closeDialog(connection);
            } else {
                this.updateDialog(connection, storage.dialog());
            }
            return true;
        }
        if (slot == 26) {
            int pages = MathUtil.ceil((float)((float)storage.items().length / 18.0f));
            if (mouse == 0) {
                ++storage.page;
            } else if (mouse == 1) {
                --storage.page;
            }
            storage.page = MathUtil.clamp((int)storage.page, (int)0, (int)(pages - 1));
        }
        if ((slot += storage.page * 18) < (widgets = storage.dialog().widgets()).size()) {
            Widget widget = (Widget)widgets.get(slot);
            if (widget instanceof BooleanInput) {
                BooleanInput booleanInput = (BooleanInput)widget;
                this.clickBooleanInput(booleanInput);
            } else if (widget instanceof NumberRangeInput) {
                NumberRangeInput numberRangeInput = (NumberRangeInput)widget;
                this.clickNumberRangeInput(numberRangeInput, mouse);
            } else if (widget instanceof TextInput) {
                TextInput textInput = (TextInput)widget;
                this.clickTextInput(connection, textInput);
            } else if (widget instanceof SingleOptionInput) {
                SingleOptionInput singleOptionInput = (SingleOptionInput)widget;
                this.clickSingleOptionInput(singleOptionInput);
            } else if (widget instanceof Button) {
                Button button = (Button)widget;
                this.clickButton(connection, storage.dialog().afterAction(), button);
            } else if (widget instanceof Dialog) {
                Dialog dialog = (Dialog)widget;
                this.clickDialogButton(connection, dialog);
            }
        }
        if (slot == storage.confirmationYesIndex() && (yesButton = storage.dialog().yesButton()) != null) {
            this.clickButton(connection, storage.dialog().afterAction(), yesButton);
        }
        if (slot == storage.confirmationNoIndex() && (noButton = storage.dialog().noButton()) != null) {
            this.clickButton(connection, storage.dialog().afterAction(), noButton);
        }
        if (slot == storage.actionIndex() && (actionButton = storage.dialog().actionButton()) != null) {
            this.clickButton(connection, storage.dialog().afterAction(), actionButton);
        }
        if ((currentStorage = (ChestDialogStorage)connection.get(ChestDialogStorage.class)) == storage && connection.has(ChestDialogStorage.class) && storage.phase() == ChestDialogStorage.Phase.DIALOG_VIEW) {
            this.updateDialog(connection, storage.dialog());
        }
        return true;
    }

    public void updateAnvilText(UserConnection connection, String value) {
        if (value.isEmpty()) {
            return;
        }
        ChestDialogStorage storage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        if (storage.currentTextInput() != null) {
            storage.currentTextInput().setClampedValue(value);
        }
    }

    public void openChestView(UserConnection connection, ChestDialogStorage storage, ChestDialogStorage.Phase phase) {
        storage.setPhase(connection, phase);
        PacketWrapper openScreen = PacketWrapper.create((PacketType)ClientboundPackets1_21_5.OPEN_SCREEN, (UserConnection)connection);
        openScreen.write((Type)Types.VAR_INT, (Object)storage.containerId());
        openScreen.write((Type)Types.VAR_INT, (Object)2);
        openScreen.write(Types.TRUSTED_TAG, (Object)this.handleTag(connection, storage.dialog().title()));
        openScreen.send(Protocol1_21_6To1_21_5.class);
        this.updateDialog(connection, storage.dialog());
    }

    public void clickButton(UserConnection connection, Dialog.AfterAction afterAction, @Nullable Button button) {
        String action;
        ChestDialogStorage storage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        switch (1.$SwitchMap$com$viaversion$viabackwards$protocol$v1_21_6to1_21_5$data$Dialog$AfterAction[afterAction.ordinal()]) {
            case 1: {
                this.closeDialog(connection);
                break;
            }
            case 2: {
                storage.setPhase(null, ChestDialogStorage.Phase.WAITING_FOR_RESPONSE);
            }
        }
        if (button == null || button.clickEvent() == null) {
            return;
        }
        CompoundTag clickEvent = button.clickEvent();
        switch (action = Key.stripMinecraftNamespace((String)clickEvent.getString("action"))) {
            case "open_url": {
                String url = clickEvent.getString("url");
                this.openAnvilView(connection, storage, (Tag)ChatUtil.translate((String)"Open URL"), url, null);
                break;
            }
            case "run_command": {
                PacketWrapper chatCommand = PacketWrapper.create((PacketType)ServerboundPackets1_21_6.CHAT_COMMAND, (UserConnection)connection);
                String command = clickEvent.getString("command");
                if (command.startsWith("/")) {
                    command = command.substring(1);
                }
                chatCommand.write(Types.STRING, (Object)command);
                chatCommand.sendToServer(Protocol1_21_6To1_21_5.class);
                break;
            }
            case "copy_to_clipboard": {
                String value = clickEvent.getString("value");
                this.openAnvilView(connection, storage, (Tag)ChatUtil.translate((String)"Copy to clipboard"), value, null);
            }
        }
        ClickEvents.handleClickEvent((UserConnection)connection, (CompoundTag)clickEvent);
    }

    protected void clickDialogButton(UserConnection connection, Dialog dialog) {
        this.closeDialog(connection);
        this.openDialog(connection, dialog);
    }

    protected void clickTextInput(UserConnection connection, TextInput textInput) {
        ChestDialogStorage storage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        this.openAnvilView(connection, storage, (Tag)ChatUtil.translate((String)"\u00a77Edit text"), textInput.value(), textInput);
    }

    protected void clickBooleanInput(BooleanInput booleanInput) {
        booleanInput.setValue(!booleanInput.value());
    }

    protected void clickSingleOptionInput(SingleOptionInput singleOptionInput) {
        singleOptionInput.setClampedValue(singleOptionInput.value() + 1);
    }

    protected Item getSingleOptionInput(UserConnection connection, SingleOptionInput singleOptionInput) {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        Tag displayName = singleOptionInput.options()[singleOptionInput.value()].computeDisplay();
        Tag label = singleOptionInput.label() != null ? ChatUtil.translate((String)"options.generic_value", (Tag[])new Tag[]{singleOptionInput.label(), displayName}) : displayName;
        return this.createItem("minecraft:bookshelf", this.handleTag(connection, label), config.nextOption(), config.previousOption());
    }

    protected Item createActionButtonItem(UserConnection connection, Button button) {
        Tag label = this.handleTag(connection, button.label());
        if (button.tooltip() == null) {
            return this.createItem("minecraft:oak_button", label);
        }
        return this.createItem("minecraft:oak_button", label, this.handleTag(connection, button.tooltip()));
    }

    protected Item getNumberRangeInput(UserConnection connection, NumberRangeInput numberRangeInput) {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        Tag label = this.handleTag(connection, numberRangeInput.displayName());
        return this.createItem("minecraft:clock", label, String.format(config.increaseValue(), Float.valueOf(numberRangeInput.step())), String.format(config.decreaseValue(), Float.valueOf(numberRangeInput.step())), String.format(config.valueRange(), Float.valueOf(numberRangeInput.start()), Float.valueOf(numberRangeInput.end())));
    }

    protected Item createPageNavigationItem() {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        return this.createItem("minecraft:arrow", (Tag)ChatUtil.translate((String)config.pageNavigationTitle()), config.pageNavigationNext(), config.pageNavigationPrevious());
    }

    protected Item createTextInputItem(String value) {
        DialogStyleConfig config = ViaBackwards.getConfig().dialogStyleConfig();
        return this.createItem("minecraft:paper", (Tag)ChatUtil.translate((String)value), config.setText());
    }

    protected void clickNumberRangeInput(NumberRangeInput numberRangeInput, int mouse) {
        float value = numberRangeInput.value();
        if (mouse == 0) {
            value += numberRangeInput.step();
        } else if (mouse == 1) {
            value -= numberRangeInput.step();
        }
        numberRangeInput.setClampedValue(value);
    }

    protected Item createCloseButtonItem(Tag label) {
        return this.createItem("minecraft:oak_button", label);
    }

    public void openDialog(UserConnection connection, Dialog dialog) {
        State state = connection.getProtocolInfo().getClientState();
        if (state == State.CONFIGURATION) {
            return;
        }
        ArrayList<Tag> texts = new ArrayList<Tag>();
        for (Widget widget : new ArrayList(dialog.widgets())) {
            if (widget instanceof TextWidget) {
                TextWidget textWidget = (TextWidget)widget;
                texts.add(textWidget.label());
                dialog.widgets().remove(textWidget);
                continue;
            }
            if (texts.isEmpty()) continue;
            dialog.widgets().add(dialog.widgets().indexOf(widget), new MultiTextWidget((Tag[])texts.toArray(Tag[]::new)));
            texts.clear();
        }
        if (!texts.isEmpty()) {
            dialog.widgets().add(new MultiTextWidget((Tag[])texts.toArray(Tag[]::new)));
            texts.clear();
        }
        ChestDialogStorage previousStorage = (ChestDialogStorage)connection.get(ChestDialogStorage.class);
        ChestDialogStorage storage = new ChestDialogStorage(this, dialog);
        if (previousStorage != null) {
            storage.setPreviousDialog(previousStorage.dialog());
        }
        connection.put((StorableObject)storage);
        this.openChestView(connection, storage, ChestDialogStorage.Phase.DIALOG_VIEW);
    }

    protected Item getDialog(UserConnection connection, Dialog dialog) {
        Tag title = dialog.externalTitle() != null ? dialog.externalTitle() : dialog.title();
        return this.createItem("minecraft:command_block", this.handleTag(connection, title));
    }

    protected Item getButton(UserConnection connection, Button button) {
        return this.createItem("minecraft:oak_button", this.handleTag(connection, button.label()));
    }

    protected Item[] getItems(UserConnection connection, ChestDialogStorage storage, Dialog dialog) {
        Item[] items = StructuredItem.emptyArray((int)27);
        int confirmationYesIndex = -1;
        int confirmationNoIndex = -1;
        int actionIndex = -1;
        if (storage.phase() == ChestDialogStorage.Phase.WAITING_FOR_RESPONSE) {
            actionIndex = 13;
            items[actionIndex] = this.createCloseButtonItem(storage.closeButtonLabel());
            storage.setItems(items, confirmationYesIndex, confirmationNoIndex, actionIndex);
            return items;
        }
        List widgets = dialog.widgets();
        if (widgets.size() > 18) {
            int begin = storage.page * 18;
            int end = Math.min((storage.page + 1) * 18, widgets.size());
            for (int i = 0; i < end - begin; ++i) {
                items[i] = this.getItem(connection, (Widget)widgets.get(begin + i));
            }
            items[26] = this.createPageNavigationItem();
        } else {
            for (int i = 0; i < widgets.size(); ++i) {
                items[i] = this.getItem(connection, (Widget)widgets.get(i));
            }
        }
        if (dialog.yesButton() != null && dialog.noButton() != null) {
            confirmationYesIndex = widgets.isEmpty() ? 11 : 20;
            confirmationNoIndex = widgets.isEmpty() ? 15 : 24;
            items[confirmationYesIndex] = this.createActionButtonItem(connection, dialog.yesButton());
            items[confirmationNoIndex] = this.createActionButtonItem(connection, dialog.noButton());
        }
        if (dialog.actionButton() != null) {
            actionIndex = widgets.isEmpty() ? 13 : 18;
            items[actionIndex] = this.createActionButtonItem(connection, dialog.actionButton());
        }
        storage.setItems(items, confirmationYesIndex, confirmationNoIndex, actionIndex);
        return items;
    }

    protected @Nullable Tag handleTag(UserConnection connection, @Nullable Tag tag) {
        if (tag == null) {
            return null;
        }
        this.protocol.getComponentRewriter().processTag(connection, tag);
        return tag;
    }

    protected Item createItem(String identifier, Tag name) {
        return this.createItem(identifier, name, new String[0]);
    }

    protected Item createItem(String identifier, Tag name, String ... description) {
        int id = this.protocol.getMappingData().getFullItemMappings().mappedId(identifier);
        StructuredDataContainer data = new StructuredDataContainer();
        data.setIdLookup((Protocol)this.protocol, true);
        data.set(StructuredDataKey.ITEM_NAME, (Object)name);
        if (description.length > 0) {
            ArrayList<CompoundTag> lore = new ArrayList<CompoundTag>();
            for (String s : description) {
                lore.add(ChatUtil.translate((String)s));
            }
            data.set(StructuredDataKey.LORE, (Object)lore.toArray(new Tag[0]));
        }
        return new StructuredItem(id, 1, data);
    }

    protected Item createItem(String identifier, Tag name, Tag ... description) {
        int id = this.protocol.getMappingData().getFullItemMappings().mappedId(identifier);
        StructuredDataContainer data = new StructuredDataContainer();
        data.setIdLookup((Protocol)this.protocol, true);
        data.set(StructuredDataKey.ITEM_NAME, (Object)name);
        if (description != null) {
            data.set(StructuredDataKey.LORE, (Object)description);
        }
        return new StructuredItem(id, 1, data);
    }
}

