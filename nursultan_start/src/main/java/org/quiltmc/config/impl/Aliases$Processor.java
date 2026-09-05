/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.Alias
 *  org.quiltmc.config.api.annotations.Alias$Builder
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.Alias;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.Aliases;

public final class Aliases$Processor
implements ConfigFieldAnnotationProcessor {
    public void process(Aliases aliases, MetadataContainerBuilder metadataContainerBuilder) {
        Alias[] aliasArray = aliases.value();
        int n = aliasArray.length;
        for (int i = 0; i < n; ++i) {
            String[] stringArray = aliasArray[i].value();
            int n2 = stringArray.length;
            for (int j = 0; j < n2; ++j) {
                MetadataType metadataType = Alias.TYPE;
                metadataContainerBuilder.metadata(metadataType, arg_0 -> Aliases$Processor.lambda$process$0(stringArray[j], arg_0));
            }
        }
    }

    private static /* synthetic */ void lambda$process$0(String string, Alias.Builder stringArray) {
        String[] stringArray2 = stringArray;
        String[] stringArray3 = new String[1];
        stringArray = stringArray3;
        stringArray3[0] = string;
        stringArray2.add(stringArray);
    }
}

