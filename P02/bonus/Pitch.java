public enum Pitch {
    C("C"), Db("D♭"), D("D"), Eb("E♭"), E("E"), F("F"), Gb("G♭"), G("G"), Ab("A♭"), A("A"), Bb("B♭"), B("B");

    private final String sign;

    private Pitch(String sign){
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }

};


