/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  java.lang.Record
 *  minecraft.class01894
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class05630
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.FlagHook
 *  net.caffeinemc.mods.sodium.api.config.option.OptionFlag
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import it.unimi.dsi.fastutil.objects.Object2ReferenceLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class05630;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.FlagHook;
import net.caffeinemc.mods.sodium.api.config.option.OptionFlag;
import net.caffeinemc.mods.sodium.client.config.builder.OptionBuilderImpl;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex;
import net.caffeinemc.mods.sodium.client.config.search.SearchIndex;
import net.caffeinemc.mods.sodium.client.config.search.SearchQuerySession;
import net.caffeinemc.mods.sodium.client.config.structure.BooleanOption;
import net.caffeinemc.mods.sodium.client.config.structure.Config$ApplyHookFlagHook;
import net.caffeinemc.mods.sodium.client.config.structure.EnumOption;
import net.caffeinemc.mods.sodium.client.config.structure.IntegerOption;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.OptionOverlay;
import net.caffeinemc.mods.sodium.client.config.structure.OptionOverride;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.config.value.DynamicValue;
import net.caffeinemc.mods.sodium.client.console.Console;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;

public class Config
implements ConfigState {
    private final Map<class01894, Option> options = new Object2ReferenceLinkedOpenHashMap();
    private final Set<StorageEventHandler> pendingStorageHandlers = new ObjectOpenHashSet();
    private final List<ModOptions> modOptions;
    private final SearchIndex searchIndex = new BigramSearchIndex(this::registerSearchIndex);
    private final Collection<DynamicValue<?>> globalRebuildDependents = new ObjectArrayList();
    private final Map<class01894, Collection<FlagHook>> flagHooks = new Object2ReferenceOpenHashMap();
    private final Set<FlagHook> triggeredHooks = new ObjectOpenHashSet();
    private static final Set<class01894> SPECIAL_DEPENDENCIES = Set.of(ConfigState.UPDATE_ON_REBUILD, ConfigState.UPDATE_ON_APPLY);

    public Config(List<ModOptions> list) {
        this.modOptions = Collections.unmodifiableList(list);
        this.collectOptions();
        this.applyOptionChanges();
        this.collectApplyHooks();
        this.validateDependencies();
        for (Option option : this.options.values()) {
            option.loadValueInitial();
        }
        this.resetAllOptionsFromBindings();
    }

    public Option getOption(class01894 class018942) {
        return this.options.get(class018942);
    }

    public boolean readBooleanOption(class01894 class018942, boolean bl) {
        Option option = this.options.get(class018942);
        if (option instanceof BooleanOption) {
            BooleanOption booleanOption = (BooleanOption)option;
            if (bl) {
                return (Boolean)booleanOption.getAppliedValue();
            }
            return (Boolean)booleanOption.getValidatedValue();
        }
        throw new IllegalArgumentException("Can't read boolean value from option with id " + String.valueOf(class018942));
    }

    public boolean readBooleanOption(class01894 class018942) {
        return this.readBooleanOption(class018942, true);
    }

    public int readIntOption(class01894 class018942, boolean bl) {
        Option option = this.options.get(class018942);
        if (option instanceof IntegerOption) {
            IntegerOption integerOption = (IntegerOption)option;
            if (bl) {
                return (Integer)integerOption.getAppliedValue();
            }
            return (Integer)integerOption.getValidatedValue();
        }
        throw new IllegalArgumentException("Can't read int value from option with id " + String.valueOf(class018942));
    }

    public int readIntOption(class01894 class018942) {
        return this.readIntOption(class018942, true);
    }

    public <E extends Enum<E>> E readEnumOption(class01894 class018942, Class<E> clazz, boolean bl) {
        Option option = this.options.get(class018942);
        if (option instanceof EnumOption) {
            EnumOption enumOption = (EnumOption)option;
            if (enumOption.enumClass != clazz) {
                throw new IllegalArgumentException("Enum class mismatch for option with id " + String.valueOf(class018942) + ": requested " + String.valueOf(clazz) + ", option has " + String.valueOf(enumOption.enumClass));
            }
            if (bl) {
                return (E)((Enum)clazz.cast(enumOption.getAppliedValue()));
            }
            return (E)((Enum)clazz.cast(enumOption.getValidatedValue()));
        }
        throw new IllegalArgumentException("Can't read enum value from option with id " + String.valueOf(class018942));
    }

    public <E extends Enum<E>> E readEnumOption(class01894 class018942, Class<E> clazz) {
        return this.readEnumOption(class018942, clazz, true);
    }

    void invalidateDependents(Collection<DynamicValue<?>> collection) {
        for (DynamicValue<?> dynamicValue : collection) {
            dynamicValue.invalidateCache();
        }
    }

    private void validateDependencies() {
        Option option22;
        for (Option option22 : this.options.values()) {
            for (class01894 object : option22.dependencies) {
                if (this.options.containsKey(object) || SPECIAL_DEPENDENCIES.contains(object)) continue;
                throw new IllegalArgumentException("Option " + String.valueOf(option22.id) + " depends on non-existent option " + String.valueOf(object));
            }
            option22.visitDependentValues(dependentValue -> {
                if (dependentValue instanceof DynamicValue) {
                    DynamicValue dynamicValue = (DynamicValue)dependentValue;
                    for (class01894 class018942 : dependentValue.getDependencies()) {
                        Option option2;
                        if (class018942.equals((Object)ConfigState.UPDATE_ON_REBUILD)) {
                            this.globalRebuildDependents.add(dynamicValue);
                            continue;
                        }
                        if (class018942.equals((Object)ConfigState.UPDATE_ON_APPLY) && option22 instanceof StatefulOption) {
                            option2 = (StatefulOption)option22;
                            ((StatefulOption)option2).registerApplyDependent(dynamicValue);
                            dynamicValue.allowReadingParentOption(option.id);
                            continue;
                        }
                        option2 = this.options.get(class018942);
                        if (!(option2 instanceof StatefulOption)) continue;
                        StatefulOption statefulOption = (StatefulOption)option2;
                        statefulOption.registerDependent(dynamicValue);
                    }
                }
            });
        }
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet();
        option22 = new ObjectOpenHashSet();
        for (Option option : this.options.values()) {
            this.checkDependencyCycles(option, (ObjectOpenHashSet<class01894>)objectOpenHashSet, (ObjectOpenHashSet<class01894>)option22);
        }
    }

    void flushStorageHandlers() {
        for (StorageEventHandler storageEventHandler : this.pendingStorageHandlers) {
            storageEventHandler.afterSave();
        }
        this.pendingStorageHandlers.clear();
    }

    private void checkDependencyCycles(Option option, ObjectOpenHashSet<class01894> objectOpenHashSet, ObjectOpenHashSet<class01894> objectOpenHashSet2) {
        if (!objectOpenHashSet.add((Object)option.id)) {
            throw new IllegalArgumentException("Cycle detected in dependency graph starting from option " + String.valueOf(option.id));
        }
        for (class01894 class018942 : option.dependencies) {
            Option option2;
            if (objectOpenHashSet2.contains((Object)class018942) || (option2 = this.options.get(class018942)) == null) continue;
            this.checkDependencyCycles(option2, objectOpenHashSet, objectOpenHashSet2);
        }
        objectOpenHashSet.remove((Object)option.id);
        objectOpenHashSet2.add((Object)option.id);
    }

    private void registerSearchIndex() {
        for (ModOptions modOptions : this.modOptions) {
            modOptions.registerTextSources(this.searchIndex);
        }
    }

    public void resetAllOptionsFromBindings() {
        for (Option option : this.options.values()) {
            option.resetFromBinding();
        }
    }

    public void invalidateGlobalRebuildDependents() {
        this.invalidateDependents(this.globalRebuildDependents);
    }

    private void processFlags(Set<class01894> set) {
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 != null) {
            if (set.contains(OptionFlag.REQUIRES_RENDERER_RELOAD.getId())) {
                ((class03063)class062022.B_2).u();
            } else if (set.contains(OptionFlag.REQUIRES_RENDERER_UPDATE.getId())) {
                ((class03063)class062022.B_2).W();
            }
        }
        if (set.contains(OptionFlag.REQUIRES_ASSET_RELOAD.getId())) {
            class062022.N(((Integer)((class05630)class062022.i_7).V().method_41753()).intValue());
            class062022.Nw();
        }
        if (set.contains(OptionFlag.REQUIRES_VIDEOMODE_RELOAD.getId())) {
            class062022.Nt().R();
        }
        if (set.contains(OptionFlag.REQUIRES_GAME_RESTART.getId())) {
            Console.instance().logMessage(MessageLevel.WARN, "sodium.console.game_restart", true, 10.0);
        }
        this.triggeredHooks.clear();
        Set<class01894> set2 = Collections.unmodifiableSet(set);
        for (class01894 class018942 : set) {
            Collection<FlagHook> collection = this.flagHooks.get(class018942);
            if (collection == null) continue;
            for (FlagHook flagHook : collection) {
                if (!this.triggeredHooks.add(flagHook)) continue;
                flagHook.accept(set2, (Object)this);
            }
        }
    }

    private void exchangeOption(List<Option> list, int n, Option option, Option option2) {
        list.set(n, option);
        this.options.remove(option2.id);
        this.options.put(option.id, option);
        option.setParentConfig(this);
        option2.setParentConfig(null);
    }

    public List<ModOptions> getModOptions() {
        return this.modOptions;
    }

    public boolean anyOptionChanged() {
        for (Option option : this.options.values()) {
            if (!option.hasChanged()) continue;
            return true;
        }
        return false;
    }

    public void applyOption(class01894 class018942) {
        Set<class01894> set = null;
        Option option = this.options.get(class018942);
        if (option != null && option.applyChanges()) {
            set = option.getFlags();
        }
        this.flushStorageHandlers();
        if (set == null) {
            return;
        }
        this.processFlags(set);
    }

    public void applyAllOptions() {
        Set set = null;
        for (Option option : this.options.values()) {
            StatefulOption statefulOption;
            class01894 class018942;
            if (!option.applyChanges()) continue;
            Set<class01894> set2 = option.getFlags();
            if (set2 != null && !set2.isEmpty()) {
                if (set == null) {
                    set = new ObjectOpenHashSet();
                }
                set.addAll(set2);
            }
            if (!(option instanceof StatefulOption) || (class018942 = (statefulOption = (StatefulOption)option).getApplyHookId()) == null) continue;
            if (set == null) {
                set = new ObjectOpenHashSet();
            }
            set.add(class018942);
        }
        this.flushStorageHandlers();
        if (set == null) {
            return;
        }
        this.processFlags(set);
    }

    public SearchQuerySession startSearchQuery() {
        return this.searchIndex.startQuery();
    }

    private void registerHook(FlagHook flagHook) {
        for (class01894 class018943 : flagHook.getTriggers()) {
            this.flagHooks.computeIfAbsent(class018943, class018942 -> new ObjectArrayList()).add(flagHook);
        }
    }

    private void collectOptions() {
        for (ModOptions modOptions : this.modOptions) {
            for (Page page : modOptions.pages()) {
                for (OptionGroup optionGroup : page.groups()) {
                    for (Option option : optionGroup.options()) {
                        this.options.put(option.id, option);
                        option.setParentConfig(this);
                    }
                }
            }
            if (modOptions.flagHooks() == null) continue;
            for (Page page : modOptions.flagHooks()) {
                this.registerHook((FlagHook)page);
            }
        }
    }

    private void applyOptionChanges() {
        Object object;
        Record record;
        Option option;
        int n;
        List<Option> list;
        Object2ReferenceOpenHashMap object2ReferenceOpenHashMap = new Object2ReferenceOpenHashMap();
        Object2ReferenceOpenHashMap object2ReferenceOpenHashMap2 = new Object2ReferenceOpenHashMap();
        for (ModOptions modOptions : this.modOptions) {
            Object object2;
            for (OptionOverride optionOverride : modOptions.overrides()) {
                if (optionOverride.target().y().equals(modOptions.configId())) {
                    throw new IllegalArgumentException("Override by mod '" + modOptions.configId() + "' targets its own option '" + String.valueOf(optionOverride.target()) + "'");
                }
                object2 = (OptionOverride)((Object)object2ReferenceOpenHashMap.put((Object)optionOverride.target(), (Object)optionOverride));
                if (object2 == null) continue;
                throw new IllegalArgumentException("Multiple overrides for option '" + String.valueOf(optionOverride.target()) + "'! Sources: " + object2.source() + " and " + optionOverride.source());
            }
            for (OptionOverlay optionOverlay : modOptions.overlays()) {
                if (optionOverlay.target().y().equals(modOptions.configId())) {
                    throw new IllegalArgumentException("Overlay by mod '" + modOptions.configId() + "' targets its own option '" + String.valueOf(optionOverlay.target()) + "'");
                }
                object2 = (OptionOverlay)((Object)object2ReferenceOpenHashMap2.put((Object)optionOverlay.target(), (Object)optionOverlay));
                if (object2 == null) continue;
                throw new IllegalArgumentException("Multiple overlays for option '" + String.valueOf(optionOverlay.target()) + "'! Sources: " + object2.source() + " and " + optionOverlay.source());
            }
        }
        for (ModOptions modOptions : this.modOptions) {
            for (Page page : modOptions.pages()) {
                for (OptionGroup optionGroup : page.groups()) {
                    list = optionGroup.options();
                    for (n = 0; n < list.size(); ++n) {
                        option = list.get(n);
                        record = (OptionOverride)((Object)object2ReferenceOpenHashMap.get((Object)option.id));
                        if (record == null) continue;
                        object = record.change();
                        this.exchangeOption(list, n, (Option)object, option);
                    }
                }
            }
        }
        for (ModOptions modOptions : this.modOptions) {
            for (Page page : modOptions.pages()) {
                for (OptionGroup optionGroup : page.groups()) {
                    list = optionGroup.options();
                    for (n = 0; n < list.size(); ++n) {
                        option = list.get(n);
                        record = (OptionOverlay)((Object)object2ReferenceOpenHashMap2.get((Object)option.id));
                        if (record == null) continue;
                        object = record.change();
                        try {
                            Object o = ((OptionBuilderImpl)object).buildWithBaseOption(option);
                            this.exchangeOption(list, n, (Option)o, option);
                            continue;
                        }
                        catch (Exception exception) {
                            throw new IllegalArgumentException("Failed to apply overlay from '" + record.source() + "' to option '" + String.valueOf(option.id) + "'", exception);
                        }
                    }
                }
            }
        }
    }

    private void collectApplyHooks() {
        for (Option option : this.options.values()) {
            StatefulOption statefulOption;
            Consumer<ConfigState> consumer;
            if (!(option instanceof StatefulOption) || (consumer = (statefulOption = (StatefulOption)option).getApplyHook()) == null) continue;
            this.registerHook(new Config$ApplyHookFlagHook(statefulOption.getApplyHookId(), consumer));
        }
    }

    void notifyStorageWrite(StorageEventHandler storageEventHandler) {
        this.pendingStorageHandlers.add(storageEventHandler);
    }
}

