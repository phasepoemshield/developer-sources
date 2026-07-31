package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.client.render.chunk.ChunkBuilder;

@Data
@AllArgsConstructor
public class EventRenderChunk extends EventCancellable implements Event {
    private ChunkBuilder.BuiltChunk chunkRender;
}
