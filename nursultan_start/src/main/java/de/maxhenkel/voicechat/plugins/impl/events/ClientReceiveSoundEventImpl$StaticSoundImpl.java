/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent$StaticSound
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientReceiveSoundEventImpl;
import java.util.UUID;

public class ClientReceiveSoundEventImpl$StaticSoundImpl
extends ClientReceiveSoundEventImpl
implements ClientReceiveSoundEvent.StaticSound {
    public ClientReceiveSoundEventImpl$StaticSoundImpl(UUID uUID, short[] sArray) {
        super(uUID, sArray);
    }
}

