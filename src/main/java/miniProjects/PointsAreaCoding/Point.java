package miniProjects.PointsAreaCoding;

class Point{
    public int x;
    public int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Point)){
            return false;
        }
        Point pointExtr;
        try{
            pointExtr = (Point) o;
        }catch(Exception e){
            return false;
        }

        if((this.x==pointExtr.x)&&(this.y==pointExtr.y)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return x&y;
    }

}
