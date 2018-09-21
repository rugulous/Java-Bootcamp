public class TimesTable{
  
  public static void main(String[] args){
    
    String divider = "+---------------+";
    
    for(int i = 1; i < 13; i++){
      System.out.println(divider);
      for(int j = 1; j < 13; j++){
        String line = "| " + i + " x " + j + " = " + (i*j);
        while(line.length() + 1 < divider.length()){
          line += " ";
        }
        line += "|";
        System.out.println(line);
      }
      System.out.println(divider);    
      System.out.println();
    }
    
  }
  
}