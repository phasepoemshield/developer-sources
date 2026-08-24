package kotakbaz.rain.event.events

import oxxxde.سض

// $VF: Compiled from ChatMessageEvent.kt
public class ChatMessageEvent(text: String, send: Boolean) : سض {
   public final var text: String
   public final val send: Boolean

   init {
      this.text = text
      this.send = send
   }
}
