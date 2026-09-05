/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00734
 *  minecraft.class01129
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06543
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06927
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07299
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.entity.EntityClassGroup
 *  net.caffeinemc.mods.lithium.common.entity.projectile.ProjectileEntityClassGroup
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00734;
import minecraft.class01129;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06543;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06927;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08007;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.entity.projectile.ProjectileEntityClassGroup;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import org.jspecify.annotations.Nullable;

public final class class08038 {
    public static final float N = 0.3f;

    public static Collection<class06145> N(class07299 class072992, class07049 class070492, class06889 class068892, class06889 class068893, class00734 class007342, Predicate<class07049> predicate, boolean bl) {
        return class08038.N(class072992, class070492, class068892, class068893, class007342, predicate, class08038.N(class070492), class05849.field_17558, bl);
    }

    public static Collection<class06145> N(class07299 class072992, class07049 class070492, class06889 class068892, class06889 class068893, class00734 class007342, Predicate<class07049> predicate, float f, class05849 class058492, boolean bl) {
        ArrayList<class06145> arrayList = new ArrayList<class06145>();
        for (class07049 class070493 : class072992.method_8333(class070492, class007342, predicate)) {
            Optional var18;
            class06889 class068894;
            Optional var14;
            class00734 class007343 = class070493.method_5829();
            if (bl && class007343.u(class068892)) {
                arrayList.add(new class06145(class070493, class068892));
                continue;
            }
            Optional var13 = class007343.y(class068892, class068893);
            if (var13.isPresent()) {
                arrayList.add(new class06145(class070493, (class06889)var13.get()));
                continue;
            }
            if ((double)f <= 0.0 || (var14 = class007343.M((double)f).y(class068892, class068893)).isEmpty()) continue;
            class06889 class068895 = (class06889)var14.get();
            class06183 class061832 = class072992.y(new class05862(class068895, class068894 = class007343.R(), class058492, class05835.field_1348, class070492));
            if (class061832.N() != class07113.field_1333) {
                class068894 = class061832.y();
            }
            if (!(var18 = class070493.method_5829().y(class068895, class068894)).isPresent()) continue;
            arrayList.add(new class06145(class070493, (class06889)var18.get()));
        }
        return arrayList;
    }

    public static void N(class07049 class070492, float f) {
        class06889 class068892 = class070492.method_18798();
        if (class068892.B() == 0.0) {
            return;
        }
        double d = class068892.Z();
        class070492.method_36456((float)(class04995.u((double)class068892.Z, (double)class068892.M) * 57.2957763671875) + 90.0f);
        class070492.method_36457((float)(class04995.u((double)d, (double)class068892.B) * 57.2957763671875) - 90.0f);
        while (class070492.method_36455() - class070492.field_6004 < -180.0f) {
            class070492.field_6004 -= 360.0f;
        }
        while (class070492.method_36455() - class070492.field_6004 >= 180.0f) {
            class070492.field_6004 += 360.0f;
        }
        while (class070492.method_36454() - class070492.field_5982 < -180.0f) {
            class070492.field_5982 -= 360.0f;
        }
        while (class070492.method_36454() - class070492.field_5982 >= 180.0f) {
            class070492.field_5982 += 360.0f;
        }
        class070492.method_36457(class04995.B((float)f, (float)class070492.field_6004, (float)class070492.method_36455()));
        class070492.method_36456(class04995.B((float)f, (float)class070492.field_5982, (float)class070492.method_36454()));
    }

