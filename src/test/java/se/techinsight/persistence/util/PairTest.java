package se.techinsight.persistence.util;

import org.junit.jupiter.api.Test;


class PairTest {

    @Test
    void name() {
        var pair = Pair.of("Test", 234.23d);
        String left = pair.getLeft();
        Double right = pair.getRight();
    }
}