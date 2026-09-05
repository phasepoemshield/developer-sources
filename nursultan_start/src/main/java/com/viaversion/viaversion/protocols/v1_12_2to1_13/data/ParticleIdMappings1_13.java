/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ParticleIdMappings1_13$NewParticle
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ParticleIdMappings1_13$ParticleDataHandler
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.data;

import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ParticleIdMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.WorldPacketRewriter1_13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class ParticleIdMappings1_13 {
    private static final List<NewParticle> particles = new ArrayList<NewParticle>();

    static {
        ParticleIdMappings1_13.add(34);
        ParticleIdMappings1_13.add(19);
        ParticleIdMappings1_13.add(18);
        ParticleIdMappings1_13.add(21);
        ParticleIdMappings1_13.add(4);
        ParticleIdMappings1_13.add(43);
        ParticleIdMappings1_13.add(22);
        ParticleIdMappings1_13.add(42);
        ParticleIdMappings1_13.add(32);
        ParticleIdMappings1_13.add(6);
        ParticleIdMappings1_13.add(14);
        ParticleIdMappings1_13.add(37);
        ParticleIdMappings1_13.add(30);
        ParticleIdMappings1_13.add(12);
        ParticleIdMappings1_13.add(26);
        ParticleIdMappings1_13.add(17);
        ParticleIdMappings1_13.add(0);
        ParticleIdMappings1_13.add(44);
        ParticleIdMappings1_13.add(10);
        ParticleIdMappings1_13.add(9);
        ParticleIdMappings1_13.add(1);
        ParticleIdMappings1_13.add(24);
        ParticleIdMappings1_13.add(32);
        ParticleIdMappings1_13.add(33);
        ParticleIdMappings1_13.add(35);
        ParticleIdMappings1_13.add(15);
        ParticleIdMappings1_13.add(23);
        ParticleIdMappings1_13.add(31);
        ParticleIdMappings1_13.add(-1);
        ParticleIdMappings1_13.add(5);
        ParticleIdMappings1_13.add(11, ParticleIdMappings1_13.reddustHandler());
        ParticleIdMappings1_13.add(29);
        ParticleIdMappings1_13.add(34);
        ParticleIdMappings1_13.add(28);
        ParticleIdMappings1_13.add(25);
        ParticleIdMappings1_13.add(2);
        ParticleIdMappings1_13.add(27, ParticleIdMappings1_13.iconcrackHandler());
        ParticleIdMappings1_13.add(3, ParticleIdMappings1_13.blockHandler());
        ParticleIdMappings1_13.add(3, ParticleIdMappings1_13.blockHandler());
        ParticleIdMappings1_13.add(36);
        ParticleIdMappings1_13.add(-1);
        ParticleIdMappings1_13.add(13);
        ParticleIdMappings1_13.add(8);
        ParticleIdMappings1_13.add(16);
        ParticleIdMappings1_13.add(7);
        ParticleIdMappings1_13.add(40);
        ParticleIdMappings1_13.add(20, ParticleIdMappings1_13.blockHandler());
        ParticleIdMappings1_13.add(41);
        ParticleIdMappings1_13.add(38);
        ParticleIdMappings1_13.handler$dig000$viafabricplus$checkFootStepIdOverlap(null);
    }

    private static void add(int n, ParticleDataHandler particleDataHandler) {
        particles.add(new NewParticle(n, particleDataHandler));
    }

    private static void add(int n) {
        ParticleDataHandler particleDataHandler = null;
        int n2 = n;
        particles.add(new NewParticle(ParticleIdMappings1_13.modify$dig000$viafabricplus$replaceFootStepId(n2), particleDataHandler));
    }

    private static boolean randomBool() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    private static void handler$dig000$viafabricplus$checkFootStepIdOverlap(CallbackInfo callbackInfo) {
        if (FootStepParticle1_12_2.RAW_ID < particles.size()) {
            throw new IllegalStateException("ViaFabricPlus FootStepParticle ID overlaps with a vanilla 1.12.2 particle ID");
        }
    }

    public static Particle rewriteParticle(int n, Integer[] integerArray) {
        if (n >= particles.size()) {
            Protocol1_12_2To1_13.LOGGER.severe("Failed to transform particles with id " + n + " and data " + Arrays.toString((Object[])integerArray));
            return null;
        }
        NewParticle newParticle = particles.get(n);
        return newParticle.handle(new Particle(newParticle.id()), integerArray);
    }

    private static int modify$dig000$viafabricplus$replaceFootStepId(int n) {
        if (particles.size() == 28) {
            return FootStepParticle1_12_2.RAW_ID;
        }
        return n;
    }

    private static ParticleDataHandler iconcrackHandler() {
        return (particle, integerArray) -> {
            DataItem dataItem;
            if (integerArray.length == 1) {
                dataItem = new DataItem(integerArray[0].intValue(), 1, 0, null);
            } else if (integerArray.length == 2) {
                dataItem = new DataItem(integerArray[0].intValue(), 1, integerArray[1].shortValue(), null);
            } else {
                return particle;
            }
            ((Protocol1_12_2To1_13)Via.getManager().getProtocolManager().getProtocol(Protocol1_12_2To1_13.class)).getItemRewriter().handleItemToClient(null, (Item)dataItem);
            particle.add(Types.ITEM1_13, (Object)dataItem);
            return particle;
        };
    }

    private static ParticleDataHandler reddustHandler() {
        return (particle, integerArray) -> {
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(ParticleIdMappings1_13.randomBool() ? 1.0f : 0.0f));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(ParticleIdMappings1_13.randomBool() ? 1.0f : 0.0f));
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
            return particle;
        };
    }

    private static ParticleDataHandler blockHandler() {
        return (particle, integerArray) -> {
            int n = integerArray[0];
            int n2 = (n & 0xFFF) << 4 | n >> 12 & 0xF;
            int n3 = WorldPacketRewriter1_13.toNewId(n2);
            particle.add((Type)Types.VAR_INT, (Object)n3);
            return particle;
        };
    }
}

