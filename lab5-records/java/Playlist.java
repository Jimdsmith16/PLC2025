public class Playlist {

    public static class Person {
        public final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

    }

    public abstract static class Item {
        public final Float length_secs;

        public Item(Float length_secs) {
            this.length_secs = length_secs;
        }
    }

    public static class Piece extends Item {
        public final String name;
        public final Person performer;

        public Piece(String name, Person performer, Float length_secs) {
            super(length_secs);
            this.name = name;
            this.performer = performer;
        }

        @Override
        public String toString() {
            return String.format("%s by %s (%.1fs)", name, performer.toString(), length_secs);
        }
    }

    public static class Pause extends Item {
        public Pause(Float length_secs) {
            super(length_secs);
        }

        @Override
        public String toString() {
            return "Pause (" + length_secs + ")";
        }
    }

    private static Item piece1 = new Piece(
            "Moonlight Sonata",
            new Person("Claudio Arrau"),
            17 * 60 + 26f);

    private static Item pause1 = new Pause(5f);

    public static void main(String[] args) {
        System.out.println(piece1);
        System.out.println(pause1);
    }
}