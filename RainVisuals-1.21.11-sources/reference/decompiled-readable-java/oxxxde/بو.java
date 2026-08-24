/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.sound.SoundEvent
 */
package oxxxde;

import java.util.Map;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u0625;
import oxxxde.\u0632\u062f;
import oxxxde.\u0635\u062b;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b(\u0010#\u00a8\u0006)"}, d2={"Loxxxde/\u0628\u0648;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0630\u0645;", "event", "", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lnet/minecraft/class_3414;", "selectedSound", "()Lnet/minecraft/class_3414;", "", "mode", "displayNameForSound", "(Ljava/lang/String;)Ljava/lang/String;", "Lnet/minecraft/class_746;", "player", "", "isCriticalHit", "(Lnet/minecraft/class_746;)Z", "", "soundLabels", "Ljava/util/Map;", "Loxxxde/\u0638\u064a;", "sound", "Loxxxde/\u0638\u064a;", "Loxxxde/\u062e\u0630;", "onlyCrit", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0637\u064f;", "volume", "Loxxxde/\u0637\u064f;", "", "SOUND_BELL", "I", "SOUND_BONK", "SOUND_BUBBLE", "SOUND_POP", "SOUND_UWU", "SOUND_VK", "rain-visuals"})
public final class \u0628\u0648
extends Module {
    @NotNull
    private static final BooleanSetting onlyCrit;
    @NotNull
    public static final \u0628\u0648 INSTANCE;
    private static final int SOUND_BONK = 1;
    @NotNull
    private static final SliderSetting volume;
    private static final int SOUND_BELL = 0;
    @NotNull
    private static final ModeSetting sound;
    private static final int SOUND_UWU = 4;
    private static final int SOUND_POP = 3;
    private static final int SOUND_BUBBLE = 2;
    @NotNull
    private static final Map<String, String> soundLabels;
    private static final int SOUND_VK = 5;

    private final SoundEvent selectedSound() {
        return switch (sound.getSelectedIndex()) {
            case 1 -> \u0632\u062f.INSTANCE.getBONK();
            case 2 -> \u0632\u062f.INSTANCE.getBUBBLE();
            case 3 -> \u0632\u062f.INSTANCE.getPOP();
            case 4 -> \u0632\u062f.INSTANCE.getUWU();
            case 5 -> \u0632\u062f.INSTANCE.getVK();
            case 0 -> \u0632\u062f.INSTANCE.getBELL();
            default -> \u0632\u062f.INSTANCE.getBELL();
        };
    }

    static {
        INSTANCE = new \u0628\u0648();
        Object[] objectArray = new Pair[6];
        objectArray[0] = TuplesKt.to("Bell", "Bell");
        objectArray[1] = TuplesKt.to("Bonk", "Bonk");
        objectArray[2] = TuplesKt.to("Bubble", "Bubble");
        objectArray[3] = TuplesKt.to("Pop", "Pop");
        objectArray[4] = TuplesKt.to("Uwu", "Uwu");
        objectArray[5] = TuplesKt.to("Vk", "VK");
        soundLabels = MapsKt.mapOf(objectArray);
        objectArray = new String[6];
        objectArray[0] = "\u041a\u043e\u043b\u043e\u043a\u043e\u043b";
        objectArray[1] = "\u0411\u043e\u043d\u043a";
        objectArray[2] = "\u041f\u0443\u0437\u044b\u0440\u0451\u043a";
        objectArray[3] = "\u041f\u043e\u043f";
        objectArray[4] = ">_<";
        objectArray[5] = "\u0412\u043a";
        sound = Module.mode$default(INSTANCE, "\u0417\u0432\u0443\u043a", CollectionsKt.listOf(objectArray), 0, null, 12, null);
        onlyCrit = Module.boolean$default(INSTANCE, "\u0422\u043e\u043b\u044c\u043a\u043e \u043f\u0440\u0438 \u043a\u0440\u0438\u0442\u0435", false, null, 4, null);
        volume = Module.slider$default(INSTANCE, "\u0413\u0440\u043e\u043c\u043a\u043e\u0441\u0442\u044c", 1.0f, 0.1f, 2.0f, 0.1f, null, 32, null);
        sound.withDisplayNameProvider(new \u0635\u062b(INSTANCE));
    }

    private final String displayNameForSound(String mode) {
        String string = soundLabels.get(mode);
        if (string == null) {
            string = mode;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isCriticalHit(ClientPlayerEntity player) {
        void var3_3;
        void $this$hasStatusEffect$iv;
        if (!(player.fallDistance > 0.0)) return false;
        if (player.isOnGround()) return false;
        if (\u0637\u062b.isClimbing((LivingEntity)player)) return false;
        if (player.isTouchingWater()) return false;
        if (player.hasVehicle()) return false;
        if (player.isSprinting()) return false;
        LivingEntity livingEntity = (LivingEntity)player;
        RegistryEntry registryEntry = StatusEffects.BLINDNESS;
        Intrinsics.checkNotNullExpressionValue(registryEntry, "BLINDNESS");
        RegistryEntry effect$iv = registryEntry;
        boolean $i$f$hasStatusEffect = false;
        if ($this$hasStatusEffect$iv.hasStatusEffect((RegistryEntry)var3_3)) return false;
        if (!(player.getAttackCooldownProgress(0.5f) > 0.9f)) return false;
        return true;
    }

    private \u0628\u0648() {
        super("HitSounds", \u0638\u0646.getPLAYER(), "\u0412\u043e\u0437\u043f\u0440\u043e\u0438\u0437\u0432\u0435\u0434\u0435\u043d\u0438\u0435 \u0437\u0432\u0443\u043a\u043e\u0432 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435");
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (!this.isEnabled()) {
            return;
        }
        if (!(event.getEntity() instanceof PlayerEntity)) {
            return;
        }
        if (\u0627\u0625.INSTANCE.isFakePlayer(event.getEntity())) {
            return;
        }
        if (((Boolean)onlyCrit.getValue()).booleanValue()) {
            if (!this.isCriticalHit(player)) {
                return;
            }
        }
        \u0636\u0643.getMc().getSoundManager().play((SoundInstance)PositionedSoundInstance.ui((SoundEvent)this.selectedSound(), (float)1.0f, (float)((Number)volume.getValue()).floatValue()));
    }

    public static final /* synthetic */ String access$displayNameForSound(\u0628\u0648 $this, String mode) {
        return $this.displayNameForSound(mode);
    }
}

