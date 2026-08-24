package kotlin.text

// $VF: Compiled from MatchResult.kt
@SinceKotlin(version = "1.1")
public interface MatchNamedGroupCollection : MatchGroupCollection {
   public abstract operator fun get(name: String): MatchGroup? {
   }
}
