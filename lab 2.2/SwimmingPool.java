public class SwimmingPool{
  
  public static void main(String[] args){
    Pool pool = new Pool(25,10,1.5);
    System.out.println(pool.getDimensions(true));
    System.out.println(pool.getDimensions(false));
  }
  
}

public class Pool{
    double length;
    double width;
    double depth;
    
    public Pool(double l, double w, double d){
      length = l;
      width = w;
      depth = d;
    }
    
    public double getVolumeInMetres(){
      return length * width * depth;
    }
  
  public double getVolumeInLitres(){
    return getVolumeInMetres() * 1000;
  }
  
    
    public String getDimensions(boolean metres){
      String volume;
      
      if(metres){
        volume = getVolumeInMetres() + " cubic metres ";
      } else {
        volume = getVolumeInLitres() + " litres ";
      }
      
      return "A pool of length " + length + ", width " + width + " and depth " + depth + " will require " + volume + "of water to fill it.";
    }
    
  }