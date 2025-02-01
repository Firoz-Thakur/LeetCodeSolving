package org.problems.pqueues;

public class Pairx implements Comparable<Pairx> {
        Integer count;
        Character chr;
        public Pairx(Integer count, Character chr)
        {
                this.count=count;
                this.chr=chr;
        }
        @Override
        public int compareTo(Pairx other) {
                return Integer.compare(other.count, this.count);
        }
}
