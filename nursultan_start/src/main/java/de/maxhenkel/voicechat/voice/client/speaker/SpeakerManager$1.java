/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import de.maxhenkel.voicechat.voice.client.speaker.AudioType;

class SpeakerManager$1 {
    static final /* synthetic */ int[] $SwitchMap$de$maxhenkel$voicechat$voice$client$speaker$AudioType;

    static {
        $SwitchMap$de$maxhenkel$voicechat$voice$client$speaker$AudioType = new int[AudioType.values().length];
        try {
            SpeakerManager$1.$SwitchMap$de$maxhenkel$voicechat$voice$client$speaker$AudioType[AudioType.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SpeakerManager$1.$SwitchMap$de$maxhenkel$voicechat$voice$client$speaker$AudioType[AudioType.REDUCED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SpeakerManager$1.$SwitchMap$de$maxhenkel$voicechat$voice$client$speaker$AudioType[AudioType.OFF.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

