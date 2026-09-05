/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  java.lang.MatchException
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.speaker.ALSpeaker;
import de.maxhenkel.voicechat.voice.client.speaker.ALSpeakerBase;
import de.maxhenkel.voicechat.voice.client.speaker.AudioType;
import de.maxhenkel.voicechat.voice.client.speaker.FakeALSpeaker;
import de.maxhenkel.voicechat.voice.client.speaker.MonoALSpeaker;
import de.maxhenkel.voicechat.voice.client.speaker.Speaker;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerException;
import java.util.UUID;
import javax.annotation.Nullable;

public class SpeakerManager {
    public static Speaker createSpeaker(SoundManager soundManager, @Nullable UUID uUID) throws SpeakerException {
        ALSpeakerBase aLSpeakerBase = switch ((AudioType)((Object)VoicechatClient.CLIENT_CONFIG.audioType.get())) {
            default -> throw new MatchException(null, null);
            case AudioType.NORMAL -> new ALSpeaker(soundManager, 48000, 960, uUID);
            case AudioType.REDUCED -> new FakeALSpeaker(soundManager, 48000, 960, uUID);
            case AudioType.OFF -> new MonoALSpeaker(soundManager, 48000, 960, uUID);
        };
        aLSpeakerBase.open();
        return aLSpeakerBase;
    }
}

