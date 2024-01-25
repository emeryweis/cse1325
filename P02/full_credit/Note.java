public class Note{
    
    //default constructor
    public Note() {
        pitch = null;
    }
    //constructor w/ parameters
    public Note(Pitch pitch, int octave) {
        this.pitch = pitch;
        if (octave < -5) octave = -5;
        if (octave > 4) octave = 4;
    }
    //toString method including override
    @Override
    public String toString() {
        if(pitch == null) return " ";
        else {
            if (octave != 0) {
                return (pitch.toString() + octave);
            }
        }
        
    }
    
    //private fields
    private Pitch pitch;
    private int octave;

}