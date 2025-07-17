import java.util.Stack;
public class stack{
    public static void main(String args[]){
        Stack<String> stack=new Stack<String>();
        //System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("GTAV");
        stack.push("Borderlands");
        stack.push("FIFA");
        stack.pop();//removes FIFA
        stack.pop();//removes BOrderlands
        stack.pop();//removes GTAV
        System.out.println(stack);
    }
}
