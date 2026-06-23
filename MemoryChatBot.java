import java.util.Scanner;

public class MemoryChatBot{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        String userName = "";
        String favColor = "";
        String age = "";


        while(true){
            System.out.print("You: ");
            String user = sc.nextLine().trim().toLowerCase();

            if(user.equals("bye")){
                System.out.println("Gold Fish: Bye!");
                break;
            }

            else if(user.equals("hello")){
                System.out.println("Gold Fish: Hello! How can I help you?");
            }
            else if(user.startsWith("my name is ")){

                userName = user.substring(11).trim();

                System.out.println("Gold Fish: Nice to meet you "+userName +"!");
            }
            else if(user.equals("what is my name")){

                if(!userName.isEmpty()) {
                    System.out.println("Gold Fish: Your name is " + userName + ".");
                }else{
                    System.out.println("Gold Fish: I don't know your name.");
                }
            }
            else if(user.startsWith("my age is ")){

                age = user.substring(10).trim();

                System.out.println("Gold Fish: your Age is "+age+ ".");
            }
            else if(user.equals("what is my age")){
                if(!age.isEmpty()){
                    System.out.println("Gold Fish: Your age is "+age+".");
                }else{
                    System.out.println("Gold Fish: I don't know your age");
                }
                
            }
            else if(user.startsWith("my fav color is")){

                favColor = user.substring(16).trim();

                System.out.println("Gold Fish: Your fav color is "+favColor+".");
                
            }
            else if(user.equals("what is my fav color")){
                if(!favColor.isEmpty()){
                    System.out.println("Gold Fish: Your fav color is "+favColor+".");
                }else{
                    System.out.println("Gold Fish: I don't know your fav color.");
                }
            }
            else if(user.equals("tell me about me")){
                System.out.println("Gold Fish: ");
                System.out.println("Name: "+userName);
                System.out.println("Age: "+age);
                System.out.println("Fav color: "+favColor);
            }
            else{
                System.out.println("Gold Fish: I dont understand.");
            }
        }
        sc.close();
    }

}