/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.Map;
import net.irisshaders.iris.shaderpack.option.BooleanOption;
import net.irisshaders.iris.shaderpack.option.StringOption;

class OptionAnnotatedSource$AnnotationsBuilder {
    final ImmutableMap.Builder<Integer, BooleanOption> booleanOptions = ImmutableMap.builder();
    final ImmutableMap.Builder<Integer, StringOption> stringOptions = ImmutableMap.builder();
    final ImmutableMap.Builder<Integer, String> diagnostics = ImmutableMap.builder();
    final Map<String, IntList> booleanDefineReferences = new HashMap<String, IntList>();

    OptionAnnotatedSource$AnnotationsBuilder() {
    }
}

