package kotlin.text

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from MatchResult.kt
public interface MatchGroupCollection : KMappedMarker, java.util.Collection {
   public abstract operator fun get(index: Int): MatchGroup? {
   }
}
