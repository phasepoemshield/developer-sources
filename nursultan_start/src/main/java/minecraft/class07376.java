/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00587
 *  minecraft.class00891
 *  minecraft.class01281
 *  minecraft.class02142
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03530
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07334
 *  minecraft.class07587
 *  net.irisshaders.iris.mixin.DimensionTypeAccessor
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import minecraft.class00587;
import minecraft.class00891;
import minecraft.class01281;
import minecraft.class02142;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03530;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07334;
import minecraft.class07360;
import minecraft.class07370;
import minecraft.class07587;
import net.irisshaders.iris.mixin.DimensionTypeAccessor;

public final class class07376
extends Record
implements DimensionTypeAccessor {
    private final boolean hasFixedTime;
    private final boolean hasSkyLight;
    private final boolean hasCeiling;
    private final double coordinateScale;
    private final int minY;
    private final int height;
    private final int logicalHeight;
    private final class03530<class00891> infiniburn;
    private final float ambientLight;
    private final class07370 monsterSettings;
    private final class07360 skybox;
    private final class07334 cardinalLightType;
    private final class00587 attributes;
    private final class03543<class07587> timelines;
    public static final int N = class07209.field_10975;
    public static final int y = 16;
    public static final int L = (1 << N) - 32;
    public static final int u = (L >> 1) - 1;
    public static final int i = u - L + 1;
    public static final int R = u << 4;
    public static final int M = i << 4;
    public static final Codec<class07376> B = class07376.N((Codec<class00587>)class00587.y);
    public static final Codec<class07376> Z = class07376.N((Codec<class00587>)class00587.L);
    public static final class02362<class04247, class03556<class07376>> z = class02389.y((class05946)class04227.yu);
    public static final float[] U = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    public static final Codec<class03556<class07376>> E = class01281.N((class05946)class04227.yu, B);

    public boolean L() {
        return this.skybox == class07360.field_64387;
    }

    public double M() {
        return this.coordinateScale;
    }

    public class07334 P() {
        return this.cardinalLightType;
    }

    public class03543<class07587> T() {
        return this.timelines;
    }

    public class07376(boolean bl, boolean bl2, boolean bl3, double d, int n, int n2, int n3, class03530<class00891> class035302, float f, class07370 class073702, class07360 class073602, class07334 class073342, class00587 class005872, class03543<class07587> class035432) {
        if (n2 < 16) {
            throw new IllegalStateException("height has to be at least 16");
        }
        if (n + n2 > u + 1) {
            throw new IllegalStateException("min_y + height cannot be higher than: " + (u + 1));
        }
        if (n3 > n2) {
            throw new IllegalStateException("logical_height cannot be higher than height");
        }
        if (n2 % 16 != 0) {
            throw new IllegalStateException("height has to be multiple of 16");
        }
        if (n % 16 != 0) {
            throw new IllegalStateException("min_y has to be a multiple of 16");
        }
        this.hasFixedTime = bl;
        this.hasSkyLight = bl2;
        this.hasCeiling = bl3;
        this.coordinateScale = d;
        this.minY = n;
        this.height = n2;
        this.logicalHeight = n3;
        this.infiniburn = class035302;
        this.ambientLight = f;
        this.monsterSettings = class073702;
        this.skybox = class073602;
        this.cardinalLightType = class073342;
        this.attributes = class005872;
        this.timelines = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07376.class, "hasFixedTime;hasSkyLight;hasCeiling;coordinateScale;minY;height;logicalHeight;infiniburn;ambientLight;monsterSettings;skybox;cardinalLightType;attributes;timelines", "hasFixedTime", "hasSkyLight", "hasCeiling", "coordinateScale", "minY", "height", "logicalHeight", "infiniburn", "ambientLight", "monsterSettings", "skybox", "cardinalLightType", "attributes", "timelines"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07376.class, "hasFixedTime;hasSkyLight;hasCeiling;coordinateScale;minY;height;logicalHeight;infiniburn;ambientLight;monsterSettings;skybox;cardinalLightType;attributes;timelines", "hasFixedTime", "hasSkyLight", "hasCeiling", "coordinateScale", "minY", "height", "logicalHeight", "infiniburn", "ambientLight", "monsterSettings", "skybox", "cardinalLightType", "attributes", "timelines"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07376.class, "hasFixedTime;hasSkyLight;hasCeiling;coordinateScale;minY;height;logicalHeight;infiniburn;ambientLight;monsterSettings;skybox;cardinalLightType;attributes;timelines", "hasFixedTime", "hasSkyLight", "hasCeiling", "coordinateScale", "minY", "height", "logicalHeight", "infiniburn", "ambientLight", "monsterSettings", "skybox", "cardinalLightType", "attributes", "timelines"}, this);
    }

    public int B() {
        return this.minY;
    }

    public int Z() {
        return this.height;
    }

    public boolean i() {
        return this.hasSkyLight;
    }

    public class00587 s() {
        return this.attributes;
    }

    public class07360 m() {
        return this.skybox;
    }

    public class03530<class00891> U() {
        return this.infiniburn;
    }

    public int z() {
        return this.logicalHeight;
    }

    public boolean u() {
        return this.hasFixedTime;
    }

    public int y() {
        return this.monsterSettings.y();
    }

    public float E() {
        return this.ambientLight;
    }

    public static double N(class07376 class073762, class07376 class073763) {
        double d = class073762.M();
        double d2 = class073763.M();
        return d / d2;
    }

    private static Codec<class07376> N(Codec<class00587> codec) {
        return class06338.i((Codec)RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("has_fixed_time", (Object)false).forGetter(class07376::u), (App)Codec.BOOL.fieldOf("has_skylight").forGetter(class07376::i), (App)Codec.BOOL.fieldOf("has_ceiling").forGetter(class07376::R), (App)Codec.doubleRange((double)1.0E-5f, (double)3.0E7).fieldOf("coordinate_scale").forGetter(class07376::M), (App)Codec.intRange((int)i, (int)u).fieldOf("min_y").forGetter(class07376::B), (App)Codec.intRange((int)16, (int)L).fieldOf("height").forGetter(class07376::Z), (App)Codec.intRange((int)0, (int)L).fieldOf("logical_height").forGetter(class07376::z), (App)class03530.y((class05946)class04227.Z).fieldOf("infiniburn").forGetter(class07376::U), (App)Codec.FLOAT.fieldOf("ambient_light").forGetter(class07376::E), (App)class07370.N.forGetter(class07376::W), (App)class07360.field_64388.optionalFieldOf("skybox", (Object)class07360.field_64386).forGetter(class07376::m), (App)class07334.field_64382.optionalFieldOf("cardinal_light", (Object)class07334.field_64380).forGetter(class07376::P), (App)codec.optionalFieldOf("attributes", (Object)class00587.N).forGetter(class07376::s), (App)class03541.N((class05946)class04227.yG).optionalFieldOf("timelines", (Object)class03543.R()).forGetter(class07376::T)).apply((Applicative)instance, class07376::new)));
    }

    public static Path N(class05946<class07299> class059462, Path path) {
        if (class059462 == class07299.field_25179) {
            return path;
        }
        if (class059462 == class07299.field_25181) {
            return path.resolve("DIM1");
        }
        if (class059462 == class07299.field_25180) {
            return path.resolve("DIM-1");
        }
        return path.resolve("dimensions").resolve(class059462.N().y()).resolve(class059462.N().N());
    }

    public class02142 N() {
        return this.monsterSettings.N();
    }

    public /* synthetic */ float getAmbientLight() {
        return this.ambientLight;
    }

    public class07370 W() {
        return this.monsterSettings;
    }

    public boolean R() {
        return this.hasCeiling;
    }
}

