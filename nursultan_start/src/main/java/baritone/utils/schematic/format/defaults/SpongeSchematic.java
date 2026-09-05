/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  minecraft.class00500
 *  minecraft.class07001
 */
package baritone.utils.schematic.format.defaults;

import baritone.utils.schematic.StaticSchematic;
import baritone.utils.schematic.format.defaults.SpongeSchematic$SerializedBlockState;
import baritone.utils.type.VarInt;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import minecraft.class00500;
import minecraft.class07001;

public final class SpongeSchematic
extends StaticSchematic {
    public SpongeSchematic(class07001 class070012) {
        int n;
        Object object;
        int n2;
        Object object22;
        this.x = class070012.i("Width").orElse(0);
        this.y = class070012.i("Height").orElse(0);
        this.z = class070012.i("Length").orElse(0);
        this.states = new class00500[this.x][this.z][this.y];
        Int2ObjectArrayMap int2ObjectArrayMap = new Int2ObjectArrayMap();
        class07001 class070013 = class070012.W("Palette").orElse(new class07001());
        for (Object object22 : class070013.i()) {
            n2 = class070013.i((String)object22).orElse(0);
            SpongeSchematic$SerializedBlockState spongeSchematic$SerializedBlockState = SpongeSchematic$SerializedBlockState.getFromString((String)object22);
            if (spongeSchematic$SerializedBlockState == null) {
                throw new IllegalArgumentException("Unable to parse palette tag");
            }
            object = spongeSchematic$SerializedBlockState.deserialize();
            if (object == null) {
                throw new IllegalArgumentException("Unable to deserialize palette tag");
            }
            int2ObjectArrayMap.put(n2, object);
        }
        Object object3 = (byte[])class070012.z("BlockData").orElseThrow();
        object22 = new int[this.x * this.y * this.z];
        n2 = 0;
        for (n = 0; n < ((Object)object22).length; ++n) {
            if (n2 >= ((Object)object3).length) {
                throw new IllegalArgumentException("No remaining bytes in BlockData for complete schematic");
            }
            object = VarInt.read((byte[])object3, n2);
            object22[n] = ((VarInt)object).getValue();
            n2 += ((VarInt)object).getSize();
        }
        for (n = 0; n < this.y; ++n) {
            for (int i = 0; i < this.z; ++i) {
                for (int j = 0; j < this.x; ++j) {
                    int n3 = (n * this.z + i) * this.x + j;
                    class00500 class005002 = (class00500)int2ObjectArrayMap.get((int)object22[n3]);
                    if (class005002 == null) {
                        throw new IllegalArgumentException("Invalid Palette Index " + n3);
                    }
                    this.states[j][i][n] = class005002;
                }
            }
        }
    }
}

