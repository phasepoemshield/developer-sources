/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11650
 *  com.google.common.base.Suppliers
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class02022
 *  minecraft.class02601
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class05885
 *  minecraft.class05911
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06918
 *  minecraft.class07311
 *  minecraft.class08517
 *  minecraft.class08626
 *  minecraft.class08743
 *  minecraft.class08910
 *  minecraft.class08915
 *  minecraft.class08931
 *  minecraft.class08943
 *  minecraft.class08961
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.Mesh
 *  net.fabricmc.fabric.impl.renderer.BasicItemModelExtension
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11650;
import com.google.common.base.Suppliers;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class02022;
import minecraft.class02601;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class05885;
import minecraft.class05911;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06918;
import minecraft.class07311;
import minecraft.class08517;
import minecraft.class08626;
import minecraft.class08743;
import minecraft.class08843;
import minecraft.class08898;
import minecraft.class08910;
import minecraft.class08915;
import minecraft.class08931;
import minecraft.class08943;
import minecraft.class08961;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.impl.renderer.BasicItemModelExtension;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08808
implements class08910,
BasicItemModelExtension {
    private static final Function<class06584, class07311> N = class065842 -> class05911.z();
    private static final Function<class06584, class07311> y = class065842 -> {
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918 && (class065812 = class05885.N((class00500)((class06918)class065812).L().W())) != class08743.field_60926) {
            return class05911.Z();
        }
        return class05911.U();
    };
    private final List<class08843> L;
    private final List<class02022> u;
    private final Supplier<Vector3fc[]> i;
    private final class08517 R;
    private boolean M;
    private final Function<class06584, class07311> B;
    private @Nullable Mesh Z;

    class08808(List<class08843> list, List<class02022> list2, class08517 class085172, Function<class06584, class07311> function) {
        this.L = list;
        this.u = list2;
        this.R = class085172;
        this.B = function;
        this.i = Suppliers.memoize(() -> class08808.N(this.u));
        boolean bl = false;
        Iterator<class02022> iterator = list2.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().E().method_45851().method_73020()) continue;
            bl = true;
            break;
        }
        this.M = bl;
    }

    static Function<class06584, class07311> y(List<class02022> list) {
        Iterator<class02022> iterator = list.iterator();
        if (!iterator.hasNext()) {
            return N;
        }
        class01894 class018942 = iterator.next().E().method_45852();
        while (iterator.hasNext()) {
            class01894 class018943 = iterator.next().E().method_45852();
            if (class018943.equals((Object)class018942)) continue;
            throw new IllegalStateException("Multiple atlases used in model, expected " + String.valueOf(class018942) + ", but also got " + String.valueOf(class018943));
        }
        if (class018942.equals((Object)class08626.y)) {
            return N;
        }
        if (class018942.equals((Object)class08626.N)) {
            return y;
        }
        throw new IllegalArgumentException("Atlas " + String.valueOf(class018942) + " can't be usef for item models");
    }

    public static Vector3fc[] N(List<class02022> list) {
        HashSet<Vector3fc> hashSet = new HashSet<Vector3fc>();
        for (class02022 class020222 : list) {
            for (int i = 0; i < 4; ++i) {
                hashSet.add(class020222.N(i));
            }
        }
        return (Vector3fc[])hashSet.toArray(Vector3fc[]::new);
    }

    private void N(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n, CallbackInfo callbackInfo, class08931 class089312) {
        if (this.Z != null) {
            class06581 class065812 = class065842.B();
            class08743 class087432 = class065812 instanceof class06918 ? class05885.N((class00500)((class06918)class065812).L().W()) : class08743.field_60926;
            class089312.setRenderTypeGetter((quadAtlas, class087433) -> switch (class11650.N[quadAtlas.ordinal()]) {
                default -> throw new MatchException(null, null);
                case 1 -> {
                    if (class087433 == null) {
                        class087433 = class087432;
                    }
                    if (class087433 != class08743.field_60926) {
                        yield class05911.Z();
                    }
                    yield class05911.U();
                }
                case 2 -> class05911.z();
            });
            this.Z.outputTo(class089312.emitter());
        }
    }

    private static boolean N(class06584 class065842) {
        return class065842.N(class01226.yX) || class065842.N(class06570.vN);
    }

    public void fabric_setMesh(Mesh mesh, class02601 class026012) {
        this.Z = mesh;
        if (!this.M) {
            mesh.forEach(quadView -> {
                if (this.M) {
                    return;
                }
                class08915 class089152 = quadView.glint();
                if (class089152 != null && class089152 != class08915.field_55341 || class026012.spriteFinder(quadView.atlas().getTextureId()).find(quadView).method_45851().method_73020()) {
                    this.M = true;
                }
            });
        }
    }

    public void method_65584(class08898 class088982, class06584 class065842, class08943 class089432, class03662 class036622, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class088982.N(this);
        class08931 class089312 = class088982.N();
        if (class065842.Q()) {
            class08915 class089152 = class08808.N(class065842) ? class08915.field_55343 : class08915.field_55342;
            class089312.N(class089152);
            class088982.L();
            class088982.N(class089152);
        }
        int n2 = this.L.size();
        int[] nArray = class089312.N(n2);
        for (int i = 0; i < n2; ++i) {
            int n3;
            nArray[i] = n3 = this.L.get(i).N(class065842, class034482, class089612 == null ? null : class089612.method_72393());
            class088982.N((Object)n3);
        }
        class089312.N(this.i);
        class089312.N(this.B.apply(class065842));
        this.R.N(class089312, class036622);
        class089312.y().addAll(this.u);
        if (this.M) {
            class088982.L();
        }
        this.N(class088982, class065842, class089432, class036622, class034482, class089612, n, null, class089312);
    }
}

