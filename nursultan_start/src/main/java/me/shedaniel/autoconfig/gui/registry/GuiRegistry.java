/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 */
package me.shedaniel.autoconfig.gui.registry;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry$Priority;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry$ProviderEntry;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry$TransformerEntry;
import me.shedaniel.autoconfig.gui.registry.api.GuiProvider;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.autoconfig.gui.registry.api.GuiTransformer;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;

public final class GuiRegistry
implements GuiRegistryAccess {
    private Map<GuiRegistry$Priority, List<GuiRegistry$ProviderEntry>> providers = new HashMap<GuiRegistry$Priority, List<GuiRegistry$ProviderEntry>>();
    private List<GuiRegistry$TransformerEntry> transformers = new ArrayList<GuiRegistry$TransformerEntry>();

    private void registerProvider(GuiRegistry$Priority guiRegistry$Priority2, GuiProvider guiProvider, Predicate<Field> predicate) {
        this.providers.computeIfAbsent(guiRegistry$Priority2, guiRegistry$Priority -> new ArrayList()).add(new GuiRegistry$ProviderEntry(predicate, guiProvider));
    }

    public GuiRegistry() {
        for (GuiRegistry$Priority guiRegistry$Priority : GuiRegistry$Priority.values()) {
            this.providers.put(guiRegistry$Priority, new ArrayList());
        }
    }

    @Override
    public List<AbstractConfigListEntry> get(String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        return GuiRegistry.firstPresent(Arrays.stream(GuiRegistry$Priority.values()).map(guiRegistry$Priority -> () -> this.providers.get(guiRegistry$Priority).stream().filter(guiRegistry$ProviderEntry -> guiRegistry$ProviderEntry.predicate.test(field)).findFirst())).map(guiRegistry$ProviderEntry -> guiRegistry$ProviderEntry.provider.get(string, field, object, object2, guiRegistryAccess)).orElse(null);
    }

    @Override
    public List<AbstractConfigListEntry> transform(List<AbstractConfigListEntry> list, String string, Field field, Object object, Object object2, GuiRegistryAccess guiRegistryAccess) {
        List list2 = this.transformers.stream().filter(guiRegistry$TransformerEntry -> guiRegistry$TransformerEntry.predicate.test(field)).map(guiRegistry$TransformerEntry -> guiRegistry$TransformerEntry.transformer).collect(Collectors.toList());
        for (GuiTransformer guiTransformer : list2) {
            list = guiTransformer.transform(list, string, field, object, object2, guiRegistryAccess);
        }
        return list;
    }

    @SafeVarargs
    public final void registerAnnotationTransformer(GuiTransformer guiTransformer, Class<? extends Annotation> ... classArray) {
        this.registerAnnotationTransformer(guiTransformer, (Field field) -> true, classArray);
    }

    @SafeVarargs
    public final void registerAnnotationTransformer(GuiTransformer guiTransformer, Predicate<Field> predicate, Class<? extends Annotation> ... classArray) {
        for (Class<? extends Annotation> clazz : classArray) {
            this.registerPredicateTransformer(guiTransformer, field -> predicate.test((Field)field) && field.isAnnotationPresent(clazz));
        }
    }

    public void registerPredicateTransformer(GuiTransformer guiTransformer, Predicate<Field> predicate) {
        this.transformers.add(new GuiRegistry$TransformerEntry(predicate, guiTransformer));
    }

    private static <T> Optional<T> firstPresent(Stream<Supplier<Optional<T>>> stream) {
        return stream.map(Supplier::get).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    public final void registerPredicateProvider(GuiProvider guiProvider, Predicate<Field> predicate) {
        this.registerProvider(GuiRegistry$Priority.NORMAL, guiProvider, predicate);
    }

    public final void registerTypeProvider(GuiProvider guiProvider, Class ... classArray) {
        for (Class clazz : classArray) {
            this.registerProvider(GuiRegistry$Priority.LAST, guiProvider, field -> clazz == field.getType());
        }
    }

    @SafeVarargs
    public final void registerAnnotationProvider(GuiProvider guiProvider, Predicate<Field> predicate, Class<? extends Annotation> ... classArray) {
        for (Class<? extends Annotation> clazz : classArray) {
            this.registerProvider(GuiRegistry$Priority.FIRST, guiProvider, field -> predicate.test((Field)field) && field.isAnnotationPresent(clazz));
        }
    }

    @SafeVarargs
    public final void registerAnnotationProvider(GuiProvider guiProvider, Class<? extends Annotation> ... classArray) {
        for (Class<? extends Annotation> clazz : classArray) {
            this.registerProvider(GuiRegistry$Priority.FIRST, guiProvider, field -> field.isAnnotationPresent(clazz));
        }
    }
}

