/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01283
 *  minecraft.class01603
 *  minecraft.class01612
 *  minecraft.class01614
 *  minecraft.class01622
 *  minecraft.class02267
 *  minecraft.class02268
 *  minecraft.class02974
 *  minecraft.class03767
 *  minecraft.class04150
 *  minecraft.class04548
 *  minecraft.class07529
 *  minecraft.class08735
 *  net.fabricmc.fabric.impl.resource.PackSourceTracker
 *  net.fabricmc.fabric.impl.resource.conditions.OverlayConditionsMetadata
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01061;
import minecraft.class01078;
import minecraft.class01090;
import minecraft.class01283;
import minecraft.class01603;
import minecraft.class01612;
import minecraft.class01614;
import minecraft.class01622;
import minecraft.class02267;
import minecraft.class02268;
import minecraft.class02974;
import minecraft.class03767;
import minecraft.class04150;
import minecraft.class04548;
import minecraft.class07529;
import minecraft.class08735;
import net.fabricmc.fabric.impl.resource.PackSourceTracker;
import net.fabricmc.fabric.impl.resource.conditions.OverlayConditionsMetadata;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01055
implements FabricPack {
    private static final Logger N = LogUtils.getLogger();
    private final class02267 y;
    private final class01061 L;
    private final class01078 u;
    private final class02268 i;
    private static final Predicate R;
    private Predicate M = R;

    public class00392 L() {
        return this.u.N();
    }

    public String M() {
        return this.y.N();
    }

    public boolean fabric$isHidden() {
        return this.M != R;
    }

    public class01055(class02267 class022672, class01061 class010612, class01078 class010782, class02268 class022682) {
        this.y = class022672;
        this.L = class010612;
        this.u = class010782;
        this.i = class022682;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class01055)) {
            return false;
        }
        class01055 class010552 = (class01055)object;
        return this.y.equals((Object)class010552.y);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public class02268 B() {
        return this.i;
    }

    public boolean Z() {
        return this.i.N();
    }

    public class03767 i() {
        return this.u.L();
    }

    public class01090 U() {
        return this.i.y();
    }

    public boolean z() {
        return this.i.L();
    }

    public class01614 u() {
        return this.u.y();
    }

    public class00392 y() {
        return this.y.y();
    }

    public class01283 E() {
        return this.y.L();
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        PackSourceTracker.setSource((class01622)((class01622)callbackInfoReturnable.getReturnValue()), (class01283)this.N().L());
    }

    private static /* synthetic */ boolean N(Set set) {
        return true;
    }

    private static List N(List list, class01622 class016222) throws IOException {
        ArrayList arrayList = new ArrayList(list);
        OverlayConditionsMetadata overlayConditionsMetadata = (OverlayConditionsMetadata)class016222.method_14407(OverlayConditionsMetadata.SERIALIZER);
        if (overlayConditionsMetadata != null) {
            arrayList.addAll(overlayConditionsMetadata.appliedOverlays());
        }
        return List.copyOf(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static @Nullable class01078 N(class02267 class022672, class01061 class010612, class08735 class087352, class01603 class016032) {
        try (class01622 class016222 = class010612.method_52424(class022672);){
            class01612 class016122 = (class01612)class016222.method_14407(class01612.y((class01603)class016032));
            if (class016122 == null) {
                class016122 = (class01612)class016222.method_14407(class01612.L);
            }
            if (class016122 == null) {
                N.warn("Missing metadata in pack {}", (Object)class022672.N());
                class01078 class010783 = null;
                return class010783;
            }
            class02974 class029742 = (class02974)class016222.method_14407(class02974.N);
            class03767 class037672 = class029742 != null ? class029742.N() : class03767.N();
            class01614 class016142 = class01614.N((class04548)class016122.y(), (class08735)class087352);
            class04150 class041502 = (class04150)class016222.method_14407(class04150.y((class01603)class016032));
            List list = class041502 != null ? class041502.N(class087352) : List.of();
            list = class01055.N(list, class016222);
            class01078 class010782 = new class01078(class016122.N(), class016142, class037672, list);
            return class010782;
        }
        catch (Exception exception) {
            N.warn("Failed to read pack {} metadata", (Object)class022672.N(), (Object)exception);
            return null;
        }
    }

    public class02267 N() {
        return this.y;
    }

    public class00392 N(boolean bl) {
        return this.y.N(bl, this.u.N());
    }

    public static @Nullable class01055 N(class02267 class022672, class01061 class010612, class01603 class016032, class02268 class022682) {
        class08735 class087352 = class07529.y().method_70592(class016032);
        class01078 class010782 = class01055.N(class022672, class010612, class087352, class016032);
        return class010782 != null ? new class01055(class022672, class010612, class010782, class022682) : null;
    }

    public boolean fabric$parentsEnabled(Set set) {
        return this.M.test(set);
    }

    public class01622 R() {
        class01622 class016222 = this.L.method_52425(this.y, this.u);
        this.N(new CallbackInfoReturnable("", false, (Object)class016222));
        return class016222;
    }

    public void fabric$setParentsPredicate(Predicate predicate) {
        this.M = predicate;
    }
}

