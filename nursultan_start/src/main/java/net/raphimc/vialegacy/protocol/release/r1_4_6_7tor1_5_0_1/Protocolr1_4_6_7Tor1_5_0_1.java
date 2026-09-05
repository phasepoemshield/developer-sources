/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$ObjectType
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ClientboundPackets1_5_2
 *  net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_4_6_7tor1_5_0_1;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.release.r1_4_6_7tor1_5_0_1.packet.ClientboundPackets1_4_6;
import net.raphimc.vialegacy.protocol.release.r1_4_6_7tor1_5_0_1.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ClientboundPackets1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_4_6_7Tor1_5_0_1
extends StatelessProtocol<ClientboundPackets1_4_6, ClientboundPackets1_5_2, ServerboundPackets1_5_2, ServerboundPackets1_5_2> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_4_6_7Tor1_5_0_1() {
        super(ClientboundPackets1_4_6.class, ClientboundPackets1_5_2.class, ServerboundPackets1_5_2.class, ServerboundPackets1_5_2.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_4_6_7Tor1_5_0_1.class, ClientboundPackets1_4_6::getPacket));
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_4_6.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    byte typeId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (typeId == 10 || typeId == 11 || typeId == 12) {
                        wrapper.set((Type)Types.BYTE, 0, (Object)((byte)EntityTypes1_8.ObjectType.MINECART.getId()));
                    }
                    int data = (Integer)wrapper.get((Type)Types.INT, 4);
                    short speedX = 0;
                    short speedY = 0;
                    short speedZ = 0;
                    if (data > 0) {
                        speedX = (Short)wrapper.read((Type)Types.SHORT);
                        speedY = (Short)wrapper.read((Type)Types.SHORT);
                        speedZ = (Short)wrapper.read((Type)Types.SHORT);
                    }
                    if (typeId == 10) {
                        data = EntityTypes1_8.ObjectType.MINECART.getData();
                    }
                    if (typeId == 11) {
                        data = EntityTypes1_8.ObjectType.CHEST_MINECART.getData();
                    }
                    if (typeId == 12) {
                        data = EntityTypes1_8.ObjectType.FURNACE_MINECART.getData();
                    }
                    wrapper.set((Type)Types.INT, 4, (Object)data);
                    if (data > 0) {
                        wrapper.write((Type)Types.SHORT, (Object)speedX);
                        wrapper.write((Type)Types.SHORT, (Object)speedY);
                        wrapper.write((Type)Types.SHORT, (Object)speedZ);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_4_6.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.create((Type)Types.BOOLEAN, false);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_5_2.CONTAINER_CLICK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.BYTE);
                this.map(Types1_7_6.ITEM);
                this.handler(wrapper -> {
                    short slot = (Short)wrapper.get((Type)Types.SHORT, 0);
                    byte button = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    byte mode = (Byte)wrapper.get((Type)Types.BYTE, 2);
                    if (mode > 3) {
                        boolean mouseClick;
                        boolean startDragging = false;
                        boolean endDragging = false;
                        boolean droppingUsingQ = false;
                        boolean addSlot = false;
                        switch (mode) {
                            case 4: {
                                droppingUsingQ = button + (slot != -999 ? 2 : 0) == 2;
                                break;
                            }
                            case 5: {
                                startDragging = button == 0;
                                endDragging = button == 2;
                                addSlot = button == 1;
                            }
                        }
                        boolean leftClick = startDragging || addSlot || endDragging;
                        boolean clickingOutside = slot == -999 && mode != 5;
                        boolean bl = mouseClick = !leftClick;
                        if (droppingUsingQ) {
                            PacketWrapper closeWindow = PacketWrapper.create((PacketType)ClientboundPackets1_5_2.CONTAINER_CLOSE, (UserConnection)wrapper.user());
                            closeWindow.write((Type)Types.BYTE, (Object)0);
                            closeWindow.send(Protocolr1_4_6_7Tor1_5_0_1.class);
                            wrapper.cancel();
                            return;
                        }
                        if (slot < 0 && !clickingOutside) {
                            wrapper.cancel();
                            return;
                        }
                        wrapper.set((Type)Types.BYTE, 1, (Object)((byte)(mouseClick ? 1 : 0)));
                        wrapper.set((Type)Types.BYTE, 2, (Object)0);
                        wrapper.set(Types1_7_6.ITEM, 0, (Object)new DataItem(34, 0, 0, null));
                    }
                });
            }
        });
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }
}

