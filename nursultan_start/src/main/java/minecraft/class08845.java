/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02028
 *  minecraft.class04673
 *  minecraft.class06584
 *  minecraft.class07311
 *  minecraft.class08350
 *  minecraft.class08496
 *  minecraft.class08510
 *  minecraft.class08517
 *  minecraft.class08529
 *  minecraft.class08905
 *  minecraft.class08910
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 *  net.fabricmc.fabric.api.renderer.v1.model.MeshBakedGeometry
 *  net.fabricmc.fabric.impl.renderer.BasicItemModelExtension
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Function;
import minecraft.class01894;
import minecraft.class02028;
import minecraft.class04673;
import minecraft.class06584;
import minecraft.class07311;
import minecraft.class08350;
import minecraft.class08496;
import minecraft.class08510;
import minecraft.class08517;
import minecraft.class08529;
import minecraft.class08808;
import minecraft.class08835;
import minecraft.class08838;
import minecraft.class08843;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.model.MeshBakedGeometry;
import net.fabricmc.fabric.impl.renderer.BasicItemModelExtension;

@Environment(value=EnvType.CLIENT)
public final class class08845
extends Record
implements class08895 {
    private final class01894 model;
    private final List<class08843> tints;
    public static final MapCodec<class08845> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("model").forGetter(class08845::N), (App)class08835.y.listOf().optionalFieldOf("tints", List.of()).forGetter(class08845::y)).apply(instance, class08845::new));

    public class08845(class01894 class018942, List<class08843> list) {
        this.model = class018942;
        this.tints = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08845.class, "model;tints", "model", "tints"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08845.class, "model;tints", "model", "tints"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08845.class, "model;tints", "model", "tints"}, this);
    }

    public List<class08843> y() {
        return this.tints;
    }

    private class08808 N(class08808 class088082, class08905 class089052, LocalRef localRef) {
        Mesh mesh = (Mesh)localRef.get();
        if (mesh != null) {
            ((BasicItemModelExtension)class088082).fabric_setMesh(mesh, class089052.N().y());
        }
        return class088082;
    }

    private class08496 N(class08496 class084962, LocalRef localRef) {
        if (class084962 instanceof MeshBakedGeometry) {
            MeshBakedGeometry meshBakedGeometry = (MeshBakedGeometry)class084962;
            localRef.set((Object)meshBakedGeometry.getMesh());
        }
        return class084962;
    }

    public class01894 N() {
        return this.model;
    }

    public void method_62326(class08350 class083502) {
        class083502.markDependency(this.model);
    }

    public MapCodec<class08845> method_65585() {
        return N;
    }

    @Override
    public class08910 method_65587(class08905 class089052) {
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(null);
        class02028 class020282 = class089052.N();
        class08529 class085292 = class020282.N(this.model);
        class08838 class088382 = class085292.B();
        List list = this.N(class085292.N(class088382, class020282, (class04673)class08510.N), (LocalRef)localRefImpl).method_68048();
        class08517 class085172 = class08517.N((class02028)class020282, (class08529)class085292, (class08838)class088382);
        Function<class06584, class07311> function = class08808.y(list);
        return this.N(new class08808(this.tints, list, class085172, function), class089052, (LocalRef)localRefImpl);
    }
}

