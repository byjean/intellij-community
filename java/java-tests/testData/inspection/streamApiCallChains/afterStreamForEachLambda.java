// "Replace Collection.stream().forEach() with Collection.forEach() (may change semantics)" "true"

import java.util.Arrays;

class Test {
  void print() {
    Arrays.asList('d', 'e', 'f').forEach(c -> System.out.print(" " + c));
  }
}