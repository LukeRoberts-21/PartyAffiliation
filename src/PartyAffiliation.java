import java.util.Scanner;

public class PartyAffiliation
{
    static void main() {
        Scanner in = new Scanner(System.in);
        String partyAffiliation;
        System.out.print("What is your political party affiliation, Democrat, Republican or Independent [DRT]: ");
        partyAffiliation = in.nextLine();
        if (partyAffiliation.equals("D")||partyAffiliation.equals("d"))
        {
            System.out.println("You get the Democratic Donkey");
    }else if (partyAffiliation.equals("R")||partyAffiliation.equals("r")) {
            System.out.println("You get the Republican Elephant");
        }else if (partyAffiliation.equals("I")||partyAffiliation.equals("i")){
            System.out.println("You get the Independent Man");
        }
        else{
            System.out.println("You entered some other party");
        }

    }
}
