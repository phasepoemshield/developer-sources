/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00891
 *  minecraft.class01325
 *  minecraft.class01894
 *  minecraft.class02957
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class03839
 *  minecraft.class04227
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class06962
 *  minecraft.class07428
 *  minecraft.class07536
 *  minecraft.class08216
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder
 *  net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl
 *  net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder
 *  net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder$Living
 *  net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder$Mob
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class01325;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class03839;
import minecraft.class04227;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class06962;
import minecraft.class07040;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07428;
import minecraft.class07536;
import minecraft.class08216;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07045<T extends class07049>
implements FabricEntityType.Builder,
FabricEntityTypeImpl.Builder {
    private final class07040<T> N;
    private final class07428 y;
    private ImmutableSet<class00891> L = ImmutableSet.of();
    private boolean u = true;
    private boolean i = true;
    private boolean R;
    private boolean M;
    private int B = 5;
    private int Z = 3;
    private class01325 z = class01325.y((float)0.6f, (float)1.8f);
    private float U = 1.0f;
    private class03839 E = class03810.N();
    private class03767 W = class03794.M;
    private class08216<class07078<?>, Optional<class05946<class05074>>> m = class059462 -> Optional.of(class05946.N((class05946)class04227.yJ, (class01894)class059462.N().R("entities/")));
    private final class08216<class07078<?>, String> P = class059462 -> class07536.N((String)"entity", (class01894)class059462.N());
    private boolean s = true;
    private @Nullable Boolean T = null;
    private @Nullable Boolean b = null;
    private FabricEntityTypeImpl.Builder.Living j = null;
    private FabricEntityTypeImpl.Builder.Mob v = null;

    public class07045<T> L(float f) {
        return this.N(class03831.field_47744, 0.0f, -f, 0.0f);
    }

    public class07045<T> L() {
        this.R = true;
        return this;
    }

    private class07045(class07040<T> class070402, class07428 class074282) {
        this.N = class070402;
        this.y = class074282;
        this.M = class074282 == class07428.field_6294 || class074282 == class07428.field_17715;
    }

    public class07045<T> i() {
        this.m = class08216.N(Optional.empty());
        return this;
    }

    public class07045<T> u() {
        this.M = true;
        return this;
    }

    public class07045<T> u(float f) {
        return this.N(class03831.field_47745, 0.0f, f, 0.0f);
    }

    public class07045<T> y() {
        this.u = false;
        return this;
    }

    private static class07078 y(class07078 class070782) {
        return class070782;
    }

    public class07045<T> y(int n) {
        this.Z = n;
        return this;
    }

    public class07045<T> y(float f) {
        this.z = this.z.y(f);
        return this;
    }

    private @Nullable Type N(DSL.TypeReference typeReference, String string, Operation operation, LocalRef localRef) {
        return this.N(typeReference, string, operation, (class05946)localRef.get());
    }

    public class07045<T> N(class02957 ... class02957Array) {
        this.W = class03794.i.N(class02957Array);
        return this;
    }

    private void N(class05946 class059462, CallbackInfoReturnable callbackInfoReturnable) {
        Object object = callbackInfoReturnable.getReturnValue();
        if (!(object instanceof FabricEntityTypeImpl)) {
            throw new IllegalStateException();
        }
        FabricEntityTypeImpl fabricEntityTypeImpl = (FabricEntityTypeImpl)object;
        fabricEntityTypeImpl.fabric_setAlwaysUpdateVelocity(this.T);
        fabricEntityTypeImpl.fabric_setCanPotentiallyExecuteCommands(this.b);
        if (this.j != null) {
            this.j.onBuild(class07045.N((class07078)callbackInfoReturnable.getReturnValue()));
        }
        if (this.v != null) {
            this.v.onBuild(class07045.y((class07078)callbackInfoReturnable.getReturnValue()));
        }
    }

    private static class07078 N(class07078 class070782) {
        return class070782;
    }

    public class07078<T> N(class05946<class07078<?>> class059462) {
        if (this.u) {
            String string = class059462.N().toString();
            DSL.TypeReference typeReference = class06962.J;
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[com.mojang.datafixers.DSL$TypeReference, java.lang.String]");
                return class07536.N((DSL.TypeReference)((DSL.TypeReference)objectArray[0]), (String)((String)objectArray[1]));
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init(class059462);
            this.N(typeReference, string, operation, (LocalRef)localRefImpl);
            class059462 = (class05946)localRefImpl.dispose();
        }
        class07078<T> class070782 = new class07078<T>(this.N, this.y, this.u, this.i, this.R, this.M, this.L, this.z.N(this.E), this.U, this.B, this.Z, (String)this.P.get(class059462), (Optional)this.m.get(class059462), this.W, this.s);
        this.N(class059462, new CallbackInfoReturnable("", false, class070782));
        return class070782;
    }

    private @Nullable Type N(DSL.TypeReference typeReference, String string, Operation operation, class05946 class059462) {
        if (!class059462.N().y().equals("minecraft")) {
            return null;
        }
        return (Type)operation.call(new Object[]{typeReference, string});
    }

    public class07045<T> N(float ... fArray) {
        for (float f : fArray) {
            this.E = this.E.N(class03831.field_47743, 0.0f, f, 0.0f);
        }
        return this;
    }

    public class07045<T> N(class06889 ... class06889Array) {
        for (class06889 class068892 : class06889Array) {
            this.E = this.E.N(class03831.field_47743, class068892);
        }
        return this;
    }

    public static <T extends class07049> class07045<T> N(class07040<T> class070402, class07428 class074282) {
        return new class07045<T>(class070402, class074282);
    }

    public class07045<T> N(class06889 class068892) {
        return this.N(class03831.field_47744, class068892);
    }

    public class07045<T> N(float f) {
        this.U = f;
        return this;
    }

    public class07045<T> N(float f, float f2) {
        this.z = class01325.y((float)f, (float)f2);
        return this;
    }

    public static <T extends class07049> class07045<T> N(class07428 class074282) {
        return new class07045<class07049>((class070782, class072992) -> null, class074282);
    }

    public class07045<T> N(int n) {
        this.B = n;
        return this;
    }

    public class07045<T> N() {
        this.i = false;
        return this;
    }

    public class07045<T> N(class03831 class038312, class06889 class068892) {
        this.E = this.E.N(class038312, class068892);
        return this;
    }

    public class07045<T> N(class03831 class038312, float f, float f2, float f3) {
        this.E = this.E.N(class038312, f, f2, f3);
        return this;
    }

    public class07045<T> N(class00891 ... class00891Array) {
        this.L = ImmutableSet.copyOf((Object[])class00891Array);
        return this;
    }

    public class07045 canPotentiallyExecuteCommands(boolean bl) {
        this.b = bl;
        return this;
    }

    public void fabric_setLivingEntityBuilder(FabricEntityTypeImpl.Builder.Living living) {
        Objects.requireNonNull(living, "Cannot set null living entity builder");
        this.j = living;
    }

    public class07045<T> R() {
        this.s = false;
        return this;
    }

    public class07045 alwaysUpdateVelocity(boolean bl) {
        this.T = bl;
        return this;
    }

    public void fabric_setMobEntityBuilder(FabricEntityTypeImpl.Builder.Mob mob) {
        Objects.requireNonNull(mob, "Cannot set null mob entity builder");
        this.v = mob;
    }
}

