/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormattableController
 *  minecraft.class00392
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormattableController;
import dev.isxander.yacl3.config.v2.api.ReadOnlyFieldAccess;
import dev.isxander.yacl3.config.v2.api.autogen.CustomFormat;
import dev.isxander.yacl3.config.v2.api.autogen.FormatTranslation;
import dev.isxander.yacl3.config.v2.impl.autogen.YACLAutoGenException;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00392;

public final class AutoGenUtils {
    public static <T> T constructNoArgsClass(Class<T> clazz, Supplier<String> supplier, Supplier<String> supplier2) {
        try {
            return clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new YACLAutoGenException(supplier.get(), noSuchMethodException);
        }
        catch (Exception exception) {
            throw new YACLAutoGenException(supplier2.get(), exception);
        }
    }

    public static <T> void addCustomFormatterToController(ControllerBuilder<T> controllerBuilder, ReadOnlyFieldAccess<T> readOnlyFieldAccess) {
        Optional<CustomFormat> optional = readOnlyFieldAccess.getAnnotation(CustomFormat.class);
        Optional<FormatTranslation> optional2 = readOnlyFieldAccess.getAnnotation(FormatTranslation.class);
        if (optional.isPresent() && optional2.isPresent()) {
            throw new YACLAutoGenException("'%s': Cannot use both @CustomFormatter and @FormatTranslation on the same field.".formatted(new Object[]{readOnlyFieldAccess.name()}));
        }
        if (optional.isEmpty() && optional2.isEmpty()) {
            return;
        }
        if (!(controllerBuilder instanceof ValueFormattableController)) {
            throw new YACLAutoGenException("Attempted to use @CustomFormatter or @FormatTranslation on an option factory for field '%s' that uses a controller that does not support this.".formatted(new Object[]{readOnlyFieldAccess.name()}));
        }
        ValueFormattableController valueFormattableController = (ValueFormattableController)controllerBuilder;
        optional.ifPresent(customFormat -> {
            try {
                valueFormattableController.formatValue(customFormat.value().getConstructor(new Class[0]).newInstance(new Object[0]));
            }
            catch (Exception exception) {
                throw new YACLAutoGenException("'%s': Failed to instantiate formatter class %s.".formatted(new Object[]{readOnlyFieldAccess.name(), customFormat.value().getName()}), exception);
            }
        });
        optional2.ifPresent(formatTranslation -> valueFormattableController.formatValue(object -> class00392.N((String)formatTranslation.value(), (Object[])new Object[]{object})));
    }
}

