/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigEntryBuilder
 *  me.shedaniel.clothconfig2.gui.entries.MultiElementListEntry
 *  me.shedaniel.clothconfig2.gui.entries.NestedListListEntry
 *  me.shedaniel.clothconfig2.gui.entries.SelectionListEntry$Translatable
 *  me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder
 *  minecraft.class00392
 *  minecraft.class08392
 *  org.apache.commons.lang3.ArrayUtils
 */
package me.shedaniel.autoconfig.gui;

import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import me.shedaniel.autoconfig.annotation.ConfigEntry$BoundedDiscrete;
import me.shedaniel.autoconfig.annotation.ConfigEntry$ColorPicker;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$CollapsibleObject;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$EnumHandler;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$EnumHandler$EnumDisplayOption;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Excluded;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$TransitiveObject;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.autoconfig.util.Utils;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.gui.entries.MultiElementListEntry;
import me.shedaniel.clothconfig2.gui.entries.NestedListListEntry;
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder;
import minecraft.class00392;
import minecraft.class08392;
import org.apache.commons.lang3.ArrayUtils;

public class DefaultGuiProviders {
    private static final ConfigEntryBuilder ENTRY_BUILDER = ConfigEntryBuilder.create();
    private static final Function<Enum<?>, class00392> DEFAULT_NAME_PROVIDER = enum_ -> class00392.L((String)(enum_ instanceof SelectionListEntry.Translatable ? ((SelectionListEntry.Translatable)enum_).getKey() : enum_.toString()));

    private static List<AbstractConfigListEntry> getChildren(String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        return DefaultGuiProviders.getChildren(string, field.getType(), Utils.getUnsafely(field, object), Utils.getUnsafely(field, object2), guiRegistryAccess);
    }

    private static List<AbstractConfigListEntry> getChildren(String string, Class<?> clazz, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        return Arrays.stream(clazz.getDeclaredFields()).map(field -> {
            String string2 = String.format("%s.%s", string, field.getName());
            return guiRegistryAccess.getAndTransform(string2, (Field)field, object, object2, guiRegistryAccess);
        }).filter(Objects::nonNull).flatMap(Collection::stream).collect(Collectors.toList());
    }

    private DefaultGuiProviders() {
    }

