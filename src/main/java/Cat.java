import javax.ejb.Stateless;

@Stateless
public class Cat {

    private String voice;

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }


}
