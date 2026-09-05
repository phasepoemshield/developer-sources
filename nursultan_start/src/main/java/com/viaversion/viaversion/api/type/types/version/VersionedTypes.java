/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_20_5
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_2
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1
 */
package com.viaversion.viaversion.api.type.types.version;

import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_20_5;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_2;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_11;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes26_1;
import com.viaversion.viaversion.api.type.types.version.Types1_20_5;
import com.viaversion.viaversion.api.type.types.version.Types1_21;
import com.viaversion.viaversion.api.type.types.version.Types26_1;

public final class VersionedTypes {
    public static final Types1_20_5<StructuredDataKeys1_20_5, EntityDataTypes1_20_5> V1_20_5 = new Types1_20_5<StructuredDataKeys1_20_5, EntityDataTypes1_20_5>(StructuredDataKeys1_20_5::new, EntityDataTypes1_20_5::new);
    public static final Types1_21 V1_21 = new Types1_21(StructuredDataKeys1_20_5::new, EntityDataTypes1_21::new);
    public static final Types1_20_5<StructuredDataKeys1_21_2, EntityDataTypes1_21_2> V1_21_2 = new Types1_20_5<StructuredDataKeys1_21_2, EntityDataTypes1_21_2>(StructuredDataKeys1_21_2::new, EntityDataTypes1_21_2::new);
    public static final Types1_20_5<StructuredDataKeys1_21_2, EntityDataTypes1_21_2> V1_21_4 = new Types1_20_5<StructuredDataKeys1_21_2, EntityDataTypes1_21_2>(StructuredDataKeys1_21_2::new, EntityDataTypes1_21_2::new);
    public static final Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> V1_21_5 = new Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5>(StructuredDataKeys1_21_5::new, EntityDataTypes1_21_5::new);
    public static final Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5> V1_21_6 = new Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_5>(StructuredDataKeys1_21_5::new, EntityDataTypes1_21_5::new);
    public static final Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_9> V1_21_9 = new Types1_20_5<StructuredDataKeys1_21_5, EntityDataTypes1_21_9>(StructuredDataKeys1_21_5::new, EntityDataTypes1_21_9::new);
    public static final Types1_20_5<StructuredDataKeys1_21_11, EntityDataTypes1_21_11> V1_21_11 = new Types1_20_5<StructuredDataKeys1_21_11, EntityDataTypes1_21_11>(StructuredDataKeys1_21_11::new, EntityDataTypes1_21_11::new);
    public static final Types26_1<StructuredDataKeys1_21_11, EntityDataTypes26_1> V26_1 = new Types26_1<StructuredDataKeys1_21_11, EntityDataTypes26_1>(StructuredDataKeys1_21_11::new, EntityDataTypes26_1::new);
}

