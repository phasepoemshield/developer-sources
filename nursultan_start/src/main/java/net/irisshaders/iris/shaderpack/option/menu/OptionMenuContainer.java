/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.option.menu;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.ProfileSet;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElementScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuMainElementScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuOptionElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuSubElementScreen;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public class OptionMenuContainer {
    public final OptionMenuElementScreen mainScreen;
    public final Map<String, OptionMenuElementScreen> subScreens = new HashMap<String, OptionMenuElementScreen>();
    private final List<OptionMenuOptionElement> usedOptionElements = new ArrayList<OptionMenuOptionElement>();
    private final List<String> usedOptions = new ArrayList<String>();
    private final List<String> unusedOptions = new ArrayList<String>();
    private final Map<List<OptionMenuElement>, Integer> unusedOptionDumpQueue = new HashMap<List<OptionMenuElement>, Integer>();
    private final ProfileSet profiles;

    public OptionMenuContainer(ShaderProperties shaderProperties, ShaderPackOptions shaderPackOptions, ProfileSet profileSet) {
        this.profiles = profileSet;
        this.mainScreen = new OptionMenuMainElementScreen(this, shaderProperties, shaderPackOptions, shaderProperties.getMainScreenOptions().orElseGet(() -> Collections.singletonList("*")), shaderProperties.getMainScreenColumnCount());
        this.unusedOptions.addAll((Collection<String>)shaderPackOptions.getOptionSet().getBooleanOptions().keySet());
        this.unusedOptions.addAll((Collection<String>)shaderPackOptions.getOptionSet().getStringOptions().keySet());
        Map<String, Integer> map = shaderProperties.getSubScreenColumnCount();
        shaderProperties.getSubScreenOptions().forEach((string, list) -> this.subScreens.put((String)string, new OptionMenuSubElementScreen((String)string, this, shaderProperties, shaderPackOptions, (List<String>)list, Optional.ofNullable((Integer)map.get(string)))));
        for (Map.Entry<List<OptionMenuElement>, Integer> entry : this.unusedOptionDumpQueue.entrySet()) {
            ArrayList<OptionMenuElement> arrayList = new ArrayList<OptionMenuElement>();
            ArrayList arrayList2 = Lists.newArrayList(this.unusedOptions);
            for (String string2 : arrayList2) {
                try {
                    OptionMenuElement optionMenuElement = OptionMenuElement.create(string2, this, shaderProperties, shaderPackOptions);
                    if (optionMenuElement == null) continue;
                    arrayList.add(optionMenuElement);
                    if (!(optionMenuElement instanceof OptionMenuOptionElement)) continue;
                    this.notifyOptionAdded(string2, (OptionMenuOptionElement)optionMenuElement);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    Iris.logger.warn((Throwable)illegalArgumentException);
                    arrayList.add(OptionMenuElement.EMPTY);
                }
            }
            entry.getKey().addAll(entry.getValue(), arrayList);
        }
    }

    public ProfileSet getProfiles() {
        return this.profiles;
    }

    public void notifyOptionAdded(String string, OptionMenuOptionElement optionMenuOptionElement) {
        if (!this.usedOptions.contains(string)) {
            this.usedOptionElements.add(optionMenuOptionElement);
            this.usedOptions.add(string);
        }
        this.unusedOptions.remove(string);
    }

    public void queueForUnusedOptionDump(int n, List<OptionMenuElement> list) {
        this.unusedOptionDumpQueue.put(list, n);
    }
}

