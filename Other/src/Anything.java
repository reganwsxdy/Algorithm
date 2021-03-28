package src;

public class Anything {
    public static void main(String[] args) {
        generalMethod("1",2,new Worker());
    }
    public static <T> void generalMethod(T...inputArray){
        for(T element : inputArray){
            if (element instanceof Integer){
                System.out.println("disposing Integer...");
            }else if (element instanceof String){
                System.out.println("disposing String...");
            }else if (element instanceof Double){
                System.out.println("disposing Double...");
            }else if(element instanceof Float){
                System.out.println("disposing Float...");
            }else if (element instanceof Long){
                System.out.println("disposing Long...");
            }else if (element instanceof Boolean){
                System.out.println("disposing Boolean...");
            }else if (element instanceof Worker){
                System.out.println("disposing Worker...");
            }
        }
    }
}
