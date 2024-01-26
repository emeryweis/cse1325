public enum Pitch {
    C, Db("♭"), D, Eb("♭"), E, F, Gb("♭"), G, Ab("♭"), A, Bb("♭"), B;

    private final String flat;

    private Pitch(String flat){
        this.flat = flat;
    }

    @Override
    public String toString() {
        return this.name() + flat;
    }

};


