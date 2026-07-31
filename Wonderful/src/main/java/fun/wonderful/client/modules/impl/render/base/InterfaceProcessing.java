package fun.wonderful.client.modules.impl.render.base;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.draggable.Draggable;
import lombok.Generated;

public class InterfaceProcessing
implements QClient {
    public final Draggable draggable;
    private boolean unusualRectType = false;

    public boolean isUnusualRectType() {
        return this.unusualRectType;
    }

    public void setUnusualRectType(boolean unusualRectType) {
        this.unusualRectType = unusualRectType;
    }

    public void onUpdate(EventUpdate eventUpdate) {
    }

    public void onRender(EventRender.Default eventRender) {
    }

    @Generated
    public InterfaceProcessing(Draggable draggable) {
        this.draggable = draggable;
    }
}