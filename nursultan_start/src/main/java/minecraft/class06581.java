/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class02197
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class02995
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04830
 *  minecraft.class04995
 *  minecraft.class05220
 *  minecraft.class05442
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class05946
 *  minecraft.class06183
 *  minecraft.class06497
 *  minecraft.class06501
 *  minecraft.class06889
 *  minecraft.class06937
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class08036
 *  minecraft.class08174
 *  minecraft.class08209
 *  minecraft.class08562
 *  minecraft.class08725
 *  net.fabricmc.fabric.api.item.v1.CustomDamageHandler
 *  net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider
 *  net.fabricmc.fabric.api.item.v1.FabricItem
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.impl.item.FabricItemInternals
 *  net.fabricmc.fabric.impl.item.ItemExtensions
 *  net.fabricmc.fabric.impl.transfer.item.ItemVariantCache
 *  net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl
 *  net.fabricmc.fabric.mixin.item.ItemAccessor
 *  net.irisshaders.iris.api.v0.item.IrisItemLightProvider
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class02197;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class02995;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04830;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class05442;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05946;
import minecraft.class06183;
import minecraft.class06497;
import minecraft.class06501;
import minecraft.class06509;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class06889;
import minecraft.class06937;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class08036;
import minecraft.class08174;
import minecraft.class08209;
import minecraft.class08562;
import minecraft.class08725;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.impl.item.FabricItemInternals;
import net.fabricmc.fabric.impl.item.ItemExtensions;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantCache;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl;
import net.fabricmc.fabric.mixin.item.ItemAccessor;
import net.irisshaders.iris.api.v0.item.IrisItemLightProvider;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06581
implements class02995,
class07310,
FabricItem,
ItemExtensions,
ItemVariantCache,
ItemAccessor,
IrisItemLightProvider {
    public static final Codec<class03556<class06581>> u = class04206.B.b().validate(class035562 -> class035562.N(class06570.N.i()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success((Object)class035562));
    public static final class02362<class04247, class03556<class06581>> i = class02389.y((class05946)class04227.F);
    private static final Logger N = LogUtils.getLogger();
    public static final Map<class00891, class06581> R = Maps.newHashMap();
    public static final class01894 M = class01894.y((String)"base_attack_damage");
    public static final class01894 B = class01894.y((String)"base_attack_speed");
    public static final int Z = 64;
    public static final int z = 99;
    public static final int U = 13;
    protected static final int E = 72000;
    private final class03529<class06581> y;
    private class02695 L;
    private final @Nullable class06581 m;
    protected final String W;
    private final class03767 P;
    private @Nullable EquipmentSlotProvider s;
    private @Nullable CustomDamageHandler T;
    private final ItemVariant b = new ItemVariantImpl(this, class02678.N);

    public boolean L(class06584 class065842) {
        return class065842.I();
    }

    public void L(class06584 class065842, class08036 class080362) {
        this.N(class065842, class080362.method_73183());
    }

    public boolean M(class06584 class065842) {
        return false;
    }

    public int M() {
        return (Integer)this.L.a_(class02484.L, (Object)1);
    }

    public class06581(class06573 class065732) {
        String string;
        this.y = class04206.B.R((Object)this);
        this.W = class065732.u();
        this.L = class065732.N((class00392)class00392.L((String)this.W), class065732.i());
        this.m = class065732.N;
        this.P = class065732.y;
        if (class07529.ND && !(string = this.getClass().getSimpleName()).endsWith("Item")) {
            N.error("Item classes should end with Item and {} doesn't.", (Object)string);
        }
        this.N(class065732, null);
    }

    public String toString() {
        return class04206.B.i((Object)this).M();
    }

    public class06581 B() {
        return this;
    }

    public boolean B(class06584 class065842) {
        return class065842.m();
    }

    public int Z(class06584 class065842) {
        return class04995.N((int)Math.round(13.0f - (float)class065842.P() * 13.0f / (float)class065842.s()), (int)0, (int)13);
    }

    public final class06584 Z() {
        return this.m == null ? class06584.E : new class06584(this.m);
    }

    @Deprecated
    public class03529<class06581> i() {
        return this.y;
    }

    public final class00392 U() {
        return (class00392)this.L.a_(class02484.U, (Object)class05220.N);
    }

    public Optional<class04830> U(class06584 class065842) {
        return Optional.empty();
    }

    public int z(class06584 class065842) {
        int n = class065842.s();
        return class04995.M((float)(Math.max(0.0f, ((float)n - (float)class065842.P()) / (float)n) / 3.0f), (float)1.0f, (float)1.0f);
    }

    public final String z() {
        return this.W;
    }

    public boolean u() {
        return true;
    }

    public void y(class06584 class065842, class07438 class074382, class07438 class074383) {
    }

    public static class06581 y(int n) {
        return (class06581)class04206.B.N(n);
    }

    public boolean y(class06584 class065842, class00500 class005002) {
        class02197 class021972 = (class02197)class065842.method_58694(class02484.O);
        return class021972 != null && class021972.y(class005002);
    }

    public class06509 y(class06584 class065842) {
        class08209 class082092 = (class08209)class065842.method_58694(class02484.w);
        if (class082092 != null) {
            return class082092.u();
        }
        if (class065842.L(class02484.H)) {
            return class06509.field_8949;
        }
        if (class065842.L(class02484.X)) {
            return class06509.field_8951;
        }
        return class06509.field_8952;
    }

    public class06584 E() {
        return new class06584(this);
    }

    public int N(class06584 class065842, class07438 class074382) {
        class08209 class082092 = (class08209)class065842.method_58694(class02484.w);
        if (class082092 != null) {
            return class082092.N();
        }
        if (class065842.L(class02484.H) || class065842.L(class02484.X)) {
            return 72000;
        }
        return 0;
    }

    public boolean N(class06584 class065842, class07299 class072992, class07438 class074382, int n) {
        return false;
    }

    public void N(class06584 class065842, class07299 class072992) {
    }

    protected static class06183 N(class07299 class072992, class08036 class080362, class05835 class058352) {
        class06889 class068892 = class080362.method_33571();
        class06889 class068893 = class068892.i(class080362.method_5631(class080362.method_36455(), class080362.method_36454()).L(class080362.method_55754()));
        return class072992.N(new class05862(class068892, class068893, class05849.field_17559, class058352, (class07049)class080362));
    }

    private void N(class06573 class065732, CallbackInfo callbackInfo) {
        FabricItemInternals.onBuild((class06573)class065732, (class06581)this);
    }

    public class00392 N(class06584 class065842) {
        return (class00392)class065842.y().a_(class02484.U, (Object)class05220.N);
    }

    public boolean N(class06584 class065842, @Nullable class08036 class080362) {
        return false;
    }

    @Deprecated
    public void N(class06584 class065842, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972) {
    }

    public class07082 N(class06501 class065012) {
        return class07082.i;
    }

    public float N(class06584 class065842, class00500 class005002) {
        class02197 class021972 = (class02197)class065842.method_58694(class02484.O);
        return class021972 != null ? class021972.N(class005002) : 1.0f;
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        class08209 class082092 = (class08209)class065842.method_58694(class02484.w);
        if (class082092 != null) {
            return class082092.N((class07438)class080362, class065842, class070502);
        }
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 != null && class087252.B()) {
            return class087252.N(class065842, class080362);
        }
        if (class065842.L(class02484.H)) {
            class080362.method_6019(class070502);
            return class07082.L;
        }
        class08174 class081742 = (class08174)class065842.method_58694(class02484.X);
        if (class081742 != null) {
            class080362.method_6019(class070502);
            class081742.y((class07049)class080362);
            return class07082.L;
        }
        return class07082.i;
    }

    public class06584 N(class06584 class065842, class07299 class072992, class07438 class074382) {
        class08209 class082092 = (class08209)class065842.method_58694(class02484.w);
        if (class082092 != null) {
            return class082092.N(class072992, class074382, class065842);
        }
        return class065842;
    }

    public boolean N(class06584 class065842, class06937 class069372, class05442 class054422, class08036 class080362) {
        return false;
    }

    @Deprecated
    public static class06581 N(class00891 class008912) {
        return R.getOrDefault(class008912, class06570.N);
    }

    public void N(class07299 class072992, class07438 class074382, class06584 class065842, int n) {
    }

    public void N(class00717 class007172) {
    }

    public boolean N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class07438 class074382) {
        class02197 class021972 = (class02197)class065842.method_58694(class02484.O);
        if (class021972 != null && !class021972.u()) {
            return !(class074382 instanceof class08036) || !((class08036)class074382).method_31549().u;
        }
        return true;
    }

    public void N(class06584 class065842, class04782 class047822, class07049 class070492, @Nullable class07085 class070852) {
    }

    public boolean N(class06584 class065842, class07299 class072992, class00500 class005002, class07209 class072092, class07438 class074382) {
        class02197 class021972 = (class02197)class065842.method_58694(class02484.O);
        if (class021972 == null) {
            return false;
        }
        if (!class072992.method_8608() && class005002.i((class07290)class072992, class072092) != 0.0f && class021972.L() > 0) {
            class065842.N(class021972.L(), class074382, class07085.field_6173);
        }
        return true;
    }

    public class07082 N(class06584 class065842, class08036 class080362, class07438 class074382, class07050 class070502) {
        return class07082.i;
    }

    public static int N(class06581 class065812) {
        return class065812 == null ? 0 : class04206.B.N((Object)class065812);
    }

    public boolean N(class06584 class065842, class06584 class065843, class06937 class069372, class05442 class054422, class08036 class080362, class04803 class048032) {
        return false;
    }

    public float N(class07049 class070492, float f, class07072 class070722) {
        return 0.0f;
    }

    @Deprecated
    public @Nullable class07072 N(class07438 class074382) {
        return null;
    }

    public void N(class06584 class065842, class07438 class074382, class07438 class074383) {
    }

    public class02695 R() {
        return this.L;
    }

    public class03767 method_45322() {
        return this.P;
    }

    public /* synthetic */ void setComponents(class02695 class026952) {
        this.L = class026952;
    }

    public @Nullable CustomDamageHandler fabric_getCustomDamageHandler() {
        return this.T;
    }

    public @Nullable EquipmentSlotProvider fabric_getEquipmentSlotProvider() {
        return this.s;
    }

    public ItemVariant fabric_getCachedItemVariant() {
        return this.b;
    }

    public void fabric_setCustomDamageHandler(@Nullable CustomDamageHandler customDamageHandler) {
        this.T = customDamageHandler;
    }

    public void fabric_setEquipmentSlotProvider(@Nullable EquipmentSlotProvider equipmentSlotProvider) {
        this.s = equipmentSlotProvider;
    }
}