    public static @Nullable class06145 N(class07299 class072992, class07049 class070492, class06889 class068892, class06889 class068893, class00734 class007342, Predicate<class07049> predicate, float f) {
        Optional var9;
        double d = Double.MAX_VALUE;
        Optional optional = Optional.empty();
        class07049 class070493 = null;
        for (class07049 class070494 : class08038.N(class072992, class070492, class007342, predicate, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)4, (String)"[net.minecraft.class_1937, net.minecraft.class_1297, net.minecraft.class_238, java.util.function.Predicate]");
            Object[] objectArray2 = objectArray;
            return ((class07299)objectArray[0]).method_8333((class07049)objectArray2[1], (class00734)objectArray2[2], (Predicate)objectArray2[3]);
        })) {
            double d2;
            Optional var14 = class070494.method_5829().M((double)f).y(class068892, class068893);
            if (!var14.isPresent() || !((d2 = class068892.M((class06889)var14.get())) < d)) continue;
            class070493 = class070494;
            d = d2;
            var9 = var14;
        }
        if (class070493 == null) {
            return null;
        }
        return new class06145(class070493, (class06889)var9.get());
    }

    public static float N(class07049 class070492) {
        return Math.max(0.0f, Math.min(0.3f, (float)(class070492.field_6012 - 2) / 20.0f));
    }

    private static List N(class07299 class072992, class07049 class070492, class00734 class007342, Predicate predicate, Operation operation) {
        class01129 var5;
        if (class070492 != null && ProjectileEntityClassGroup.OPTIMIZED_PROJECTILES.contains(class070492) && (var5 = WorldHelper.getEntityCacheOrNull((class07299)class072992)) != null) {
            return WorldHelper.getEntitiesOfEntityGroupPlusDragonPieces((class07299)class072992, (class01129)var5, (class07049)class070492, (EntityClassGroup)ProjectileEntityClassGroup.CAN_MAYBE_BE_HIT_BY_OPTIMIZED_PROJECTILE, (class00734)class007342, (Predicate)predicate);
        }
        return (List)operation.call(new Object[]{class072992, class070492, class007342, predicate});
    }

    public static class08007 N(class07438 class074382, class06584 class065842, float f, @Nullable class06584 class065843) {
        class08007 class080072 = ((class06927)(class065842.B() instanceof class06927 ? class065842.B() : class06570.sD)).N(class074382.method_73183(), class065842, class074382, class065843);
        class080072.N(f);
        return class080072;
    }

    public static class07050 N(class07438 class074382, class06581 class065812) {
        return class074382.method_6047().N(class065812) ? class07050.field_5808 : class07050.field_5810;
    }

    public static class07089 N(class07049 class070492, Predicate<class07049> predicate, double d) {
        class06889 class068892 = class070492.method_5828(0.0f).L(d);
        class07299 class072992 = class070492.method_73183();
        return class08038.N(class070492.method_33571(), class070492, predicate, class068892, class072992, 0.0f, class05849.field_17558);
    }

    public static class07089 N(class07049 class070492, Predicate<class07049> predicate, class05849 class058492) {
        class06889 class068892 = class070492.method_18798();
        class07299 class072992 = class070492.method_73183();
        return class08038.N(class070492.method_73189(), class070492, predicate, class068892, class072992, class08038.N(class070492), class058492);
    }

    public static Either<class06183, Collection<class06145>> N(class07049 class070492, class06543 class065432, Predicate<class07049> predicate, class05849 class058492) {
        class06889 class068892 = class070492.method_75117();
        class06889 class068893 = class070492.method_33571();
        class06889 class068894 = class068893.i(class068892.L((double)class065432.N(class070492)));
        double d = class070492.method_60478().y(class068892);
        class06889 class068895 = class068893.i(class068892.L((double)class065432.y(class070492) + Math.max(0.0, d)));
        return class08038.N(class070492, class068893, class068894, predicate, class068895, class065432.i(), class058492);
    }

    public static class07089 N(class07049 class070492, Predicate<class07049> predicate) {
        class06889 class068892 = class070492.method_18798();
        class07299 class072992 = class070492.method_73183();
        return class08038.N(class070492.method_73189(), class070492, predicate, class068892, class072992, class08038.N(class070492), class05849.field_17558);
    }

    public static @Nullable class06145 N(class07299 class072992, class08005 class080052, class06889 class068892, class06889 class068893, class00734 class007342, Predicate<class07049> predicate) {
        return class08038.N(class072992, (class07049)class080052, class068892, class068893, class007342, predicate, class08038.N(class080052));
    }

    public static @Nullable class06145 N(class07049 class070492, class06889 class068892, class06889 class068893, class00734 class007342, Predicate<class07049> predicate, double d) {
        class07299 class072992 = class070492.method_73183();
        double d2 = d;
        class07049 class070493 = null;
        class06889 class068894 = null;
        for (class07049 class070494 : class072992.method_8333(class070492, class007342, predicate)) {
            class06889 class068895;
            double d3;
            class00734 class007343 = class070494.method_5829().M((double)class070494.method_5871());
            Optional var15 = class007343.y(class068892, class068893);
            if (class007343.u(class068892)) {
                if (!(d2 >= 0.0)) continue;
                class070493 = class070494;
                class068894 = var15.orElse(class068892);
                d2 = 0.0;
                continue;
            }
            if (!var15.isPresent() || !((d3 = class068892.M(class068895 = (class06889)var15.get())) < d2) && d2 != 0.0) continue;
            if (class070494.method_5668() == class070492.method_5668()) {
                if (d2 != 0.0) continue;
                class070493 = class070494;
                class068894 = class068895;
                continue;
            }
            class070493 = class070494;
            class068894 = class068895;
            d2 = d3;
        }
        if (class070493 == null) {
            return null;
        }
        return new class06145(class070493, class068894);
    }

    private static Either<class06183, Collection<class06145>> N(class07049 class070492, class06889 class068892, class06889 class068893, Predicate<class07049> predicate, class06889 class068894, float f, class05849 class058492) {
        class07299 class072992 = class070492.method_73183();
        class06183 class061832 = class072992.y(new class05862(class068892, class068894, class058492, class05835.field_1348, class070492));
        if (class061832.N() != class07113.field_1333 && class068892.M(class068894 = class061832.y()) < class068892.M(class068893)) {
            return Either.left((Object)class061832);
        }
        class00734 class007342 = class00734.N((class06889)class068893, (double)f, (double)f, (double)f).y(class068894.u(class068893)).M(1.0);
        Collection<class06145> var10 = class08038.N(class072992, class070492, class068893, class068894, class007342, predicate, f, class058492, true);
        if (!var10.isEmpty()) {
            return Either.right(var10);
        }
        return Either.left((Object)class061832);
    }

    public static class07089 N(class06889 class068892, class07049 class070492, Predicate<class07049> predicate, class06889 class068893, class07299 class072992, float f, class05849 class058492) {
        class06145 class061452;
        class06889 class068894 = class068892.i(class068893);
        class06183 class061832 = class072992.y(new class05862(class068892, class068894, class058492, class05835.field_1348, class070492));
        if (class061832.N() != class07113.field_1333) {
            class068894 = class061832.y();
        }
        if ((class061452 = class08038.N(class072992, class070492, class068892, class068894, class070492.method_5829().y(class068893).M(1.0), predicate, f)) != null) {
            class061832 = class061452;
        }
        return class061832;
    }
}

