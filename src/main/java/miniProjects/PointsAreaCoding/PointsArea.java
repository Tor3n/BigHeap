package miniProjects.PointsAreaCoding;

import java.util.*;

public class PointsArea {
    ArrayList<Point> points;
    Set<Rectangle> rectangles;
    ArrayList<Rectangle> biggestEmptyRect;

    public PointsArea(){
        setPoints();
        rectangles = new HashSet<Rectangle>();
        biggestEmptyRect = new ArrayList<>();
        /*biggestEmptyRect = new TreeSet<Rectangle>(new Comparator<Rectangle>(){
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return o1.getArea()-o2.getArea();
            }
        });*/

        System.out.println("points size: "+points.size());
        for (int i = 0; i < points.size(); i++) {

            for (int j = i; j < points.size(); j++) {
                Rectangle cur = new Rectangle(points.get(i),points.get(j));
                if(cur.getArea()>0){
                    rectangles.add(cur);
                }
            }
        }

        upper:for(Rectangle re : rectangles){
            int area = re.getArea();
            if (area>0){
                int x1=re.first.x;
                int x2=re.second.x;
                int y1=re.first.y;
                int y2=re.second.y;

                int minX=Math.min(x1,x2);
                int minY=Math.min(y1,y2);
                int deltaX=Math.abs(x1-x2);
                int deltaY=Math.abs(y1-y2);

                for(Point pe: points){
                    int xP=pe.x;
                    int yP=pe.y;
                    if((xP>minX&&yP>minY)&&((xP<minX+deltaX)&&(yP<minY+deltaY))){
                        continue upper;
                    }
                }

                biggestEmptyRect.add(re);
            }
        }

        System.out.println("rectangles size: "+rectangles.size());
        for(Rectangle rrr:rectangles){
            System.out.println("rect: "+rrr.getArea()+", x: "+rrr.first.x+", y: "+rrr.first.y+", x: "+rrr.second.x+", y: "+rrr.second.y);
        }

        System.out.println("*********************************");
        System.out.println("biggestEmpty size: "+biggestEmptyRect.size());
        System.out.println("Sizes:");
        for(Rectangle rr:biggestEmptyRect){
            System.out.println("rect: "+rr.getArea()+", x: "+rr.first.x+", y: "+rr.first.y+", x: "+rr.second.x+", y: "+rr.second.y);
        }

    }

    public static void main(String[] args) {
        PointsArea pp = new PointsArea();
        pp.setPoints();
        pp.rectangles = new HashSet<Rectangle>();
        pp.biggestEmptyRect = new ArrayList<>();
        /*pp.biggestEmptyRect = new TreeSet<Rectangle>(new Comparator<Rectangle>(){
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return o1.getArea()-o2.getArea();
            }
        });*/

        System.out.println("points size: "+pp.points.size());
        for (int i = 0; i < pp.points.size(); i++) {

            for (int j = i; j < pp.points.size(); j++) {
                Rectangle cur = new Rectangle(pp.points.get(i),pp.points.get(j));
                if(cur.getArea()>0){
                    pp.rectangles.add(cur);
                }
            }
        }

        upper:for(Rectangle re : pp.rectangles){
            int area = re.getArea();
            if (area>0){
                int x1=re.first.x;
                int x2=re.second.x;
                int y1=re.first.y;
                int y2=re.second.y;

                int minX=Math.min(x1,x2);
                int minY=Math.min(y1,y2);
                int deltaX=Math.abs(x1-x2);
                int deltaY=Math.abs(y1-y2);

                for(Point pe: pp.points){
                    int xP=pe.x;
                    int yP=pe.y;
                    if((xP>minX&&yP>minY)&&((xP<minX+deltaX)&&(yP<minY+deltaY))){
                        continue upper;
                    }
                }

                pp.biggestEmptyRect.add(re);
            }
        }

        System.out.println("biggestEmpty size: "+pp.biggestEmptyRect.size());
        System.out.println("Sizes:");
        for(Rectangle rr:pp.biggestEmptyRect){
            System.out.println(rr.getArea());
        }

    }

    public void setPoints(){
        points = new ArrayList<>(Arrays.asList(new Point[]{new Point(17,17), new Point(28,28), new Point(40,70), new Point(90,100), new Point(160,250), new Point(120,150), new Point(40,20) }));
        //points = new ArrayList<>(Arrays.asList(new Point[]{ new Point(40,70), new Point(10,10) }));

    }


}
