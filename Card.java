package CardGame;
//Credit to Nick and Evan for help.
/**
 * Created by spencer.roth on 10/31/18.
 */
public class Card {

    private String Suite;
    private String Value;


    //Takes in value and suite and uses this.suite/this.value
    public Card(String suite, String value) {

        setSuite(suite);
        setValue(value);

    }



    //sets this.suite
    public void setSuite(String suite){
        this.Suite = suite;
    }

    //sets this.Value
    public void setValue(String value){
        this.Value = value;
    }


        public String getSuite(){
        return Suite;
        }
        public String getValue(){
            return Value;
        }






}
