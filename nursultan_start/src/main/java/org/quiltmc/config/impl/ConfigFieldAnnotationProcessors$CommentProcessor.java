/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.Comment
 *  org.quiltmc.config.api.annotations.Comment$Builder
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$CommentProcessor
implements ConfigFieldAnnotationProcessor {
    /* synthetic */ ConfigFieldAnnotationProcessors$CommentProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    private ConfigFieldAnnotationProcessors$CommentProcessor() {
    }

    public void process(Comment comment, MetadataContainerBuilder metadataContainerBuilder) {
        String[] stringArray = comment.value();
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            MetadataType metadataType = Comment.TYPE;
            metadataContainerBuilder.metadata(metadataType, arg_0 -> ConfigFieldAnnotationProcessors$CommentProcessor.lambda$process$0(stringArray[i], arg_0));
        }
    }

    private static /* synthetic */ void lambda$process$0(String string, Comment.Builder stringArray) {
        String[] stringArray2 = stringArray;
        String[] stringArray3 = new String[1];
        stringArray = stringArray3;
        stringArray3[0] = string;
        stringArray2.add(stringArray);
    }
}

