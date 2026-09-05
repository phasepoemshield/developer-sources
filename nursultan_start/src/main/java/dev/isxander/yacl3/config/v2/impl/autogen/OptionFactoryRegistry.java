/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.Boolean;
import dev.isxander.yacl3.config.v2.api.autogen.ColorField;
import dev.isxander.yacl3.config.v2.api.autogen.DoubleField;
import dev.isxander.yacl3.config.v2.api.autogen.DoubleSlider;
import dev.isxander.yacl3.config.v2.api.autogen.Dropdown;
import dev.isxander.yacl3.config.v2.api.autogen.EnumCycler;
import dev.isxander.yacl3.config.v2.api.autogen.FloatField;
import dev.isxander.yacl3.config.v2.api.autogen.FloatSlider;
import dev.isxander.yacl3.config.v2.api.autogen.IntField;
import dev.isxander.yacl3.config.v2.api.autogen.IntSlider;
import dev.isxander.yacl3.config.v2.api.autogen.ItemField;
import dev.isxander.yacl3.config.v2.api.autogen.Label;
import dev.isxander.yacl3.config.v2.api.autogen.ListGroup;
import dev.isxander.yacl3.config.v2.api.autogen.LongField;
import dev.isxander.yacl3.config.v2.api.autogen.LongSlider;
import dev.isxander.yacl3.config.v2.api.autogen.MasterTickBox;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.OptionFactory;
import dev.isxander.yacl3.config.v2.api.autogen.StringField;
import dev.isxander.yacl3.config.v2.api.autogen.TickBox;
import dev.isxander.yacl3.config.v2.impl.autogen.BooleanImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.ColorFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.DoubleFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.DoubleSliderImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.DropdownImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.EnumCyclerImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.FloatFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.FloatSliderImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.IntFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.IntSliderImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.ItemFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.LabelImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.ListGroupImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.LongFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.LongSliderImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.MasterTickBoxImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.StringFieldImpl;
import dev.isxander.yacl3.config.v2.impl.autogen.TickBoxImpl;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionFactoryRegistry {
    private static final Map<Class<?>, OptionFactory<?, ?>> factoryMap = new HashMap();

    static {
        OptionFactoryRegistry.registerOptionFactory(TickBox.class, new TickBoxImpl());
        OptionFactoryRegistry.registerOptionFactory(Boolean.class, new BooleanImpl());
        OptionFactoryRegistry.registerOptionFactory(IntSlider.class, new IntSliderImpl());
        OptionFactoryRegistry.registerOptionFactory(LongSlider.class, new LongSliderImpl());
        OptionFactoryRegistry.registerOptionFactory(FloatSlider.class, new FloatSliderImpl());
        OptionFactoryRegistry.registerOptionFactory(DoubleSlider.class, new DoubleSliderImpl());
        OptionFactoryRegistry.registerOptionFactory(IntField.class, new IntFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(LongField.class, new LongFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(FloatField.class, new FloatFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(DoubleField.class, new DoubleFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(EnumCycler.class, new EnumCyclerImpl());
        OptionFactoryRegistry.registerOptionFactory(StringField.class, new StringFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(ColorField.class, new ColorFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(Dropdown.class, new DropdownImpl());
        OptionFactoryRegistry.registerOptionFactory(ItemField.class, new ItemFieldImpl());
        OptionFactoryRegistry.registerOptionFactory(Label.class, new LabelImpl());
        OptionFactoryRegistry.registerOptionFactory(ListGroup.class, new ListGroupImpl());
        OptionFactoryRegistry.registerOptionFactory(MasterTickBox.class, new MasterTickBoxImpl());
    }

    public static <T> Optional<Option<T>> createOption(Field field, ConfigField<T> configField, OptionAccess optionAccess) {
        Annotation[] annotationArray = (Annotation[])Arrays.stream(field.getAnnotations()).filter(annotation -> factoryMap.containsKey(annotation.annotationType())).toArray(Annotation[]::new);
        if (annotationArray.length != 1) {
            YACLConstants.LOGGER.warn("Found {} option factory annotations on field {}, expected 1", (Object)annotationArray.length, (Object)field);
            if (annotationArray.length == 0) {
                return Optional.empty();
            }
        }
        Annotation annotation2 = annotationArray[0];
        OptionFactory<?, ?> optionFactory = factoryMap.get(annotation2.annotationType());
        return Optional.of(optionFactory.createOption(annotation2, configField, optionAccess));
    }

    public static <A extends Annotation, T> void registerOptionFactory(Class<A> clazz, OptionFactory<A, T> optionFactory) {
        factoryMap.put(clazz, optionFactory);
    }
}

