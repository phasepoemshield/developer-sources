/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class07018
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.ListGroup;
import dev.isxander.yacl3.config.v2.api.autogen.ListGroup$ControllerFactory;
import dev.isxander.yacl3.config.v2.api.autogen.ListGroup$ValueFactory;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.OptionFactory;
import dev.isxander.yacl3.config.v2.impl.FieldBackedBinding;
import dev.isxander.yacl3.config.v2.impl.autogen.YACLAutoGenException;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class07018;

public class ListGroupImpl<T>
implements OptionFactory<ListGroup, List<T>> {
    private OptionDescription description(ConfigField<List<T>> configField) {
        OptionDescription.Builder builder = OptionDescription.createBuilder();
        Object object = this.getTranslationKey(configField, "desc");
        if (class07018.y().N((String)object)) {
            builder.text(new class00392[]{class00392.L((String)object)});
        } else {
            object = (String)object + ".";
            int n = 0;
            while (class07018.y().N((String)object + n++)) {
                builder.text(new class00392[]{class00392.L((String)((String)object + n))});
            }
        }
        Object object2 = "textures/yacl3/" + configField.parent().id().N() + "/" + configField.access().name() + ".webp";
        object2 = ((String)object2).toLowerCase().replaceAll("[^a-z0-9/._:-]", "_");
        class01894 class018942 = YACLPlatform.rl((String)configField.parent().id().y(), (String)object2);
        if (class06202.Nq().Nm().method_14486(class018942).isPresent()) {
            builder.webpImage(class018942);
        }
        return builder.build();
    }

    @Override
    public Option<List<T>> createOption(ListGroup listGroup, ConfigField<List<T>> configField, OptionAccess optionAccess) {
        if (configField.autoGen().orElseThrow().group().isPresent()) {
            throw new YACLAutoGenException("@ListGroup fields ('%s') cannot be inside a group as lists act as groups.".formatted(new Object[]{configField.access().name()}));
        }
        ListGroup$ValueFactory<T> listGroup$ValueFactory = this.createValueFactory(listGroup.valueFactory());
        ListGroup$ControllerFactory listGroup$ControllerFactory = this.createControllerFactory(listGroup.controllerFactory());
        return ListOption.createBuilder().name((class00392)class00392.L((String)this.getTranslationKey(configField, null))).description(this.description(configField)).initial(listGroup$ValueFactory::provideNewValue).controller(option -> listGroup$ControllerFactory.createController(listGroup, configField, optionAccess, (Option)option)).binding(new FieldBackedBinding<List<T>>(configField.access(), configField.defaultAccess())).minimumNumberOfEntries(listGroup.minEntries()).maximumNumberOfEntries(listGroup.maxEntries() == 0 ? Integer.MAX_VALUE : listGroup.maxEntries()).insertEntriesAtEnd(listGroup.addEntriesToBottom()).build();
    }

    private String getTranslationKey(ConfigField<List<T>> configField, String string) {
        Object object = "yacl3.config.%s.%s".formatted(new Object[]{configField.parent().id().toString(), configField.access().name()});
        if (string != null) {
            object = (String)object + "." + string;
        }
        return object;
    }

    private ListGroup$ControllerFactory<T> createControllerFactory(Class<? extends ListGroup$ControllerFactory<T>> clazz) {
        Constructor<ListGroup$ControllerFactory<T>> constructor;
        try {
            constructor = clazz.getConstructor(new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new YACLAutoGenException("Could not find no-args constructor on `controllerFactory`, '%s' for @ListGroup field.".formatted(new Object[]{clazz.getName()}), noSuchMethodException);
        }
        try {
            return constructor.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new YACLAutoGenException("Couldn't invoke no-args constructor on `controllerFactory`, '%s' for @ListGroup field.".formatted(new Object[]{clazz.getName()}), reflectiveOperationException);
        }
    }

    private ListGroup$ValueFactory<T> createValueFactory(Class<? extends ListGroup$ValueFactory<T>> clazz) {
        Constructor<ListGroup$ValueFactory<T>> constructor;
        try {
            constructor = clazz.getConstructor(new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new YACLAutoGenException("Could not find no-args constructor for `valueFactory` on '%s' for @ListGroup field.".formatted(new Object[]{clazz.getName()}), noSuchMethodException);
        }
        try {
            return constructor.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new YACLAutoGenException("Couldn't invoke no-args constructor for `valueFactory` on '%s' for @ListGroup field.".formatted(new Object[]{clazz.getName()}), reflectiveOperationException);
        }
    }
}

