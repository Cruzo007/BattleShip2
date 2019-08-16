package cruiserproductions.battleship2;

import java.io.Serializable;

/**
 * Created by Derpp on 4/1/2017.
 */

public class Move implements Serializable
{
    public int i;
    public int j;
    public String dir;
    public int img;
    Move(int i, int j)
    {
        this.i=i;
        this.j=j;
    }
    Move(int i,int j, int img)
    {
        this.i=i;
        this.j=j;
        this.img=img;
    }
    Move(int i, int j, String dir)
    {
        this.i=i;
        this.j=j;
        this.dir=dir;
    }
    void setImg(int img)
    {
        this.img=img;
    }
}
