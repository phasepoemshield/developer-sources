/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.IntObjectPair
 *  com.viaversion.viaversion.libs.mcstructs.converter.DataConverter
 *  com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_21_5.NbtConverter_v1_21_5
 *  com.viaversion.viaversion.libs.mcstructs.core.Identifier
 *  com.viaversion.viaversion.libs.mcstructs.dialog.ActionButton
 *  com.viaversion.viaversion.libs.mcstructs.dialog.AfterAction
 *  com.viaversion.viaversion.libs.mcstructs.dialog.Dialog
 *  com.viaversion.viaversion.libs.mcstructs.dialog.Input
 *  com.viaversion.viaversion.libs.mcstructs.dialog.action.CustomAllAction
 *  com.viaversion.viaversion.libs.mcstructs.dialog.action.DialogAction
 *  com.viaversion.viaversion.libs.mcstructs.dialog.body.PlainMessageBody
 *  com.viaversion.viaversion.libs.mcstructs.dialog.impl.MultiActionDialog
 *  com.viaversion.viaversion.libs.mcstructs.dialog.impl.NoticeDialog
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.BooleanInput
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.DialogInput
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.NumberRangeInput
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.NumberRangeInput$Range
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.SingleOptionInput
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.SingleOptionInput$Entry
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.TextInput
 *  com.viaversion.viaversion.libs.mcstructs.dialog.input.TextInput$MultilineOptions
 *  com.viaversion.viaversion.libs.mcstructs.dialog.serializer.DialogSerializer
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  net.lenni0451.mcstructs_bedrock.forms.Form
 *  net.lenni0451.mcstructs_bedrock.forms.elements.ButtonFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.CheckboxFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.DividerFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.DropdownFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.FormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.HeaderFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.LabelFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.SliderFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.StepSliderFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.elements.TextFieldFormElement
 *  net.lenni0451.mcstructs_bedrock.forms.serializer.FormSerializer
 *  net.lenni0451.mcstructs_bedrock.forms.types.ActionForm
 *  net.lenni0451.mcstructs_bedrock.forms.types.CustomForm
 *  net.lenni0451.mcstructs_bedrock.forms.types.ModalForm
 *  net.lenni0451.mcstructs_bedrock.text.utils.BedrockTextUtils
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.chunk.BedrockBlockEntity
 *  net.raphimc.viabedrock.api.model.container.ChestContainer
 *  net.raphimc.viabedrock.api.model.container.Container
 *  net.raphimc.viabedrock.api.model.container.player.ArmorContainer
 *  net.raphimc.viabedrock.api.model.container.player.InventoryContainer
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.resourcepack.definition.TextDefinitions
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.api.util.TextUtil
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerID
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ModalFormCancelReason
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_ArmorSlot
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.ContainerInput
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.EquipmentSlot
 *  net.raphimc.viabedrock.protocol.model.BedrockItem
 *  net.raphimc.viabedrock.protocol.packet.InventoryPackets$3
 *  net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.ItemRewriter
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.InventoryTracker
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.libs.fastutil.ints.IntObjectPair;
import com.viaversion.viaversion.libs.mcstructs.converter.DataConverter;
import com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_21_5.NbtConverter_v1_21_5;
import com.viaversion.viaversion.libs.mcstructs.core.Identifier;
import com.viaversion.viaversion.libs.mcstructs.dialog.ActionButton;
import com.viaversion.viaversion.libs.mcstructs.dialog.AfterAction;
import com.viaversion.viaversion.libs.mcstructs.dialog.Dialog;
import com.viaversion.viaversion.libs.mcstructs.dialog.Input;
import com.viaversion.viaversion.libs.mcstructs.dialog.action.CustomAllAction;
import com.viaversion.viaversion.libs.mcstructs.dialog.action.DialogAction;
import com.viaversion.viaversion.libs.mcstructs.dialog.body.PlainMessageBody;
import com.viaversion.viaversion.libs.mcstructs.dialog.impl.MultiActionDialog;
import com.viaversion.viaversion.libs.mcstructs.dialog.impl.NoticeDialog;
import com.viaversion.viaversion.libs.mcstructs.dialog.input.BooleanInput;
import com.viaversion.viaversion.libs.mcstructs.dialog.input.DialogInput;
import com.viaversion.viaversion.libs.mcstructs.dialog.input.NumberRangeInput;
import com.viaversion.viaversion.libs.mcstructs.dialog.input.SingleOptionInput;
import com.viaversion.viaversion.libs.mcstructs.dialog.input.TextInput;
import com.viaversion.viaversion.libs.mcstructs.dialog.serializer.DialogSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import java.util.ArrayList;
import java.util.logging.Level;
import net.lenni0451.mcstructs_bedrock.forms.Form;
import net.lenni0451.mcstructs_bedrock.forms.elements.ButtonFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.CheckboxFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.DividerFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.DropdownFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.FormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.HeaderFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.LabelFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.SliderFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.StepSliderFormElement;
import net.lenni0451.mcstructs_bedrock.forms.elements.TextFieldFormElement;
import net.lenni0451.mcstructs_bedrock.forms.serializer.FormSerializer;
import net.lenni0451.mcstructs_bedrock.forms.types.ActionForm;
import net.lenni0451.mcstructs_bedrock.forms.types.CustomForm;
import net.lenni0451.mcstructs_bedrock.forms.types.ModalForm;
import net.lenni0451.mcstructs_bedrock.text.utils.BedrockTextUtils;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.chunk.BedrockBlockEntity;
import net.raphimc.viabedrock.api.model.container.ChestContainer;
import net.raphimc.viabedrock.api.model.container.Container;
import net.raphimc.viabedrock.api.model.container.player.ArmorContainer;
import net.raphimc.viabedrock.api.model.container.player.InventoryContainer;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.resourcepack.definition.TextDefinitions;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.api.util.TextUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerID;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ModalFormCancelReason;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SharedTypes_Legacy_ArmorSlot;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.ContainerInput;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.EquipmentSlot;
import net.raphimc.viabedrock.protocol.model.BedrockItem;
import net.raphimc.viabedrock.protocol.model.FullContainerName;
import net.raphimc.viabedrock.protocol.packet.InventoryPackets;
import net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter;
import net.raphimc.viabedrock.protocol.rewriter.ItemRewriter;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.InventoryTracker;
import net.raphimc.viabedrock.protocol.storage.ResourcePackStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class InventoryPackets {
    private static final int DIALOG_BUTTON_WIDTH = 200;
    private static final int DIALOG_FAKE_BUTTON_WIDTH = 300;
    private static final String DIALOG_FAKE_BUTTON_TEXT = "This is not actually a button, but has to be one because dialogs don't support adding text only elements. Clicking it has the same effect as closing the dialog.";

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.CONTAINER_OPEN, (ClientboundPacketType)ClientboundPackets26_1.OPEN_SCREEN, wrapper -> {
            ChestContainer container;
            Tag patt7075$temp;
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            BlockStateRewriter blockStateRewriter = (BlockStateRewriter)wrapper.user().get(BlockStateRewriter.class);
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            byte containerId = (Byte)wrapper.read((Type)Types.BYTE);
            byte rawType = (Byte)wrapper.read((Type)Types.BYTE);
            ContainerType type = ContainerType.getByValue(rawType);
            if (type == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown ContainerType: " + rawType);
                wrapper.cancel();
                return;
            }
            BlockPosition position = (BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION);
            wrapper.read((Type)BedrockTypes.VAR_LONG);
            if (inventoryTracker.isAnyScreenOpen()) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Server tried to open container while another container is open");
                PacketFactory.sendBedrockContainerClose((UserConnection)wrapper.user(), (byte)-1, (ContainerType)ContainerType.NONE);
                wrapper.cancel();
                return;
            }
            BedrockBlockEntity blockEntity = chunkTracker.getBlockEntity(position);
            TranslationComponent title = new TranslationComponent("container." + blockStateRewriter.tag(chunkTracker.getBlockState(position)), new Object[0]);
            if (blockEntity != null && (patt7075$temp = blockEntity.tag().get("CustomName")) instanceof StringTag) {
                StringTag customNameTag = (StringTag)patt7075$temp;
                title = TextUtil.stringToTextComponent((String)((ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class)).getTexts().translate(customNameTag.getValue(), new Object[0]));
            }
            switch (3.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$ContainerType[type.ordinal()]) {
                case 1: {
                    inventoryTracker.setCurrentContainer((Container)new InventoryContainer(wrapper.user(), containerId, position, inventoryTracker.getInventoryContainer()));
                    wrapper.cancel();
                    return;
                }
                case 2: {
                    container = new ChestContainer(wrapper.user(), containerId, (TextComponent)title, position, 27);
                    break;
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: {
                    wrapper.cancel();
                    return;
                }
                default: {
                    wrapper.cancel();
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Tried to open unimplemented container: " + String.valueOf((Object)type));
                    PacketFactory.sendBedrockContainerClose((UserConnection)wrapper.user(), (byte)containerId, (ContainerType)ContainerType.NONE);
                    return;
                }
            }
            inventoryTracker.setCurrentContainer((Container)container);
            wrapper.write((Type)Types.VAR_INT, (Object)containerId);
            wrapper.write((Type)Types.VAR_INT, (Object)BedrockProtocol.MAPPINGS.getBedrockToJavaContainers().get((Object)type));
            wrapper.write(Types.TAG, (Object)TextUtil.textComponentToNbt((TextComponent)title));
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CONTAINER_CLOSE, (ClientboundPacketType)ClientboundPackets26_1.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map((Type)Types.BYTE, (Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    Container container;
                    ContainerType containerType = ContainerType.getByValue(((Byte)wrapper.read((Type)Types.BYTE)).byteValue());
                    boolean serverInitiated = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    Container container2 = container = serverInitiated ? inventoryTracker.getCurrentContainer() : inventoryTracker.getPendingCloseContainer();
                    if (container == null) {
                        wrapper.cancel();
                        return;
                    }
                    if (serverInitiated && containerType != container.type()) {
                        ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Server tried to close container, but container type was not correct");
                        wrapper.cancel();
                        return;
                    }
                    inventoryTracker.setCurrentContainerClosed(serverInitiated);
                });
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.INVENTORY_CONTENT, (ClientboundPacketType)ClientboundPackets26_1.CONTAINER_SET_CONTENT, wrapper -> {
            ItemRewriter itemRewriter = (ItemRewriter)wrapper.user().get(ItemRewriter.class);
            int containerId = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            BedrockItem[] items = (BedrockItem[])wrapper.read(itemRewriter.itemArrayType());
            FullContainerName containerName = (FullContainerName)((Object)((Object)wrapper.read(BedrockTypes.FULL_CONTAINER_NAME)));
            BedrockItem storageItem = (BedrockItem)wrapper.read(itemRewriter.itemType());
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            Container container = inventoryTracker.getContainerClientbound((byte)containerId, containerName, storageItem);
            if (container != null && container.setItems(items)) {
                PacketFactory.writeJavaContainerSetContent((PacketWrapper)wrapper, (Container)container);
            } else {
                wrapper.cancel();
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.INVENTORY_SLOT, (ClientboundPacketType)ClientboundPackets26_1.CONTAINER_SET_SLOT, wrapper -> {
            ItemRewriter itemRewriter = (ItemRewriter)wrapper.user().get(ItemRewriter.class);
            int containerId = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            int slot = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            FullContainerName containerName = (FullContainerName)((Object)((Object)wrapper.read(BedrockTypes.FULL_CONTAINER_NAME)));
            BedrockItem storageItem = (BedrockItem)wrapper.read(itemRewriter.itemType());
            BedrockItem item = (BedrockItem)wrapper.read(itemRewriter.itemType());
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            Container container = inventoryTracker.getContainerClientbound((byte)containerId, containerName, storageItem);
            if (container != null && container.setItem(slot, item)) {
                if (container.type() == ContainerType.HUD && slot == 0) {
                    wrapper.setPacketType((PacketType)ClientboundPackets26_1.SET_CURSOR_ITEM);
                } else {
                    wrapper.write((Type)Types.VAR_INT, (Object)container.javaContainerId());
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    wrapper.write((Type)Types.SHORT, (Object)((short)container.javaSlot(slot)));
                }
                wrapper.write(VersionedTypes.V26_1.item, (Object)container.getJavaItem(slot));
            } else {
                wrapper.cancel();
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MODAL_FORM_REQUEST, (ClientboundPacketType)ClientboundPackets26_1.SHOW_DIALOG, wrapper -> {
            NoticeDialog dialog;
            Form form;
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            int id = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            String data = (String)wrapper.read(BedrockTypes.STRING);
            if (inventoryTracker.getCurrentContainer() != null || inventoryTracker.getCurrentForm() != null) {
                PacketWrapper modalFormResponse = PacketWrapper.create((PacketType)ServerboundBedrockPackets.MODAL_FORM_RESPONSE, (UserConnection)wrapper.user());
                modalFormResponse.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)id);
                modalFormResponse.write((Type)Types.BOOLEAN, (Object)false);
                modalFormResponse.write((Type)Types.BOOLEAN, (Object)true);
                modalFormResponse.write((Type)Types.BYTE, (Object)((byte)ModalFormCancelReason.UserBusy.getValue()));
                modalFormResponse.sendToServer(BedrockProtocol.class);
                wrapper.cancel();
                return;
            }
            try {
                form = FormSerializer.deserialize((String)data);
            }
            catch (Throwable e) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Error while deserializing form data: " + data, e);
                wrapper.cancel();
                return;
            }
            ResourcePackStorage resourcePackStorage = (ResourcePackStorage)wrapper.user().get(ResourcePackStorage.class);
            form.setTranslator(arg_0 -> InventoryPackets.lambda$register$3(resourcePackStorage.getTexts(), arg_0));
            inventoryTracker.setCurrentForm(IntObjectPair.of((int)id, (Object)form));
            Identifier responseIdentifier = Identifier.of((String)"viabedrock", (String)("form/" + id));
            CompoundTag exitButtonAdditions = new CompoundTag();
            exitButtonAdditions.putBoolean("exit", true);
            ActionButton exitButton = new ActionButton((TextComponent)new StringComponent(resourcePackStorage.getTexts().get("gui.close")), 200, (DialogAction)new CustomAllAction(responseIdentifier, exitButtonAdditions));
            if (form instanceof ModalForm) {
                ModalForm modalForm = (ModalForm)form;
                MultiActionDialog actionDialog = new MultiActionDialog(TextUtil.stringToTextComponent((String)form.getTitle()), true, false, AfterAction.CLOSE, new ArrayList(), new ArrayList(), new ArrayList(), exitButton, 1);
                InventoryPackets.addTextToDialog(wrapper.user(), (Dialog)actionDialog, modalForm.getText());
                CompoundTag button1Additions = new CompoundTag();
                button1Additions.putInt("button_id", 0);
                actionDialog.getActions().add(new ActionButton(TextUtil.stringToTextComponent((String)modalForm.getButton1()), 200, (DialogAction)new CustomAllAction(responseIdentifier, button1Additions)));
                CompoundTag button2Additions = new CompoundTag();
                button2Additions.putInt("button_id", 1);
                actionDialog.getActions().add(new ActionButton(TextUtil.stringToTextComponent((String)modalForm.getButton2()), 200, (DialogAction)new CustomAllAction(responseIdentifier, button2Additions)));
                dialog = actionDialog;
            } else if (form instanceof ActionForm) {
                ActionForm actionForm = (ActionForm)form;
                if (actionForm.getElements().length == 0) {
                    NoticeDialog noticeDialog = new NoticeDialog(TextUtil.stringToTextComponent((String)form.getTitle()), true, false, AfterAction.CLOSE, new ArrayList(), new ArrayList(), exitButton);
                    InventoryPackets.addTextToDialog(wrapper.user(), (Dialog)noticeDialog, actionForm.getText());
                    dialog = noticeDialog;
                } else {
                    MultiActionDialog actionDialog = new MultiActionDialog(TextUtil.stringToTextComponent((String)form.getTitle()), true, false, AfterAction.CLOSE, new ArrayList(), new ArrayList(), new ArrayList(), exitButton, 1);
                    InventoryPackets.addTextToDialog(wrapper.user(), (Dialog)actionDialog, actionForm.getText());
                    int buttonIndex = 0;
                    for (int elementIndex = 0; elementIndex < actionForm.getElements().length; ++elementIndex) {
                        FormElement element = actionForm.getElements()[elementIndex];
                        if (element instanceof ButtonFormElement) {
                            ButtonFormElement button = (ButtonFormElement)element;
                            CompoundTag buttonAdditions = new CompoundTag();
                            buttonAdditions.putInt("button_id", buttonIndex);
                            actionDialog.getActions().add(new ActionButton(TextUtil.stringToTextComponent((String)button.getText()), 200, (DialogAction)new CustomAllAction(responseIdentifier, buttonAdditions)));
                            ++buttonIndex;
                            continue;
                        }
                        if (element instanceof HeaderFormElement) {
                            HeaderFormElement header = (HeaderFormElement)element;
                            actionDialog.getActions().add(new ActionButton(TextUtil.stringToTextComponent((String)header.getText()), (TextComponent)new StringComponent(DIALOG_FAKE_BUTTON_TEXT), 300, exitButton.getAction()));
                            continue;
                        }
                        if (element instanceof LabelFormElement) {
                            LabelFormElement label = (LabelFormElement)element;
                            actionDialog.getActions().add(new ActionButton(TextUtil.stringToTextComponent((String)label.getText()), (TextComponent)new StringComponent(DIALOG_FAKE_BUTTON_TEXT), 300, exitButton.getAction()));
                            continue;
                        }
                        if (element instanceof DividerFormElement) continue;
                        throw new IllegalArgumentException("Unhandled form element type: " + element.getClass().getSimpleName());
                    }
                    dialog = actionDialog;
                }
            } else if (form instanceof CustomForm) {
                CustomForm customForm = (CustomForm)form;
                MultiActionDialog actionDialog = new MultiActionDialog(TextUtil.stringToTextComponent((String)form.getTitle()), true, false, AfterAction.CLOSE, new ArrayList(), new ArrayList(), new ArrayList(), exitButton, 1);
                for (int elementIndex = 0; elementIndex < customForm.getElements().length; ++elementIndex) {
                    TextInput textInput;
                    SingleOptionInput singleOptionInput;
                    FormElement element = customForm.getElements()[elementIndex];
                    String inputKey = String.valueOf(elementIndex);
                    if (element instanceof CheckboxFormElement) {
                        CheckboxFormElement checkbox = (CheckboxFormElement)element;
                        BooleanInput booleanInput = new BooleanInput(TextUtil.stringToTextComponent((String)checkbox.getText()));
                        booleanInput.setInitial(checkbox.getDefaultValue());
                        actionDialog.getInputs().add(new Input(inputKey, (DialogInput)booleanInput));
                        continue;
                    }
                    if (element instanceof DropdownFormElement) {
                        DropdownFormElement dropdown = (DropdownFormElement)element;
                        singleOptionInput = new SingleOptionInput(new ArrayList(dropdown.getOptions().length), TextUtil.stringToTextComponent((String)dropdown.getText()));
                        for (int dropdownIndex = 0; dropdownIndex < dropdown.getOptions().length; ++dropdownIndex) {
                            String option = dropdown.getOptions()[dropdownIndex];
                            singleOptionInput.getOptions().add(new SingleOptionInput.Entry(String.valueOf(dropdownIndex), TextUtil.stringToTextComponent((String)option), dropdownIndex == dropdown.getDefaultOption()));
                        }
                        actionDialog.getInputs().add(new Input(inputKey, (DialogInput)singleOptionInput));
                        continue;
                    }
                    if (element instanceof SliderFormElement) {
                        SliderFormElement slider = (SliderFormElement)element;
                        NumberRangeInput numberRangeInput = new NumberRangeInput(TextUtil.stringToTextComponent((String)slider.getText()), new NumberRangeInput.Range(slider.getMin(), slider.getMax(), Float.valueOf(slider.getDefaultValue()), Float.valueOf(slider.getStep())));
                        actionDialog.getInputs().add(new Input(inputKey, (DialogInput)numberRangeInput));
                        continue;
                    }
                    if (element instanceof StepSliderFormElement) {
                        StepSliderFormElement stepSlider = (StepSliderFormElement)element;
                        singleOptionInput = new SingleOptionInput(new ArrayList(stepSlider.getSteps().length), TextUtil.stringToTextComponent((String)stepSlider.getText()));
                        for (int stepIndex = 0; stepIndex < stepSlider.getSteps().length; ++stepIndex) {
                            String step = stepSlider.getSteps()[stepIndex];
                            String stepKey = String.valueOf(stepIndex);
                            singleOptionInput.getOptions().add(new SingleOptionInput.Entry(stepKey, TextUtil.stringToTextComponent((String)step), stepIndex == stepSlider.getDefaultStep()));
                        }
                        actionDialog.getInputs().add(new Input(inputKey, (DialogInput)singleOptionInput));
                        continue;
                    }
                    if (element instanceof TextFieldFormElement) {
                        TextFieldFormElement textField = (TextFieldFormElement)element;
                        textInput = new TextInput(TextUtil.stringToTextComponent((String)textField.getText()));
                        textInput.setMaxLength(100);
                        textInput.setInitial(textField.getDefaultValue());
                        actionDialog.getInputs().add(new Input(inputKey, (DialogInput)textInput));
                        continue;
                    }
                    if (element instanceof HeaderFormElement) {
                        HeaderFormElement header = (HeaderFormElement)element;
                        InventoryPackets.addTextToDialog(wrapper.user(), (Dialog)actionDialog, header.getText());
                        continue;
                    }
                    if (element instanceof LabelFormElement) {
                        LabelFormElement label = (LabelFormElement)element;
                        InventoryPackets.addTextToDialog(wrapper.user(), (Dialog)actionDialog, label.getText());
                        continue;
                    }
                    if (element instanceof DividerFormElement) {
                        if (!wrapper.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_6)) continue;
                        textInput = new TextInput((TextComponent)new StringComponent());
                        textInput.setLabelVisible(false);
                        textInput.setMaxLength(Integer.MAX_VALUE);
                        textInput.setMultiline(new TextInput.MultilineOptions(null, Integer.valueOf(1)));
                        actionDialog.getInputs().add(new Input("dummy", (DialogInput)textInput));
                        continue;
                    }
                    throw new IllegalArgumentException("Unhandled form element type: " + element.getClass().getSimpleName());
                }
                actionDialog.getActions().add(new ActionButton(TextUtil.stringToTextComponent((String)resourcePackStorage.getTexts().get("gui.submit")), 200, (DialogAction)new CustomAllAction(responseIdentifier, null)));
                dialog = actionDialog;
            } else {
                throw new IllegalArgumentException("Unhandled form type: " + form.getClass().getSimpleName());
            }
            wrapper.write((Type)Types.TRUSTED_COMPOUND_TAG_HOLDER, (Object)Holder.of((Object)((CompoundTag)DialogSerializer.V1_21_6.getDirectCodec().serialize((DataConverter)NbtConverter_v1_21_5.INSTANCE, (Object)dialog).get())));
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CLOSE_FORM, (ClientboundPacketType)ClientboundPackets26_1.CLEAR_DIALOG, wrapper -> {
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            if (inventoryTracker.getCurrentForm() != null) {
                inventoryTracker.closeCurrentForm();
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.PLAYER_HOTBAR, (ClientboundPacketType)ClientboundPackets26_1.SET_HELD_SLOT, wrapper -> {
            InventoryContainer inventoryContainer = ((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer();
            int slot = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            byte containerId = (Byte)wrapper.read((Type)Types.BYTE);
            boolean shouldSelectSlot = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (slot >= 0 && slot < 9 && containerId == inventoryContainer.containerId() && shouldSelectSlot) {
                wrapper.write((Type)Types.VAR_INT, (Object)slot);
            } else {
                wrapper.cancel();
                if (containerId != inventoryContainer.containerId()) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Tried to set hotbar slot with wrong container id: " + containerId);
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CONTAINER_REGISTRY_CLEANUP, null, wrapper -> {
            FullContainerName[] removedContainers;
            wrapper.cancel();
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            for (FullContainerName containerName : removedContainers = (FullContainerName[])wrapper.read(BedrockTypes.FULL_CONTAINER_NAME_ARRAY)) {
                inventoryTracker.removeDynamicContainer(containerName);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.PLAYER_ARMOR_DAMAGE, (ClientboundPacketType)ClientboundPackets26_1.SET_EQUIPMENT, wrapper -> {
            if (!((GameSessionStorage)wrapper.user().get(GameSessionStorage.class)).isInventoryServerAuthoritative()) {
                wrapper.cancel();
                return;
            }
            int size = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            if (size <= 0) {
                wrapper.cancel();
                return;
            }
            ArmorContainer armorContainer = ((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getArmorContainer();
            wrapper.write((Type)Types.VAR_INT, (Object)((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().javaId());
            for (int i = 0; i < size; ++i) {
                BedrockItem item;
                int rawArmorSlot = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                SharedTypes_Legacy_ArmorSlot armorSlot = SharedTypes_Legacy_ArmorSlot.getByValue((int)rawArmorSlot);
                if (armorSlot == null) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown SharedTypes_Legacy_ArmorSlot: " + rawArmorSlot);
                    wrapper.cancel();
                    return;
                }
                short damage = (Short)wrapper.read((Type)BedrockTypes.SHORT_LE);
                BedrockItem bedrockItem = item = armorSlot.getValue() < armorContainer.size() ? armorContainer.getItem(armorSlot.getValue()) : BedrockItem.empty();
                if (item.tag() == null) {
                    item.setTag(new CompoundTag());
                }
                item.tag().putInt("Damage", (int)damage);
                EquipmentSlot equipmentSlot = switch (3.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$SharedTypes_Legacy_ArmorSlot[armorSlot.ordinal()]) {
                    default -> throw new IncompatibleClassChangeError();
                    case 1 -> EquipmentSlot.HEAD;
                    case 2 -> EquipmentSlot.CHEST;
                    case 3 -> EquipmentSlot.LEGS;
                    case 4 -> EquipmentSlot.FEET;
                    case 5 -> EquipmentSlot.BODY;
                };
                wrapper.write((Type)Types.BYTE, (Object)((byte)(equipmentSlot.ordinal() | (i < size - 1 ? -128 : 0))));
                wrapper.write(VersionedTypes.V26_1.item, (Object)((ItemRewriter)wrapper.user().get(ItemRewriter.class)).javaItem(item));
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CONTAINER_CLICK, null, wrapper -> {
            wrapper.cancel();
            int containerId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int revision = (Integer)wrapper.read((Type)Types.VAR_INT);
            short slot = (Short)wrapper.read((Type)Types.SHORT);
            byte button = (Byte)wrapper.read((Type)Types.BYTE);
            ContainerInput action = ContainerInput.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            if (inventoryTracker.getPendingCloseContainer() != null) {
                wrapper.cancel();
                return;
            }
            Container container = inventoryTracker.getContainerServerbound((byte)containerId);
            if (container == null) {
                if (containerId == ContainerID.CONTAINER_ID_INVENTORY.getValue()) {
                    PacketWrapper interact = PacketWrapper.create((PacketType)ServerboundBedrockPackets.INTERACT, (UserConnection)wrapper.user());
                    interact.write((Type)Types.UNSIGNED_BYTE, (Object)((short)InteractPacket_Action.OpenInventory.getValue()));
                    interact.write((Type)BedrockTypes.UNSIGNED_VAR_LONG, (Object)((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().runtimeId());
                    interact.write(BedrockTypes.OPTIONAL_POSITION_3F, null);
                    interact.sendToServer(BedrockProtocol.class);
                    PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)inventoryTracker.getInventoryContainer());
                }
                wrapper.cancel();
                return;
            }
            if (!container.handleClick(revision, slot, button, action)) {
                if (container.type() != ContainerType.INVENTORY) {
                    PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)inventoryTracker.getInventoryContainer());
                }
                PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)container);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.SET_CREATIVE_MODE_SLOT, null, wrapper -> {
            wrapper.cancel();
            short slot = (Short)wrapper.read((Type)Types.SHORT);
            Item item = (Item)wrapper.read(VersionedTypes.V26_1.lengthPrefixedItem);
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            if (inventoryTracker.getPendingCloseContainer() != null) {
                wrapper.cancel();
                return;
            }
            PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)inventoryTracker.getInventoryContainer());
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CUSTOM_CLICK_ACTION, ServerboundBedrockPackets.MODAL_FORM_RESPONSE, wrapper -> {
            String id = (String)wrapper.read(Types.STRING);
            CompoundTag payload = (CompoundTag)wrapper.read(Types.CUSTOM_CLICK_ACTION_TAG);
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            if (inventoryTracker.getCurrentForm() == null) {
                wrapper.cancel();
                return;
            }
            Form form = (Form)inventoryTracker.getCurrentForm().right();
            int formId = inventoryTracker.getCurrentForm().leftInt();
            if (!id.equals("viabedrock:form/" + formId)) {
                wrapper.cancel();
                return;
            }
            inventoryTracker.setCurrentForm(null);
            if (payload.contains("exit") && payload.getBoolean("exit")) {
                wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)formId);
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
                wrapper.write((Type)Types.BYTE, (Object)((byte)ModalFormCancelReason.UserClosed.getValue()));
                return;
            }
            if (form instanceof ModalForm) {
                ModalForm modalForm = (ModalForm)form;
                modalForm.setClickedButton(payload.getInt("button_id"));
            } else if (form instanceof ActionForm) {
                ActionForm actionForm = (ActionForm)form;
                actionForm.setClickedButton(payload.getInt("button_id"));
            } else if (form instanceof CustomForm) {
                CustomForm customForm = (CustomForm)form;
                for (int elementIndex = 0; elementIndex < customForm.getElements().length; ++elementIndex) {
                    String inputKey = String.valueOf(elementIndex);
                    if (!payload.contains(inputKey)) continue;
                    FormElement element = customForm.getElements()[elementIndex];
                    if (element instanceof CheckboxFormElement) {
                        CheckboxFormElement checkbox = (CheckboxFormElement)element;
                        checkbox.setChecked(payload.getBoolean(inputKey));
                        continue;
                    }
                    if (element instanceof DropdownFormElement) {
                        DropdownFormElement dropdown = (DropdownFormElement)element;
                        dropdown.setSelected(Integer.parseInt(payload.getString(inputKey)));
                        continue;
                    }
                    if (element instanceof SliderFormElement) {
                        SliderFormElement slider = (SliderFormElement)element;
                        slider.setCurrent(payload.getFloat(inputKey));
                        continue;
                    }
                    if (element instanceof StepSliderFormElement) {
                        StepSliderFormElement stepSlider = (StepSliderFormElement)element;
                        stepSlider.setSelected(Integer.parseInt(payload.getString(inputKey)));
                        continue;
                    }
                    if (!(element instanceof TextFieldFormElement)) continue;
                    TextFieldFormElement textField = (TextFieldFormElement)element;
                    textField.setValue(payload.getString(inputKey));
                }
            } else {
                throw new IllegalArgumentException("Unhandled form type: " + form.getClass().getSimpleName());
            }
            wrapper.write((Type)BedrockTypes.UNSIGNED_VAR_INT, (Object)formId);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
            wrapper.write(BedrockTypes.STRING, (Object)(form.serializeResponse() + "\n"));
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CONTAINER_CLOSE, ServerboundBedrockPackets.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.BYTE);
                this.create((Type)Types.BYTE, (byte)ContainerType.NONE.getValue());
                this.create((Type)Types.BOOLEAN, false);
                this.handler(wrapper -> {
                    byte containerId;
                    InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
                    Container container = inventoryTracker.getContainerServerbound(containerId = ((Byte)wrapper.get((Type)Types.BYTE, 0)).byteValue());
                    if (container == null) {
                        wrapper.cancel();
                        return;
                    }
                    if (container.javaContainerId() != container.containerId()) {
                        wrapper.set((Type)Types.BYTE, 0, (Object)container.containerId());
                    }
                    inventoryTracker.markPendingClose(container);
                });
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.SET_CARRIED_ITEM, ServerboundBedrockPackets.MOB_EQUIPMENT, wrapper -> {
            short slot = (Short)wrapper.read((Type)Types.SHORT);
            ((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer().setSelectedHotbarSlot((byte)slot, wrapper);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PICK_ITEM_FROM_BLOCK, ServerboundBedrockPackets.BLOCK_PICK_REQUEST, wrapper -> {
            wrapper.passthroughAndMap(Types.BLOCK_POSITION1_14, BedrockTypes.BLOCK_POSITION);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)9);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PICK_ITEM_FROM_ENTITY, ServerboundBedrockPackets.ENTITY_PICK_REQUEST, wrapper -> {
            int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            boolean includeData = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            Entity entity = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getEntityByJid(entityId);
            if (entity == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)BedrockTypes.LONG_LE, (Object)entity.uniqueId());
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)9);
            wrapper.write((Type)Types.BOOLEAN, (Object)includeData);
        });
    }

    private static /* synthetic */ String lambda$register$3(TextDefinitions rec$, String x$0) {
        return rec$.translate(x$0, new Object[0]);
    }

    private static void addTextToDialog(UserConnection userConnection, Dialog dialog, String text) {
        if (dialog.getInputs().isEmpty()) {
            for (String line : BedrockTextUtils.split((String)text, (String)"\n")) {
                dialog.getBody().add(new PlainMessageBody(TextUtil.stringToTextComponent((String)line)));
            }
        } else if (userConnection.getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_6)) {
            for (String line : BedrockTextUtils.split((String)text, (String)"\n")) {
                TextInput textInput = new TextInput(TextUtil.stringToTextComponent((String)line));
                textInput.setMaxLength(Integer.MAX_VALUE);
                textInput.setMultiline(new TextInput.MultilineOptions(null, Integer.valueOf(1)));
                dialog.getInputs().add(new Input("dummy", (DialogInput)textInput));
            }
        } else {
            dialog.getInputs().add(new Input("dummy", (DialogInput)new BooleanInput(TextUtil.stringToTextComponent((String)text))));
        }
    }
}

