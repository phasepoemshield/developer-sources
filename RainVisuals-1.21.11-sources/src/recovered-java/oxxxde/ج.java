/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.text.Text
 */
package oxxxde;

import java.util.Map;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0632\u062f;
import oxxxde.\u0636\u0621;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0018\u00a8\u0006\u001d"}, d2={"Loxxxde/\u062c;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_2561;", "message", "", "checkForMention", "(Lnet/minecraft/class_2561;)V", "", "mode", "displayNameForSound", "(Ljava/lang/String;)Ljava/lang/String;", "", "soundLabels", "Ljava/util/Map;", "Loxxxde/\u0638\u064a;", "soundMode", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "volume", "Loxxxde/\u0637\u064f;", "", "SOUND_EXP", "I", "SOUND_BOW", "SOUND_CAT", "SOUND_VILLAGER", "SOUND_VK", "rain-visuals"})
public final class \u062c
extends Module {
    @NotNull
    private static final Map<String, String> soundLabels;
    private static final int SOUND_CAT = 2;
    private static final int SOUND_VILLAGER = 3;
    private static final int SOUND_BOW = 1;
    @NotNull
    private static final SliderSetting volume;
    private static final int SOUND_EXP = 0;
    @NotNull
    private static final ModeSetting soundMode;
    @NotNull
    public static final \u062c INSTANCE;
    private static final int SOUND_VK = 4;

    private final String displayNameForSound(String mode) {
        String string = soundLabels.get(mode);
        if (string == null) {
            string = mode;
        }
        return string;
    }

    private \u062c() {
        super("PingInChat", \u0638\u0646.getPLAYER(), "\u0417\u0432\u0443\u043a \u043f\u0440\u0438 \u043f\u0438\u043d\u0433\u0435 \u043d\u0438\u043a\u0430 \u0432 \u0447\u0430\u0442\u0435");
    }

    public static final /* synthetic */ String access$displayNameForSound(\u062c $this, String mode) {
        return $this.displayNameForSound(mode);
    }

    static {
        INSTANCE = new \u062c();
        Object[] objectArray = new Pair[5];
        objectArray[0] = TuplesKt.to("Exp", "Experience");
        objectArray[1] = TuplesKt.to("Bow", "Bow");
        objectArray[2] = TuplesKt.to("Cat", "Cat");
        objectArray[3] = TuplesKt.to("Villager", "Villager");
        objectArray[4] = TuplesKt.to("Vk", "VK");
        soundLabels = MapsKt.mapOf(objectArray);
        objectArray = new String[5];
        objectArray[0] = "\u041e\u043f\u044b\u0442";
        objectArray[1] = "\u041b\u0443\u043a";
        objectArray[2] = "\u041a\u043e\u0448\u043a\u0430";
        objectArray[3] = "\u0416\u0438\u0442\u0435\u043b\u044c";
        objectArray[4] = "\u0412\u043a";
        soundMode = Module.mode$default(INSTANCE, "\u0417\u0432\u0443\u043a", CollectionsKt.listOf(objectArray), 0, null, 12, null);
        volume = Module.slider$default(INSTANCE, "\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c", 1.0f, 0.1f, 1.0f, 0.1f, null, 32, null);
        soundMode.withDisplayNameProvider(new \u0636\u0621(INSTANCE));
    }

    public final void checkForMention(@NotNull Text message) {
        block10: {
            SoundEvent soundEvent;
            Intrinsics.checkNotNullParameter(message, "message");
            if (!this.isEnabled()) {
                return;
            }
            Object object = \u0636\u0643.getMc().player;
            if (object == null || (object = object.getName()) == null || (object = object.getString()) == null) {
                return;
            }
            Object playerName = object;
            String string = message.getString();
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String text = string;
            Regex regex = new Regex("\\b" + Regex.Companion.escape((String)playerName) + "\\b", RegexOption.IGNORE_CASE);
            if (!regex.containsMatchIn(text)) {
                return;
            }
            switch (soundMode.getSelectedIndex()) {
                case 1: {
                    SoundEvent soundEvent2 = SoundEvents.ENTITY_ARROW_SHOOT;
                    soundEvent = soundEvent2;
                    Intrinsics.checkNotNullExpressionValue(soundEvent2, "ARROW_SHOOT");
                    break;
                }
                case 2: {
                    SoundEvent soundEvent3 = SoundEvents.ENTITY_CAT_AMBIENT;
                    soundEvent = soundEvent3;
                    Intrinsics.checkNotNullExpressionValue(soundEvent3, "CAT_AMBIENT");
                    break;
                }
                case 3: {
                    SoundEvent soundEvent4 = SoundEvents.ENTITY_VILLAGER_AMBIENT;
                    soundEvent = soundEvent4;
                    Intrinsics.checkNotNullExpressionValue(soundEvent4, "VILLAGER_AMBIENT");
                    break;
                }
                case 4: {
                    soundEvent = \u0632\u062f.INSTANCE.getVK();
                    break;
                }
                case 0: {
                    SoundEvent soundEvent5 = SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP;
                    soundEvent = soundEvent5;
                    Intrinsics.checkNotNullExpressionValue(soundEvent5, "EXPERIENCE_ORB_PICKUP");
                    break;
                }
                default: {
                    SoundEvent soundEvent6 = SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP;
                    soundEvent = soundEvent6;
                    Intrinsics.checkNotNullExpressionValue(soundEvent6, "EXPERIENCE_ORB_PICKUP");
                }
            }
            SoundEvent sound = soundEvent;
            ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
            if (clientPlayerEntity == null) break block10;
            clientPlayerEntity.playSound(sound, ((Number)volume.getValue()).floatValue(), 1.0f);
        }
    }
}

