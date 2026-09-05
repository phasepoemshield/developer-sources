/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  minecraft.class00283
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class00304
 *  minecraft.class00307
 *  minecraft.class00324
 *  minecraft.class00330
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03521
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class07310
 *  minecraft.class08022
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer
 *  net.fabricmc.fabric.api.recipe.v1.ingredient.FabricIngredient
 *  net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl
 *  net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPacketCodec
 *  net.fabricmc.fabric.impl.recipe.ingredient.OptionalCustomIngredientPacketCodec
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00283;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class00304;
import minecraft.class00307;
import minecraft.class00324;
import minecraft.class00330;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03521;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import minecraft.class08022;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.api.recipe.v1.ingredient.FabricIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPacketCodec;
import net.fabricmc.fabric.impl.recipe.ingredient.OptionalCustomIngredientPacketCodec;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06510
implements class08022<class03556<class06581>>,
Predicate<class06584>,
FabricIngredient {
    public static final class02362<class04247, class06510> field_48355 = class02389.L((class05946)class04227.F).N_10(class06510::new, class065102 -> class065102.field_9019);
    public static final class02362<class04247, Optional<class06510>> field_52595 = class02389.L((class05946)class04227.F).N_10(class035432 -> class035432.y() == 0 ? Optional.empty() : Optional.of(new class06510((class03543<class06581>)class035432)), optional -> optional.map(class065102 -> {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class06510.m_handler$zlj000$fabric_recipe_api_v1$onGetEntries_62(class065102, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class03543)callbackInfoReturnable.getReturnValue();
        }
        return class065102.field_9019;
    }).orElse((class03543)class03543.N((class03556[])new class03556[0])));
    public static final Codec<class03543<class06581>> field_52596 = class03521.N((class05946)class04227.F, class06581.u, (boolean)false);
    public static Codec<class06510> field_46095 = class06338.L(field_52596).xmap(class06510::new, class065102 -> class065102.field_9019);
    private final class03543<class06581> field_9019;

    public class06510(class03543<class06581> class035432) {
        class035432.u().ifRight(list -> {
            if (list.isEmpty()) {
                throw new UnsupportedOperationException("Ingredients can't be empty");
            }
            if (list.contains(class06570.N.i())) {
                throw new UnsupportedOperationException("Ingredient can't contain air");
            }
        });
        this.field_9019 = class035432;
    }

    public boolean equals(Object object) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.m_handler$zlj000$fabric_recipe_api_v1$onHeadEquals_63(object, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (object instanceof class06510) {
            class06510 class065102 = (class06510)object;
            return Objects.equals(this.field_9019, class065102.field_9019);
        }
        return false;
    }

    public int hashCode() {
        return this.field_9019.hashCode();
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.method_8093((class06584)object);
    }

    private static class02362 m_modifyExpressionValue$zlj000$fabric_recipe_api_v1$useCustomIngredientPacketCodec_58(class02362 class023622) {
        return new CustomIngredientPacketCodec(class023622);
    }

    public class00299 method_64673() {
        return (class00299)this.field_9019.u().map(class00304::new, list -> new class00283(list.stream().map(class06510::method_64981).toList()));
    }

    public static boolean method_61676(Optional<class06510> optional, class06584 class065842) {
        return optional.map(class065102 -> class065102.method_8093(class065842)).orElseGet(class065842::R);
    }

    @Deprecated
    public Stream<class03556<class06581>> method_8105() {
        return this.field_9019.N();
    }

    public boolean method_8093(class06584 class065842) {
        return class065842.N(this.field_9019);
    }

    public boolean method_65798(class03556<class06581> class035562) {
        return this.field_9019.N(class035562);
    }

    public boolean method_65799() {
        return this.field_9019.y() == 0;
    }

    public static class06510 method_8106(class03543<class06581> class035432) {
        return new class06510(class035432);
    }

    public static class00299 method_64980(Optional<class06510> optional) {
        return optional.map(class06510::method_64673).orElse((class00299)class00307.L);
    }

    public static class06510 method_8091(class07310 ... class07310Array) {
        return class06510.method_26964(Arrays.stream(class07310Array));
    }

    private static /* synthetic */ class03543 method_61680(class06510 class065102) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class06510.m_handler$zlj000$fabric_recipe_api_v1$onGetEntries_62(class065102, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class03543)callbackInfoReturnable.getReturnValue();
        }
        return class065102.field_9019;
    }

    public static class00299 method_64981(class03556<class06581> class035562) {
        class00330 class003302 = new class00330(class035562);
        class06584 class065842 = ((class06581)class035562.N()).Z();
        if (!class065842.R()) {
            class00302 class003022 = new class00302(class065842);
            return new class00324((class00299)class003302, (class00299)class003022);
        }
        return class003302;
    }

    private static /* synthetic */ class03543 method_61673(class06510 class065102) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class06510.m_handler$zlj000$fabric_recipe_api_v1$onGetEntries_62(class065102, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class03543)callbackInfoReturnable.getReturnValue();
        }
        return class065102.field_9019;
    }

    public static class06510 method_26964(Stream<? extends class07310> stream) {
        return new class06510((class03543<class06581>)class03543.N((List)stream.map(class073102 -> class073102.B().i()).toList()));
    }

    public /* synthetic */ boolean acceptsItem(Object object) {
        return this.method_65798((class03556<class06581>)((class03556)object));
    }

    public static class06510 method_8101(class07310 class073102) {
        return new class06510((class03543<class06581>)class03543.N((class03556[])new class03556[]{class073102.B().i()}));
    }

    private static void m_handler$zlj000$fabric_recipe_api_v1$onGetEntries_62(class06510 class065102, CallbackInfoReturnable callbackInfoReturnable) {
        if (class065102 instanceof CustomIngredientImpl) {
            CustomIngredientImpl customIngredientImpl = (CustomIngredientImpl)class065102;
            callbackInfoReturnable.setReturnValue((Object)class03543.N((List)customIngredientImpl.getCustomMatchingItems()));
        }
    }

    private void m_handler$zlj000$fabric_recipe_api_v1$onHeadEquals_63(Object object, CallbackInfoReturnable callbackInfoReturnable) {
        if (object instanceof CustomIngredientImpl) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private static void m_handler$zlj000$fabric_recipe_api_v1$injectCodec_64(CallbackInfo callbackInfo) {
        field_46095 = Codec.either((Codec)CustomIngredientImpl.CODEC.dispatch("fabric:type", CustomIngredient::getSerializer, CustomIngredientSerializer::getCodec), field_46095).xmap(either -> (class06510)either.map(CustomIngredient::toVanilla, class065102 -> class065102), class065102 -> {
            CustomIngredient customIngredient = class065102.getCustomIngredient();
            return customIngredient == null ? Either.right((Object)class065102) : Either.left((Object)customIngredient);
        });
    }

    private static class02362 m_modifyExpressionValue$zlj000$fabric_recipe_api_v1$useOptionalCustomIngredientPacketCodec_65(class02362 class023622) {
        return new OptionalCustomIngredientPacketCodec(class023622);
    }
}

