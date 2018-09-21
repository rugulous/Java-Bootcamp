import java.util.Scanner;

public class MyMazeGame{
  
  public static void main(String[] args){
    
    Scanner reader = new Scanner(System.in);
    
    Maze maze = new Maze(0);
    
    while(!maze.completed){
      System.out.println(maze.displayMaze());
      boolean moved = false;
      while(!moved){
        String dir = reader.nextLine();
        char d = dir.charAt(0);
        
        if(d == 'n'||d == 'N'){
          moved = maze.move(0);
        } else if(d == 'e'||d == 'E'){
          moved = maze.move(1);
        } else if(d == 's'||d == 'S'){
          moved = maze.move(2);
        } else if(d == 'w'||d == 'W'){
          moved = maze.move(3);
        } 
        
        if(!moved){
          System.out.println("Please enter a valid direction!");
        }
        
      }
    }
    
  }
  
}

public class Tile{
  public boolean[] walls;
  
  public Tile(boolean n, boolean e, boolean s, boolean w){
    walls = new boolean[4];
    walls[0] = n;
    walls[1] = e;
    walls[2] = s;
    walls[3] = w;
  }
  
}


public class Maze{
  
  protected Tile[][] data;
  
  protected int playerX;
  protected int playerY;
  
  boolean completed;
  
  public Maze(int levelID){
    
    completed = false;
    
    data = new Tile[8][6];
    
    playerX = 5;
    playerY = 0;
    
    for(int y = 0; y < 8; y++){
      
      for(int x = 0; x < 6; x++){
        
        data[y][x] = new Tile(false,false,false,false);
        
      }
      
    }
    
    for(int y = 0; y < 8; y++){
      data[y][0].walls[3] = true;
      data[y][5].walls[1] = true;
    }
    
    for(int x = 0; x < 6; x++){
      data[0][x].walls[0] = true;
      data[7][x].walls[2] = true;
    }
    
    data[0][0].walls[1] = true;
    data[0][2].walls[1] = true;
    data[0][4].walls[1] = true;
    //data[0][5].walls[1] = false;
    
    data[1][1].walls[0] = true;
    data[1][3].walls[1] = true;
    data[1][4].walls[0] = true;
    
    data[2][0].walls[0] = true;
    data[2][0].walls[1] = true;
    data[2][1].walls[1] = true;
    data[2][2].walls[0] = true;
    data[2][2].walls[1] = true;
    data[2][4].walls[1] = true;
    data[2][5].walls[0] = true;
    
    data[3][0].walls[1] = true;
    data[3][3].walls[0] = true;
    data[3][4].walls[0] = true;
    
    data[4][1].walls[1] = true;
    data[4][2].walls[0] = true;
    data[4][2].walls[1] = true;
    data[4][3].walls[1] = true;
    data[4][4].walls[0] = true;
    data[4][4].walls[1] = true;
    
    data[5][0].walls[1] = true;
    data[5][1].walls[0] = true;
    data[5][1].walls[1] = true;
    data[5][2].walls[1] = true;
    data[5][3].walls[0] = true;
    
    data[6][0].walls[1] = true;
    data[6][1].walls[1] = true;
    data[6][2].walls[1] = true;
    data[6][3].walls[1] = true;
    data[6][4].walls[1] = true;
    
    data[7][1].walls[1] = true;
    data[7][3].walls[0] = true;
    data[7][4].walls[0] = true;
  }
  
  public boolean move(int dir){
    
    if(dir == 0){
      if(playerY-1 < 0 || data[playerY][playerX].walls[0]){
        return false;
      } else {
        playerY -= 1;
        return true;
      }
    }
    
    if(dir == 1){      
      if(playerX + 1 > 5 || data[playerY][playerX].walls[1]){
        return false;
      } else {
        playerX += 1;
      }      
    }
    
    if(dir == 2){
      if(playerY+1 > 7 || data[playerY + 1][playerX].walls[0]){
        return false;
      } else {
        playerY += 1;
      }
    }
    
    if(dir == 3){      
      if(playerX - 1 < 0 || data[playerY][playerX - 1].walls[1]){
        return false;
      } else {
        playerX -= 1;
      }      
    }
    
    return false;
    
  }
  
  public String displayMaze(){
    
    String maze = "";
    
    for(int y = 0; y < 8; y++){
    String row_top = "";
    String row_middle = "";
    String row_bottom = "";
      for(int x = 0; x < 6; x++){
        
        if(data[y][x].walls[0]){
          row_top += "---";
        } else {
          if(data[y][x].walls[3]){
          row_top += "| ";
        	} else {
          row_top += "  ";
        }
          
          if(data[y][x].walls[1]){
          row_top += "|";
        	} else {
          row_top += " ";
        }
          
        }
        
        if(data[y][x].walls[2]){
          row_bottom += "---";
        } else {
          if(data[y][x].walls[3]){
          row_bottom += "| ";
        	} else {
          row_bottom += "  ";
        }
          if(data[y][x].walls[1]){
          row_bottom += "|";
        	} else {
          row_bottom += " ";
        }
        }
        
        if(data[y][x].walls[3]){
          row_middle += "|";
        } else {
          row_middle += " ";
        }
        
        if(x == playerX && y == playerY){
          row_middle += "@";
        } else {
          row_middle += " ";
        }
        
        if(data[y][x].walls[1]){
          row_middle += "|";
        } else {
          row_middle += " ";
        }
        
        
      }
      
      
        maze += row_top + "\n";
        maze += row_middle + "\n";
        maze += row_bottom + "\n";
      
    }
    
    return maze;
    
  }
  
}