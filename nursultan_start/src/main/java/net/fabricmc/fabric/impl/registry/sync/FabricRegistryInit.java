/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class04206
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.registry.RegistryAttribute
 *  net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 */
package net.fabricmc.fabric.impl.registry.sync;

import minecraft.class00751;
import minecraft.class04206;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager$SyncConfigurationTask;
import net.fabricmc.fabric.impl.registry.sync.SyncCompletePayload;
import net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload;

public class FabricRegistryInit
implements ModInitializer {
    private static final int MAX_PACKET_SIZE = Integer.getInteger("fabric.registry.sync.max_packet_size", 0x8000000);

    public void onInitialize() {
        PayloadTypeRegistry.configurationC2S().register(SyncCompletePayload.ID, SyncCompletePayload.CODEC);
        PayloadTypeRegistry.configurationS2C().registerLarge(RegistrySyncPayload.ID, RegistrySyncPayload.CODEC, MAX_PACKET_SIZE);
        ServerConfigurationConnectionEvents.BEFORE_CONFIGURE.register(RegistrySyncManager::configureClient);
        ServerConfigurationNetworking.registerGlobalReceiver(SyncCompletePayload.ID, (syncCompletePayload, context) -> context.networkHandler().completeTask(RegistrySyncManager$SyncConfigurationTask.KEY));
        RegistryAttributeHolder.get((class00751)class04206.y).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.L).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.u).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.i).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.M).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.B).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.Z).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.c);
        RegistryAttributeHolder.get((class00751)class04206.X);
        RegistryAttributeHolder.get((class00751)class04206.f);
        RegistryAttributeHolder.get((class00751)class04206.C);
        RegistryAttributeHolder.get((class00751)class04206.S);
        RegistryAttributeHolder.get((class00751)class04206.D);
        RegistryAttributeHolder.get((class00751)class04206.h);
        RegistryAttributeHolder.get((class00751)class04206.z).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.r);
        RegistryAttributeHolder.get((class00751)class04206.U).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.E).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.W);
        RegistryAttributeHolder.get((class00751)class04206.F);
        RegistryAttributeHolder.get((class00751)class04206.p);
        RegistryAttributeHolder.get((class00751)class04206.m);
        RegistryAttributeHolder.get((class00751)class04206.s);
        RegistryAttributeHolder.get((class00751)class04206.NR);
        RegistryAttributeHolder.get((class00751)class04206.NM);
        RegistryAttributeHolder.get((class00751)class04206.t).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.T).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.b);
        RegistryAttributeHolder.get((class00751)class04206.v).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.G).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.l).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.d).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.w);
        RegistryAttributeHolder.get((class00751)class04206.k);
        RegistryAttributeHolder.get((class00751)class04206.Y);
        RegistryAttributeHolder.get((class00751)class04206.Q);
        RegistryAttributeHolder.get((class00751)class04206.O);
        RegistryAttributeHolder.get((class00751)class04206.g);
        RegistryAttributeHolder.get((class00751)class04206.I);
        RegistryAttributeHolder.get((class00751)class04206.N).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.NE).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.n).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.NW).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.Ns).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.NT).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.Nl).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.Nd).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.Nw).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.Nk).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.w).addAttribute(RegistryAttribute.SYNCED);
        RegistryAttributeHolder.get((class00751)class04206.R).addAttribute(RegistryAttribute.SYNCED);
    }
}

