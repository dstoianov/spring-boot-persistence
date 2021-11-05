package se.techinsight.persistence.util;

import lombok.Value;


/* or use it directly from string
  org.springframework.data.util.Pair

  or since Java 14 use records, records are immutable.

  record Pair<A, B>(A first, B second) {}

 */
@Value(staticConstructor = "of")
public class Pair<L, R> {
    L left;
    R right;
}
