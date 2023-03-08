class Computer{

    // Defining a void method: meaning it does not expect anything as return when this method is executed 
    public void playMusic(){
        System.out.println("Play music...");
    }

    // Defining a method that return a String when called 
    public String openVSCode(int n){
        if (n >= 10)
            return "Opening VS Code";
        else
            return "VS Code not found";
    }

}

public class OopsCont {

    public static void main(String args[]){

        // Defining a class in the public class main function and assigning a
        //  reference variable with which methods in the class could be called
        Computer comp = new Computer();
        
        comp.playMusic();

        // String str = comp.openVSCode(5);
        String str = comp.openVSCode(50);
        System.out.println(str);
    }
    
}
