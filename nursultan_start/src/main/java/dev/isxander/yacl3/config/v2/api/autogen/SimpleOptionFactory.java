/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.CustomDescription;
import dev.isxander.yacl3.config.v2.api.autogen.CustomImage;
import dev.isxander.yacl3.config.v2.api.autogen.CustomImage$CustomImageFactory;
import dev.isxander.yacl3.config.v2.api.autogen.CustomName;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.OptionFactory;
import dev.isxander.yacl3.config.v2.impl.FieldBackedBinding;
import dev.isxander.yacl3.config.v2.impl.autogen.AutoGenUtils;
import dev.isxander.yacl3.config.v2.impl.autogen.EmptyCustomImageFactory;
import dev.isxander.yacl3.config.v2.impl.autogen.YACLAutoGenException;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.lang.annotation.Annotation;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class07018;

public abstract class SimpleOptionFactory<A extends Annotation, T>
implements OptionFactory<A, T> {
    protected void listener(A a, ConfigField<T> configField, OptionAccess optionAccess, Option<T> option, T t) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected OptionDescription.Builder description(T t, A a, ConfigField<T> configField, OptionAccess optionAccess) {
        OptionDescription.Builder builder = OptionDescription.createBuilder();
        Object object = this.getTranslationKey(configField, "desc");
        if (class07018.y().N((String)object)) {
            builder.text(new class00392[]{class00392.L((String)object)});
        } else {
            object = (String)object + ".";
            int n = 1;
            while (class07018.y().N((String)object + n)) {
                builder.text(new class00392[]{class00392.L((String)((String)object + n))});
                ++n;
            }
        }
        configField.access().getAnnotation(CustomDescription.class).ifPresent(customDescription -> {
            for (String string : customDescription.value()) {
                builder.text(new class00392[]{class00392.L((String)string)});
            }
        });
        Optional<CustomImage> optional = configField.access().getAnnotation(CustomImage.class);
        if (optional.isPresent()) {
            String string;
            CustomImage customImage = optional.get();
            if (!customImage.factory().equals(EmptyCustomImageFactory.class)) {
                CustomImage$CustomImageFactory<?> customImage$CustomImageFactory;
                try {
                    customImage$CustomImageFactory = AutoGenUtils.constructNoArgsClass(customImage.factory(), () -> "'%s': The factory class on @OverrideImage has no no-args constructor.".formatted(new Object[]{configField.access().name()}), () -> "'%s': Failed to instantiate factory class %s.".formatted(new Object[]{configField.access().name(), customImage.factory().getName()}));
                }
                catch (ClassCastException classCastException) {
                    throw new YACLAutoGenException("'%s': The factory class on @OverrideImage is of incorrect type. Expected %s, got %s.".formatted(new Object[]{configField.access().name(), configField.access().type().getTypeName(), customImage.factory().getTypeParameters()[0].getName()}));
                }
                builder.customImage((CompletableFuture)customImage$CustomImageFactory.createImage(t, configField, optionAccess).thenApply(Optional::of));
                return builder;
            }
            if (customImage.value().isEmpty()) throw new YACLAutoGenException("'%s': @OverrideImage has no value or factory class.".formatted(new Object[]{configField.access().name()}));
            String string2 = customImage.value();
            class01894 class018942 = YACLPlatform.rl((String)configField.parent().id().y(), (String)string2);
            switch (string = string2.substring(string2.lastIndexOf(46) + 1)) {
                case "png": 
                case "jpg": 
                case "jpeg": {
                    builder.image(class018942, customImage.width(), customImage.height());
                    return builder;
                }
                case "webp": {
                    builder.webpImage(class018942);
                    return builder;
                }
                case "gif": {
                    builder.gifImage(class018942);
                    return builder;
                }
                default: {
                    throw new YACLAutoGenException("'%s': Invalid image extension '%s' on @OverrideImage. Expected: ('png','jpg','webp','gif')".formatted(new Object[]{configField.access().name(), string}));
                }
            }
        }
        Object object2 = "textures/yacl3/" + configField.parent().id().N() + "/" + configField.access().name() + ".webp";
        object2 = ((String)object2).toLowerCase().replaceAll("[^a-z0-9/._:-]", "_");
        class01894 class018943 = YACLPlatform.rl((String)configField.parent().id().y(), (String)object2);
        if (!class06202.Nq().Nm().method_14486(class018943).isPresent()) return builder;
        builder.webpImage(class018943);
        return builder;
    }

    protected class05216 name(A a, ConfigField<T> configField, OptionAccess optionAccess) {
        Optional<CustomName> optional = configField.access().getAnnotation(CustomName.class);
        return class00392.L((String)optional.map(CustomName::value).orElse(this.getTranslationKey(configField, null)));
    }

    protected Set<OptionFlag> flags(A a, ConfigField<T> configField, OptionAccess optionAccess) {
        return Set.of();
    }

    protected boolean available(A a, ConfigField<T> configField, OptionAccess optionAccess) {
        return true;
    }

    @Override
    public Option<T> createOption(A a, ConfigField<T> configField, OptionAccess optionAccess) {
        Option option2 = Option.createBuilder().name((class00392)this.name(a, configField, optionAccess)).description(object -> this.description(object, a, configField, optionAccess).build()).binding(new FieldBackedBinding<T>(configField.access(), configField.defaultAccess())).controller(option -> {
            ControllerBuilder<T> controllerBuilder = this.createController(a, configField, optionAccess, (Option<T>)option);
            AutoGenUtils.addCustomFormatterToController(controllerBuilder, configField.access());
            return controllerBuilder;
        }).available(this.available(a, configField, optionAccess)).flags(this.flags(a, configField, optionAccess)).addListener((option, event) -> this.listener(a, configField, optionAccess, option, option.pendingValue())).build();
        this.postInit(a, configField, optionAccess, option2);
        return option2;
    }

    protected String getTranslationKey(ConfigField<T> configField, String string) {
        Object object = "yacl3.config.%s.%s".formatted(new Object[]{configField.parent().id().toString(), configField.access().name()});
        if (string != null) {
            object = (String)object + "." + string;
        }
        return object;
    }

    protected void postInit(A a, ConfigField<T> configField, OptionAccess optionAccess, Option<T> option) {
    }

    protected abstract ControllerBuilder<T> createController(A var1, ConfigField<T> var2, OptionAccess var3, Option<T> var4);
}

