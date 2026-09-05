/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.KeyEvents
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06601
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.VoiceChatScreen;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingScreenBase;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06601;

public class FinalOnboardingScreen
extends OnboardingScreenBase {
    private static final class00392 TITLE = class00392.L((String)"message.voicechat.onboarding.final").N(class06541.field_1067);
    private static final class00392 FINISH_SETUP = class00392.L((String)"message.voicechat.onboarding.final.finish_setup");
    protected class00392 description = class00392.i();

    public FinalOnboardingScreen(@Nullable class05096 class050962) {
        super(TITLE, class050962);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        class05216 class052162 = class00392.N((String)"message.voicechat.onboarding.final.description.success", (Object[])new Object[]{KeyEvents.KEY_VOICE_CHAT.m().L().N(new class06541[]{class06541.field_1067, class06541.field_1073})}).i("\n\n");
        class052162 = ((MicrophoneActivationType)VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get()).equals((Object)MicrophoneActivationType.PTT) ? class052162.y((class00392)class00392.N((String)"message.voicechat.onboarding.final.description.ptt", (Object[])new Object[]{KeyEvents.KEY_PTT.m().L().N(new class06541[]{class06541.field_1067, class06541.field_1073})}).N(class06541.field_1067)).i("\n\n") : class052162.y((class00392)class00392.N((String)"message.voicechat.onboarding.final.description.voice", (Object[])new Object[]{KeyEvents.KEY_MUTE.m().L().N(new class06541[]{class06541.field_1067, class06541.field_1073})}).N(class06541.field_1067)).i("\n\n");
        this.description = class052162.y((class00392)class00392.L((String)"message.voicechat.onboarding.final.description.configuration"));
        this.addBackOrCancelButton();
        this.addPositiveButton(FINISH_SETUP, class053622 -> OnboardingManager.finishOnboarding());
    }

    public boolean method_25422() {
        return false;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i()) {
            OnboardingManager.finishOnboarding();
            return true;
        }
        if (class066012.v() == ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_VOICE_CHAT).y()) {
            OnboardingManager.finishOnboarding();
            this.field_22787.N((class05096)new VoiceChatScreen());
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderTitle(class010542, TITLE);
        this.renderMultilineText(class010542, this.description);
    }
}

