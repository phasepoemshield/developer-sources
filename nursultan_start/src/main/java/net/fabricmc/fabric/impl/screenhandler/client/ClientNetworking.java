/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05851
 *  minecraft.class05866
 *  minecraft.class05868
 *  minecraft.class05877
 *  minecraft.class06202
 *  minecraft.class07482
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.screenhandler.client;

import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05851;
import minecraft.class05866;
import minecraft.class05868;
import minecraft.class05877;
import minecraft.class06202;
import minecraft.class07482;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.fabric.impl.screenhandler.Networking$OpenScreenPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientNetworking
implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-screen-handler-api-v1/client");

    private <D> void openScreen(Networking$OpenScreenPayload<D> networking$OpenScreenPayload) {
        class01894 class018942 = networking$OpenScreenPayload.identifier();
        int n = networking$OpenScreenPayload.syncId();
        class00392 class003922 = networking$OpenScreenPayload.title();
        class05851 class058512 = (class05851)class04206.T.N(class018942);
        if (class058512 == null || networking$OpenScreenPayload.data() == null) {
            LOGGER.warn("Unknown screen handler ID: {}", (Object)class018942);
            return;
        }
        if (!(class058512 instanceof ExtendedScreenHandlerType)) {
            LOGGER.warn("Received extended opening packet for non-extended screen handler {}", (Object)class018942);
            return;
        }
        class05877 class058772 = class05866.N((class05851)class058512);
        if (class058772 != null) {
            class06202 class062022 = class06202.Nq();
            class04453 class044532 = (class04453)class062022.T_4;
            class05096 class050962 = class058772.create(((ExtendedScreenHandlerType)class058512).create(n, class044532.method_31548(), networking$OpenScreenPayload.data()), class044532.method_31548(), class003922);
            class07482 class074822 = ((class05868)class050962).E();
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class074822;
            class062022.N(class050962);
        } else {
            LOGGER.warn("Screen not registered for screen handler {}!", (Object)class018942);
        }
    }

    public void onInitializeClient() {
        ClientPlayNetworking.registerGlobalReceiver(Networking$OpenScreenPayload.ID, (networking$OpenScreenPayload, context) -> this.openScreen((Networking$OpenScreenPayload)networking$OpenScreenPayload));
    }
}

