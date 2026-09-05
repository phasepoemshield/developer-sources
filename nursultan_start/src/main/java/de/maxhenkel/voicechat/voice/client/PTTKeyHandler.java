/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class04671
 *  minecraft.class06202
 *  minecraft.class06595
 *  minecraft.class06601
 *  minecraft.class08844
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class04671;
import minecraft.class06202;
import minecraft.class06595;
import minecraft.class06601;
import minecraft.class08844;

public class PTTKeyHandler {
    private boolean pttKeyDown;
    private boolean whisperKeyDown;

    public PTTKeyHandler() {
        ClientCompatibilityManager.INSTANCE.onKeyboardEvent(this::onKeyboardEvent);
        ClientCompatibilityManager.INSTANCE.onMouseEvent(this::onMouseEvent);
    }

    public boolean isWhisperDown() {
        return this.whisperKeyDown;
    }

    public boolean isAnyDown() {
        return this.pttKeyDown || this.whisperKeyDown;
    }

    public boolean isPTTDown() {
        return this.pttKeyDown;
    }

    public void onMouseEvent(class06595 class065952, int n) {
        class04671 class046712;
        class04671 class046713 = ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_PTT);
        if (class046713.y() != -1 && class046713.N().equals((Object)class04648.field_1672) && class046713.y() == class065952.v()) {
            boolean bl = this.pttKeyDown = n != 0;
        }
        if ((class046712 = ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_WHISPER)).y() != -1 && class046712.N().equals((Object)class04648.field_1672) && class046712.y() == class065952.v()) {
            this.whisperKeyDown = n != 0;
        }
    }

    public void onKeyboardEvent(class06601 class066012) {
        class04671 class046712;
        class04671 class046713 = ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_PTT);
        if (class046713.y() != -1 && !class046713.N().equals((Object)class04648.field_1672)) {
            this.pttKeyDown = class04655.N((class08844)class06202.Nq().Nt(), (int)class046713.y());
        }
        if ((class046712 = ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_WHISPER)).y() != -1 && !class046712.N().equals((Object)class04648.field_1672)) {
            this.whisperKeyDown = class04655.N((class08844)class06202.Nq().Nt(), (int)class046712.y());
        }
    }
}

