
public class BooleansShortCircuits {

    public static void main(String[] args) {
        int friendship = 160;
        boolean isDayTime = true;
        boolean levelUp = true;
        boolean hasSunShard = false;
        boolean hasMoonShard = false;
        boolean knowsFairyType = true;
        int affectionLevels = 2;
        
        String pokemon = "Evee!";

        if (friendship >= 160 && isDayTime == true && levelUp == true) {
            pokemon = "Espeon";
            System.out.println(pokemon);
        } 
        else if (levelUp == true && hasSunShard == true) {
            pokemon = "Espeon";
            System.out.println(pokemon);
        } 
        else if (levelUp == true && friendship >= 160 && isDayTime == false){
            pokemon = "Umbreon";
            System.out.println(pokemon);
        }
        else if (levelUp == true && hasMoonShard == true){
            pokemon = "Umbreon";
            System.out.println(pokemon);
        }
        else if (levelUp == true && affectionLevels >= 2 && knowsFairyType == true){
            pokemon = "Sylveon";
            System.out.println(pokemon);
        }
        else if (levelUp == true && friendship>=160 && knowsFairyType == true){
            pokemon = "Sylveon";
            System.out.println(pokemon);
        }
        
        else System.out.println(pokemon);
    }
}
