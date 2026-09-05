/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.SoundManager
 *  javax.annotation.Nullable
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class06613
 */
package de.maxhenkel.voicechat.gui.audiodevice;

import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.gui.audiodevice.AudioDeviceEntry;
import de.maxhenkel.voicechat.gui.widgets.ListScreenListBase;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class06613;

public abstract class AudioDeviceList
extends ListScreenListBase<AudioDeviceEntry> {
    public static final int CELL_HEIGHT = 36;
    @Nullable
    protected class01894 icon;
    @Nullable
    protected class00392 defaultDeviceText;
    @Nullable
    protected ConfigEntry<String> configEntry;

    public boolean isSelected(String string) {
        if (this.configEntry == null) {
            return false;
        }
        return ((String)this.configEntry.get()).equals(string);
    }

    public AudioDeviceList(int n, int n2, int n3) {
        super(n, n2, n3, 36);
    }

    public boolean isEmpty() {
        return this.method_25396().isEmpty();
    }

    public abstract AudioDeviceEntry createAudioDeviceEntry(String var1, class00392 var2, @Nullable class01894 var3, Supplier<Boolean> var4);

    public boolean method_25402(class06613 class066132, boolean bl) {
        AudioDeviceEntry audioDeviceEntry = (AudioDeviceEntry)this.method_25308(class066132.n(), class066132.t());
        if (audioDeviceEntry == null) {
            return false;
        }
        if (!this.method_49606()) {
            return false;
        }
        if (!this.isSelected(audioDeviceEntry.getDevice())) {
            this.field_22740.Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            this.onSelect(audioDeviceEntry);
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public void setAudioDevices(Collection<String> collection) {
        this.method_25314(Stream.concat(Stream.of(""), collection.stream()).map(string -> this.createAudioDeviceEntry((String)string, this.getVisibleName((String)string), this.icon, () -> this.isSelected((String)string))).toList());
    }

    public class00392 getVisibleName(String string) {
        if (string.isEmpty() && this.defaultDeviceText != null) {
            return this.defaultDeviceText;
        }
        return class00392.y((String)SoundManager.cleanDeviceName((String)string));
    }

    protected void onSelect(AudioDeviceEntry audioDeviceEntry) {
        ClientVoicechat clientVoicechat;
        if (this.configEntry != null) {
            this.configEntry.set((Object)audioDeviceEntry.device).save();
        }
        if ((clientVoicechat = ClientManager.getClient()) != null) {
            clientVoicechat.reloadAudio();
        }
    }

    public void method_25314(Collection<AudioDeviceEntry> collection) {
        super.method_25314(collection);
    }
}

