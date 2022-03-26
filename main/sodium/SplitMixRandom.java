//code blatantly stolen from fabric :)

package main.sodium;

public class SplitMixRandom {
    private static final long PHI = 0x9E3779B97F4A7C15L;

    private long x;

    public SplitMixRandom(final long seed) {
        this.setSeed(seed);
    }

    private static long staffordMix13(long z) {
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;

        return z ^ (z >>> 31);
    }

    public long nextLong() {
        return staffordMix13(this.x += PHI);
    }

    public void setSeed(final long seed) {
        this.x = murmurHash3(seed);
    }

    public static long murmurHash3(long x) {
        x ^= x >>> 33;
        x *= 0xff51afd7ed558ccdL;
        x ^= x >>> 33;
        x *= 0xc4ceb9fe1a85ec53L;
        x ^= x >>> 33;
        return x;
    }
}
