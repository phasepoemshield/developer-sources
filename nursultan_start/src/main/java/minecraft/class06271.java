/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class01894
 *  minecraft.class07311
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricModel
 *  net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01894;
import minecraft.class07311;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricModel;
import net.fabricmc.fabric.mixin.client.rendering.ModelPartAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public abstract class class06271<S>
implements FabricModel {
    protected final class01686 field_54014;
    protected final Function<class01894, class07311> field_21343;
    private final List<class01686> field_54013;
    private final Map childPartMap = new Object2ObjectOpenHashMap();

    public class06271(class01686 class016862, Function<class01894, class07311> function) {
        this.field_54014 = class016862;
        this.field_21343 = function;
        this.field_54013 = class016862.i();
        this.m_handler$zom000$fabric_rendering_v1$fillChildPartMap_56(class016862, function, null);
    }

    private void m_handler$zom000$fabric_rendering_v1$fillChildPartMap_56(class01686 class016862, Function function, CallbackInfo callbackInfo) {
        ((ModelPartAccessor)class016862).fabric$callForEachChild(this.childPartMap::putIfAbsent);
    }

    public final class01686 method_63512() {
        return this.field_54014;
    }

    public void method_2819(S s) {
        this.method_63514();
    }

    public final class07311 method_23500(class01894 class018942) {
        return this.field_21343.apply(class018942);
    }

    public final void method_62100(class01421 class014212, class01391 class013912, int n, int n2, int n3) {
        this.method_63512().N(class014212, class013912, n, n2, n3);
    }

    public @Nullable class01686 getChildPart(String string) {
        return (class01686)this.childPartMap.get(string);
    }

    public void copyTransforms(class06271 class062712) {
        class06271.copyTransforms(class062712.method_63512(), this.method_63512());
        ((ModelPartAccessor)class062712.method_63512()).fabric$callForEachChild((string, class016862) -> {
            class01686 class016863 = this.getChildPart((String)string);
            if (class016863 != null) {
                class06271.copyTransforms(class016862, class016863);
            }
        });
    }

    private static void copyTransforms(class01686 class016862, class01686 class016863) {
        class016863.y = class016862.y;
        class016863.L = class016862.L;
        class016863.u = class016862.u;
        class016863.i = class016862.i;
        class016863.R = class016862.R;
        class016863.M = class016862.M;
        class016863.B = class016862.B;
        class016863.Z = class016862.Z;
        class016863.z = class016862.z;
    }

    public final void method_63514() {
        Iterator<class01686> var1 = this.field_54013.iterator();
        while (var1.hasNext()) {
            var1.next().L();
        }
    }

    public final List<class01686> method_63513() {
        return this.field_54013;
    }

    public final void method_60879(class01421 class014212, class01391 class013912, int n, int n2) {
        this.method_62100(class014212, class013912, n, n2, -1);
    }
}

