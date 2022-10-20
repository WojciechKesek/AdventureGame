import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        locations.put(0, new Location(0, "You are in front of computer"));
        locations.put(1, new Location(1, "You are at the end of a road"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building"));
        locations.put(4, new Location(4, "You are in a valley"));
        locations.put(5, new Location(5, "You are in the forest"));

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            loc = scan.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You cant go there");
            }
        }

    }
}