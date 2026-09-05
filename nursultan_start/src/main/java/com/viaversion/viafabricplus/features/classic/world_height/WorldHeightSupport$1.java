/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.model.ClassicLevel
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicLevelStorage
 */
package com.viaversion.viafabricplus.features.classic.world_height;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import java.util.ArrayList;
import java.util.BitSet;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.model.ClassicLevel;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicWorldHeightProvider;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicLevelStorage;

class WorldHeightSupport$1
extends PacketHandlers {
    WorldHeightSupport$1() {
    }

    public void register() {
        this.map((Type)Types.VAR_INT);
        this.map((Type)Types.VAR_INT);
        this.map((Type)Types.BOOLEAN);
        this.handler(packetWrapper -> {
            short s;
            packetWrapper.read((Type)Types.VAR_INT);
            packetWrapper.read((Type)Types.VAR_INT);
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            int n2 = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            ClassicLevel classicLevel = ((ClassicLevelStorage)packetWrapper.user().get(ClassicLevelStorage.class)).getClassicLevel();
            ClassicWorldHeightProvider classicWorldHeightProvider = (ClassicWorldHeightProvider)Via.getManager().getProviders().get(ClassicWorldHeightProvider.class);
            short s2 = classicLevel.getSizeY() >> 4;
            if (classicLevel.getSizeY() % 16 != 0) {
                ++s2;
            }
            if (s2 > classicWorldHeightProvider.getMaxChunkSectionCount(packetWrapper.user())) {
                s2 = classicWorldHeightProvider.getMaxChunkSectionCount(packetWrapper.user());
            }
            ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
            while (packetWrapper.isReadable(Types.BYTE_ARRAY_PRIMITIVE, 0)) {
                arrayList.add((byte[])packetWrapper.read(Types.BYTE_ARRAY_PRIMITIVE));
            }
            short s3 = 16;
            short s4 = s2;
            if (arrayList.size() == 18) {
                s4 = 0;
            } else if (arrayList.size() != 16 + s2 + 2 && arrayList.size() == s2 + s2 + 2) {
                s3 = s2;
            }
            BitSet bitSet = new BitSet();
            BitSet bitSet2 = new BitSet();
            bitSet.set(0, s3 += 2);
            bitSet2.set(0, s4);
            packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)bitSet.toLongArray());
            packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)bitSet2.toLongArray());
            packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)new long[n]);
            packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)new long[n2]);
            packetWrapper.write((Type)Types.VAR_INT, (Object)s3);
            for (s = 0; s < s3; ++s) {
                packetWrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)((byte[])arrayList.remove(0)));
            }
            packetWrapper.write((Type)Types.VAR_INT, (Object)s4);
            for (s = 0; s < s4; ++s) {
                packetWrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)((byte[])arrayList.remove(0)));
            }
        });
    }
}