    public static GuiRegistry apply(GuiRegistry guiRegistry) {
        guiRegistry.registerAnnotationProvider((string, field, object, object2, guiRegistryAccess) -> Collections.emptyList(), ConfigEntry$Gui$Excluded.class);
        guiRegistry.registerAnnotationProvider((string, field, object, object2, guiRegistryAccess) -> {
            ConfigEntry$BoundedDiscrete configEntry$BoundedDiscrete = field.getAnnotation(ConfigEntry$BoundedDiscrete.class);
            return Collections.singletonList(ENTRY_BUILDER.startIntSlider((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, 0).intValue(), (int)configEntry$BoundedDiscrete.min(), (int)configEntry$BoundedDiscrete.max()).setDefaultValue(() -> (Integer)Utils.getUnsafely(field, object2)).setSaveConsumer(n -> Utils.setUnsafely(field, object, n)).build());
        }, field -> field.getType() == Integer.TYPE || field.getType() == Integer.class, ConfigEntry$BoundedDiscrete.class);
        guiRegistry.registerAnnotationProvider((string, field, object, object2, guiRegistryAccess) -> {
            ConfigEntry$BoundedDiscrete configEntry$BoundedDiscrete = field.getAnnotation(ConfigEntry$BoundedDiscrete.class);
            return Collections.singletonList(ENTRY_BUILDER.startLongSlider((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, 0L).longValue(), configEntry$BoundedDiscrete.min(), configEntry$BoundedDiscrete.max()).setDefaultValue(() -> (Long)Utils.getUnsafely(field, object2)).setSaveConsumer(l -> Utils.setUnsafely(field, object, l)).build());
        }, field -> field.getType() == Long.TYPE || field.getType() == Long.class, ConfigEntry$BoundedDiscrete.class);
        guiRegistry.registerAnnotationProvider((string, field, object, object2, guiRegistryAccess) -> {
            ConfigEntry$ColorPicker configEntry$ColorPicker = field.getAnnotation(ConfigEntry$ColorPicker.class);
            return Collections.singletonList(ENTRY_BUILDER.startColorField((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, 0).intValue()).setAlphaMode(configEntry$ColorPicker.allowAlpha()).setDefaultValue(() -> (Integer)Utils.getUnsafely(field, object2)).setSaveConsumer(n -> Utils.setUnsafely(field, object, n)).build());
        }, field -> field.getType() == Integer.TYPE || field.getType() == Integer.class, ConfigEntry$ColorPicker.class);
        guiRegistry.registerAnnotationProvider(DefaultGuiProviders::getChildren, field -> !field.getType().isPrimitive(), ConfigEntry$Gui$TransitiveObject.class);
        guiRegistry.registerAnnotationProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startSubCategory((class00392)class00392.L((String)string), DefaultGuiProviders.getChildren(string, field, object, object2, guiRegistryAccess)).setExpanded(field.getAnnotation(ConfigEntry$Gui$CollapsibleObject.class).startExpanded()).build()), field -> !field.getType().isPrimitive(), ConfigEntry$Gui$CollapsibleObject.class);
        guiRegistry.registerPredicateProvider((string, field, object, object2, guiRegistryAccess) -> {
            ?[] objArray = field.getType().getEnumConstants();
            Object[] objectArray = new Enum[objArray.length];
            for (int i = 0; i < objArray.length; ++i) {
                objectArray[i] = (Enum)objArray[i];
            }
            return Collections.singletonList(ENTRY_BUILDER.startSelector((class00392)class00392.L((String)string), objectArray, (Object)Utils.getUnsafely(field, object, (Enum)Utils.getUnsafely(field, object2))).setDefaultValue(() -> (Enum)Utils.getUnsafely(field, object2)).setSaveConsumer(enum_ -> Utils.setUnsafely(field, object, enum_)).build());
        }, field -> field.getType().isEnum() && field.isAnnotationPresent(ConfigEntry$Gui$EnumHandler.class) && field.getAnnotation(ConfigEntry$Gui$EnumHandler.class).option() == ConfigEntry$Gui$EnumHandler$EnumDisplayOption.BUTTON);
        guiRegistry.registerPredicateProvider((string2, field, object, object2, guiRegistryAccess) -> {
            List<Enum> list = Arrays.asList((Enum[])field.getType().getEnumConstants());
            return Collections.singletonList(ENTRY_BUILDER.startDropdownMenu((class00392)class00392.L((String)string2), DropdownMenuBuilder.TopCellElementBuilder.of((Object)Utils.getUnsafely(field, object, (Enum)Utils.getUnsafely(field, object2)), string -> {
                String string2 = class00392.y((String)string).getString();
                for (Enum enum_ : list) {
                    if (!DEFAULT_NAME_PROVIDER.apply(enum_).getString().equals(string2)) continue;
                    return enum_;
                }
                return null;
            }, DEFAULT_NAME_PROVIDER), DropdownMenuBuilder.CellCreatorBuilder.of(DEFAULT_NAME_PROVIDER)).setSelections(list).setDefaultValue(() -> (Enum)Utils.getUnsafely(field, object2)).setSaveConsumer(enum_ -> Utils.setUnsafely(field, object, enum_)).build());
        }, field -> field.getType().isEnum());
        guiRegistry.registerPredicateProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startIntList((class00392)class00392.L((String)string), (List)Utils.getUnsafely(field, object)).setDefaultValue(() -> (List)Utils.getUnsafely(field, object2)).setSaveConsumer(list -> Utils.setUnsafely(field, object, list)).build()), DefaultGuiProviders.isListOfType(new Type[]{Integer.class}));
        guiRegistry.registerPredicateProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startLongList((class00392)class00392.L((String)string), (List)Utils.getUnsafely(field, object)).setDefaultValue(() -> (List)Utils.getUnsafely(field, object2)).setSaveConsumer(list -> Utils.setUnsafely(field, object, list)).build()), DefaultGuiProviders.isListOfType(new Type[]{Long.class}));
        guiRegistry.registerPredicateProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startFloatList((class00392)class00392.L((String)string), (List)Utils.getUnsafely(field, object)).setDefaultValue(() -> (List)Utils.getUnsafely(field, object2)).setSaveConsumer(list -> Utils.setUnsafely(field, object, list)).build()), DefaultGuiProviders.isListOfType(new Type[]{Float.class}));
        guiRegistry.registerPredicateProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startDoubleList((class00392)class00392.L((String)string), (List)Utils.getUnsafely(field, object)).setDefaultValue(() -> (List)Utils.getUnsafely(field, object2)).setSaveConsumer(list -> Utils.setUnsafely(field, object, list)).build()), DefaultGuiProviders.isListOfType(new Type[]{Double.class}));
        guiRegistry.registerPredicateProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startStrList((class00392)class00392.L((String)string), (List)Utils.getUnsafely(field, object)).setDefaultValue(() -> (List)Utils.getUnsafely(field, object2)).setSaveConsumer(list -> Utils.setUnsafely(field, object, list)).build()), DefaultGuiProviders.isListOfType(new Type[]{String.class}));
        guiRegistry.registerPredicateProvider((string, field, object, object3, guiRegistryAccess) -> {
            List list2 = (List)Utils.getUnsafely(field, object);
            Class clazz = (Class)((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
            Object v = Utils.constructUnsafely(clazz);
            String string2 = string.substring(0, string.indexOf(".option") + ".option".length());
            String string3 = String.format("%s.%s", string2, clazz.getSimpleName());
            return Collections.singletonList(new NestedListListEntry((class00392)class00392.L((String)string), list2, false, null, list -> Utils.setUnsafely(field, object, list), () -> (List)Utils.getUnsafely(field, object3), ENTRY_BUILDER.getResetButtonKey(), true, false, (object2, nestedListListEntry) -> {
                if (object2 == null) {
                    Object v = Utils.constructUnsafely(clazz);
                    return new MultiElementListEntry((class00392)class00392.L((String)string3), v, DefaultGuiProviders.getChildren(string3, clazz, v, v, guiRegistryAccess), true);
                }
                return new MultiElementListEntry((class00392)class00392.L((String)string3), object2, DefaultGuiProviders.getChildren(string3, clazz, object2, v, guiRegistryAccess), true);
            }));
        }, DefaultGuiProviders.isNotListOfType(new Type[]{Integer.class, Long.class, Float.class, Double.class, String.class}));
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startBooleanToggle((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, false).booleanValue()).setDefaultValue(() -> (Boolean)Utils.getUnsafely(field, object2)).setSaveConsumer(bl -> Utils.setUnsafely(field, object, bl)).setYesNoTextSupplier(bl -> {
            String string2 = string + ".boolean." + bl;
            String string3 = class08392.N((String)string2, (Object[])new Object[0]);
            if (string3.equals(string2)) {
                return class00392.L((String)("text.cloth-config.boolean.value." + bl));
            }
            return class00392.y((String)string3);
        }).build()), Boolean.TYPE, Boolean.class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startIntField((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, 0).intValue()).setDefaultValue(() -> (Integer)Utils.getUnsafely(field, object2)).setSaveConsumer(n -> Utils.setUnsafely(field, object, n)).build()), Integer.TYPE, Integer.class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startIntList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Object[])Utils.getUnsafely(field, object, new Integer[0]))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList((Object[])((Integer[])Utils.getUnsafely(field, object2)))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.toArray(new Integer[0]))).build()), Integer[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startIntList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Iterable)IntStream.of(Utils.getUnsafely(field, object, new int[0])).boxed().collect(Collectors.toList()))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList(Arrays.asList(ArrayUtils.toObject((int[])((int[])Utils.getUnsafely(field, object2)))))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.stream().mapToInt(Integer::intValue).toArray())).build()), int[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startLongField((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, 0L).longValue()).setDefaultValue(() -> (Long)Utils.getUnsafely(field, object2)).setSaveConsumer(l -> Utils.setUnsafely(field, object, l)).build()), Long.TYPE, Long.class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startLongList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Object[])Utils.getUnsafely(field, object, new Long[0]))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList((Object[])((Long[])Utils.getUnsafely(field, object2)))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.toArray(new Long[0]))).build()), Long[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startLongList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Iterable)LongStream.of(Utils.getUnsafely(field, object, new long[0])).boxed().collect(Collectors.toList()))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList(Arrays.asList(ArrayUtils.toObject((long[])((long[])Utils.getUnsafely(field, object2)))))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.stream().mapToLong(Long::longValue).toArray())).build()), long[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startFloatField((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, Float.valueOf(0.0f)).floatValue()).setDefaultValue(() -> (Float)Utils.getUnsafely(field, object2)).setSaveConsumer(f -> Utils.setUnsafely(field, object, f)).build()), Float.TYPE, Float.class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startFloatList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Object[])Utils.getUnsafely(field, object, new Float[0]))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList((Object[])((Float[])Utils.getUnsafely(field, object2)))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.toArray(new Float[0]))).build()), Float[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startFloatList((class00392)class00392.L((String)string), (List)Lists.newArrayList(Arrays.asList(ArrayUtils.toObject((float[])Utils.getUnsafely(field, object, new float[0]))))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList(Arrays.asList(ArrayUtils.toObject((float[])((float[])Utils.getUnsafely(field, object2)))))).setSaveConsumer(list -> Utils.setUnsafely(field, object, ArrayUtils.toPrimitive((Float[])list.toArray(new Float[0])))).build()), float[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startDoubleField((class00392)class00392.L((String)string), Utils.getUnsafely(field, object, 0.0).doubleValue()).setDefaultValue(() -> (Double)Utils.getUnsafely(field, object2)).setSaveConsumer(d -> Utils.setUnsafely(field, object, d)).build()), Double.TYPE, Double.class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startDoubleList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Object[])Utils.getUnsafely(field, object, new Double[0]))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList((Object[])((Double[])Utils.getUnsafely(field, object2)))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.toArray(new Double[0]))).build()), Double[].class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startDoubleList((class00392)class00392.L((String)string), (List)Lists.newArrayList(Arrays.asList(ArrayUtils.toObject((double[])Utils.getUnsafely(field, object, new double[0]))))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList(Arrays.asList(ArrayUtils.toObject((double[])((double[])Utils.getUnsafely(field, object2)))))).setSaveConsumer(list -> Utils.setUnsafely(field, object, ArrayUtils.toPrimitive((Double[])list.toArray(new Double[0])))).build()), double[].class);
        guiRegistry.registerTypeProvider((string2, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startStrField((class00392)class00392.L((String)string2), Utils.getUnsafely(field, object, "")).setDefaultValue(() -> (String)Utils.getUnsafely(field, object2)).setSaveConsumer(string -> Utils.setUnsafely(field, object, string)).build()), String.class);
        guiRegistry.registerTypeProvider((string, field, object, object2, guiRegistryAccess) -> Collections.singletonList(ENTRY_BUILDER.startStrList((class00392)class00392.L((String)string), (List)Lists.newArrayList((Object[])Utils.getUnsafely(field, object, new String[0]))).setDefaultValue(() -> object2 == null ? null : Lists.newArrayList((Object[])((String[])Utils.getUnsafely(field, object2)))).setSaveConsumer(list -> Utils.setUnsafely(field, object, list.toArray(new String[0]))).build()), String[].class);
        guiRegistry.registerPredicateProvider((string, field, object, object3, guiRegistryAccess) -> {
            Object v = Utils.getUnsafely(field, object);
            ArrayList<Object> arrayList = new ArrayList<Object>(Array.getLength(v));
            for (int i = 0; i < Array.getLength(v); ++i) {
                arrayList.add(Array.get(v, i));
            }
            Class<?> clazz = field.getType().getComponentType();
            Object obj = Utils.constructUnsafely(clazz);
            String string2 = string.substring(0, string.indexOf(".option") + ".option".length());
            String string3 = String.format("%s.%s", string2, clazz.getSimpleName());
            return Collections.singletonList(new NestedListListEntry((class00392)class00392.L((String)string), arrayList, false, null, list -> {
                Object[] objectArray = (Object[])Array.newInstance(clazz, list.size());
                for (int i = 0; i < list.size(); ++i) {
                    Array.set(objectArray, i, list.get(i));
                }
                Utils.setUnsafely(field, object, objectArray);
            }, () -> {
                Object v = Utils.getUnsafely(field, object3);
                ArrayList<Object> arrayList = new ArrayList<Object>(Array.getLength(v));
                for (int i = 0; i < Array.getLength(v); ++i) {
                    arrayList.add(Array.get(v, i));
                }
                return arrayList;
            }, ENTRY_BUILDER.getResetButtonKey(), true, false, (object2, nestedListListEntry) -> {
                if (object2 == null) {
                    Object v = Utils.constructUnsafely(clazz);
                    return new MultiElementListEntry((class00392)class00392.L((String)string3), v, DefaultGuiProviders.getChildren(string3, clazz, v, obj, guiRegistryAccess), true);
                }
                return new MultiElementListEntry((class00392)class00392.L((String)string3), object2, DefaultGuiProviders.getChildren(string3, clazz, object2, obj, guiRegistryAccess), true);
            }));
        }, field -> field.getType().isArray() && field.getType() != String[].class && field.getType() != int[].class && field.getType() != Integer[].class && field.getType() != long[].class && field.getType() != Long[].class && field.getType() != float[].class && field.getType() != Float[].class && field.getType() != double[].class && field.getType() != Double[].class);
        return guiRegistry;
    }

    private static Predicate<Field> isNotListOfType(Type ... typeArray) {
        return field -> {
            if (List.class.isAssignableFrom(field.getType()) && field.getGenericType() instanceof ParameterizedType) {
                Type[] typeArray2 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments();
                return typeArray2.length == 1 && Stream.of(typeArray).noneMatch(type -> Objects.equals(typeArray2[0], type));
            }
            return false;
        };
    }

    private static Predicate<Field> isListOfType(Type ... typeArray) {
        return field -> {
            if (List.class.isAssignableFrom(field.getType()) && field.getGenericType() instanceof ParameterizedType) {
                Type[] typeArray2 = ((ParameterizedType)field.getGenericType()).getActualTypeArguments();
                return typeArray2.length == 1 && Stream.of(typeArray).anyMatch(type -> Objects.equals(typeArray2[0], type));
            }
            return false;
        };
    }
}

