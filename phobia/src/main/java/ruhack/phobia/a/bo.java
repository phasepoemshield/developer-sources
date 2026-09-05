/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  net.minecraft.class_11533
 *  net.minecraft.class_11786
 *  net.minecraft.class_11786$class_11787
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  net.minecraft.class_9296
 *  net.minecraft.class_9334
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_11533;
import net.minecraft.class_11786;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_9296;
import net.minecraft.class_9334;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.nk;

@Mixin(value={class_11533.class})
public abstract class bo {
    private static final Logger PHOBIA_LOGGER = LogUtils.getLogger();
    private static final Map<Integer, class_2960> PHOBIA_TEXTURE_PATHS = new ConcurrentHashMap<Integer, class_2960>();
    private static final Set<String> PHOBIA_SEEN_STACKS = ConcurrentHashMap.newKeySet();
    @Shadow
    @Final
    private class_11786 field_62262;

    @Inject(method={"method_72176"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$useLegacySkin(class_1799 stack, CallbackInfoReturnable<class_11786.class_11787> cir) {
        class_9296 legacyProfile = nk.get(stack);
        class_9296 currentProfile = (class_9296)stack.method_58694(class_9334.field_49617);
        class_9296 profile = legacyProfile != null ? legacyProfile : currentProfile;
        String diagnosticKey = stack.method_7909().toString() + ":" + String.valueOf(profile == null ? "none" : Integer.valueOf(profile.hashCode()));
        if (PHOBIA_SEEN_STACKS.add(diagnosticKey)) {
            PHOBIA_LOGGER.info("[Phobia HeadFix] head item={} legacy={} profile={} components={}", new Object[]{stack.method_7909(), legacyProfile != null, currentProfile == null ? "none" : currentProfile.getClass().getName(), stack.method_57353()});
        }
        if (profile != null) {
            class_2960 previous;
            class_11786.class_11787 entry = this.field_62262.method_73495(profile);
            class_2960 path = entry.method_73503().comp_1626().comp_3627();
            if (!path.equals((Object)(previous = PHOBIA_TEXTURE_PATHS.put(profile.hashCode(), path)))) {
                PHOBIA_LOGGER.info("[Phobia HeadFix] renderer profile={} texture={}", (Object)profile.hashCode(), (Object)path);
            }
            cir.setReturnValue((Object)entry);
        }
    }
}

