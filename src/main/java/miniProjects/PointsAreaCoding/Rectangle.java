package miniProjects.PointsAreaCoding;

class Rectangle{
    Point first;
    Point second;

    public Rectangle(Point first, Point second){
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o){
        Rectangle recExtr;
        try{
            recExtr = (Rectangle) o;
        } catch(Exception e){
            return false;
        }
        if(this.first.equals(recExtr.first)&&this.second.equals(recExtr.second)){
            return true;
        } else if(this.second.equals(recExtr.first)&&this.first.equals(recExtr.second)){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return this.first.hashCode()&this.second.hashCode();
    }

    public int getArea(){
        return Math.abs(this.first.x-this.second.x)*Math.abs(this.first.y-this.second.y);
    }
}
