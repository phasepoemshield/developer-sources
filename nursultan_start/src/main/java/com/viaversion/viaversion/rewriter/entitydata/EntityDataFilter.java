/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectFunction
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArraySet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntComparators
 *  com.viaversion.viaversion.libs.fastutil.ints.IntList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntListIterator
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter.entitydata;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.AbstractEntityDataTypes;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectFunction;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntArraySet;
import com.viaversion.viaversion.libs.fastutil.ints.IntComparators;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;
import com.viaversion.viaversion.libs.fastutil.ints.IntListIterator;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataHandler;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.Nullable;

public record EntityDataFilter(@Nullable EntityType type, boolean filterFamily, @Nullable EntityDataType dataType, int index, EntityDataHandler handler) {
    public boolean isFiltered(@Nullable EntityType type, EntityData entityData) {
        return !(this.index != -1 && entityData.id() != this.index || this.type != null && !this.matchesType(type) || this.dataType != null && entityData.dataType() != this.dataType);
    }

    public EntityDataFilter(EntityDataHandler handler) {
        this(null, true, null, -1, handler);
    }

    public EntityDataFilter(@Nullable EntityType type, boolean filterFamily, @Nullable EntityDataType dataType, int index, EntityDataHandler handler) {
        Preconditions.checkNotNull((Object)handler, (Object)"EntityDataHandler cannot be null");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ((Object)((Object)this)).getClass() != o.getClass()) {
            return false;
        }
        EntityDataFilter that = (EntityDataFilter)((Object)o);
        if (this.index != that.index) {
            return false;
        }
        if (this.filterFamily != that.filterFamily) {
            return false;
        }
        if (!this.handler.equals(that.handler)) {
            return false;
        }
        if (!Objects.equals(this.dataType, that.dataType)) {
            return false;
        }
        return Objects.equals(this.type, that.type);
    }

    public String toString() {
        return "EntityDataFilter{type=" + String.valueOf(this.type) + ", filterFamily=" + this.filterFamily + ", dataType=" + String.valueOf(this.dataType) + ", index=" + this.index + ", handler=" + String.valueOf(this.handler) + "}";
    }

    public int hashCode() {
        int result = this.handler.hashCode();
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.dataType != null ? this.dataType.hashCode() : 0);
        result = 31 * result + this.index;
        result = 31 * result + (this.filterFamily ? 1 : 0);
        return result;
    }

    private boolean matchesType(EntityType type) {
        if (type == null) {
            return false;
        }
        return this.filterFamily ? type.isOrHasParent(this.type) : this.type == type;
    }

    public static final class DataTypeMapper {
        private final IntList addedTypeIds = new IntArrayList();
        private final IntList removedTypeIds = new IntArrayList();
        private final IntSet skippedTypeIds = new IntArraySet();
        private final EntityRewriter<?, ?> rewriter;
        private final AbstractEntityDataTypes mappedDataTypes;

        public DataTypeMapper(EntityRewriter<?, ?> rewriter) {
            this.rewriter = rewriter;
            this.mappedDataTypes = rewriter.protocol().mappedTypes().entityDataTypes();
        }

        public void register() {
            if (this.addedTypeIds.isEmpty() && this.removedTypeIds.isEmpty() && this.skippedTypeIds.isEmpty()) {
                this.rewriter.filter().handler((event, data) -> {
                    EntityDataType dataType = this.mappedDataTypes.byId(data.dataType().typeId());
                    data.setDataType(dataType);
                });
                return;
            }
            this.addedTypeIds.sort(IntComparators.NATURAL_COMPARATOR);
            this.removedTypeIds.sort(IntComparators.OPPOSITE_COMPARATOR);
            this.rewriter.registerFilter(new EntityDataFilter((event, data) -> {
                EntityDataType mappedType = this.mappedType(data.dataType());
                if (mappedType != null) {
                    data.setDataType(mappedType);
                } else if (event.entityType() == null) {
                    event.cancel();
                }
            }));
        }

        public DataTypeMapper skip(EntityDataType dataType) {
            Preconditions.checkArgument((dataType.getClass() == this.rewriter.protocol().types().entityDataTypes().getDataTypeClass() ? 1 : 0) != 0);
            this.skippedTypeIds.add(dataType.typeId());
            return this;
        }

        public DataTypeMapper added(EntityDataType dataType) {
            Preconditions.checkArgument((dataType.getClass() == this.mappedDataTypes.getDataTypeClass() ? 1 : 0) != 0);
            this.addedTypeIds.add(dataType.typeId());
            return this;
        }

        public DataTypeMapper removed(EntityDataType dataType) {
            Preconditions.checkArgument((dataType.getClass() == this.rewriter.protocol().types().entityDataTypes().getDataTypeClass() ? 1 : 0) != 0);
            this.removedTypeIds.add(dataType.typeId());
            return this;
        }

        private int mappedTypeId(int typeId) {
            IntListIterator intListIterator = this.removedTypeIds.iterator();
            while (intListIterator.hasNext()) {
                int removedTypeId = (Integer)intListIterator.next();
                if (typeId <= removedTypeId) continue;
                --typeId;
            }
            intListIterator = this.addedTypeIds.iterator();
            while (intListIterator.hasNext()) {
                int addedTypeId = (Integer)intListIterator.next();
                if (typeId < addedTypeId) continue;
                ++typeId;
            }
            return typeId;
        }

        private @Nullable EntityDataType mappedType(EntityDataType dataType) {
            if (this.skippedTypeIds.contains(dataType.typeId()) || this.shouldCancel(dataType)) {
                return null;
            }
            int mappedId = this.mappedTypeId(dataType.typeId());
            return this.mappedDataTypes.byId(mappedId);
        }

        private boolean shouldCancel(EntityDataType dataType) {
            return !this.removedTypeIds.isEmpty() && this.removedTypeIds.contains(dataType.typeId());
        }
    }

    public static final class Builder {
        private final EntityRewriter<?, ?> rewriter;
        private EntityType type;
        private EntityDataType dataType;
        private int index = -1;
        private boolean filterFamily;
        private EntityDataHandler handler;

        public void removeIndex(int index) {
            Preconditions.checkArgument((this.index == -1 ? 1 : 0) != 0);
            this.handler((event, data) -> {
                int dataIndex = event.index();
                if (dataIndex == index) {
                    event.cancel();
                } else if (dataIndex > index) {
                    event.setIndex(dataIndex - 1);
                }
            });
        }

        public void addIndex(int index) {
            Preconditions.checkArgument((this.index == -1 ? 1 : 0) != 0);
            this.handler((event, data) -> {
                if (event.index() >= index) {
                    event.setIndex(event.index() + 1);
                }
            });
        }

        public Builder exactType(EntityType type) {
            Preconditions.checkArgument((this.type == null ? 1 : 0) != 0);
            this.type = type;
            this.filterFamily = false;
            return this;
        }

        public Builder index(int index) {
            Preconditions.checkArgument((this.index == -1 ? 1 : 0) != 0);
            this.index = index;
            return this;
        }

        public Builder(EntityRewriter<?, ?> rewriter) {
            this.rewriter = rewriter;
        }

        public Builder type(EntityType type) {
            Preconditions.checkArgument((this.type == null ? 1 : 0) != 0);
            this.type = type;
            this.filterFamily = true;
            return this;
        }

        public void register() {
            this.rewriter.registerFilter(this.build());
        }

        public void handler(EntityDataHandler handler) {
            Preconditions.checkArgument((this.handler == null ? 1 : 0) != 0);
            this.handler = handler;
            this.register();
        }

        public void cancel(int index) {
            this.index = index;
            this.handler((event, data) -> event.cancel());
        }

        public void toIndex(int newIndex) {
            Preconditions.checkArgument((this.index != -1 ? 1 : 0) != 0);
            this.handler((event, data) -> event.setIndex(newIndex));
        }

        public EntityDataFilter build() {
            Preconditions.checkNotNull((Object)this.handler, (Object)"EntityDataHandler cannot be null");
            return new EntityDataFilter(this.type, this.filterFamily, this.dataType, this.index, this.handler);
        }

        public Builder dataType(EntityDataType dataType) {
            Preconditions.checkArgument((this.dataType == null ? 1 : 0) != 0);
            this.dataType = dataType;
            return this;
        }

        public void mapDataType(Int2ObjectFunction<EntityDataType> updateFunction) {
            this.handler((event, data) -> {
                EntityDataType mappedType = (EntityDataType)updateFunction.apply(data.dataType().typeId());
                if (mappedType != null) {
                    data.setDataType(mappedType);
                } else {
                    event.cancel();
                }
            });
        }

        public Builder handlerNoRegister(EntityDataHandler handler) {
            Preconditions.checkArgument((this.handler == null ? 1 : 0) != 0);
            this.handler = handler;
            return this;
        }
    }
}

