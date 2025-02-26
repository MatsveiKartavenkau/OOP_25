public class Point {
    public double x;
    public double y;

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public String toSvg() {
        return "<circle r=\"5\" cx=\"" + x + "\" cy=\"" + y + "\" fill=\"black\" />";
    }

    public String toStringLine()
    {
        return "(" + x + ", " + y + ")";
    }

    public String toSvgLine()
    {
        return "<line x1=\"0\" y1=\"0\" x2=\"150\" y2=\"50\" stroke=\"blue\" stroke-width=\"5\" />";
    }





    public void translate(double dx, double dy)
    {
        this.x += dx;
        y += dy;
    }
    public Point translated(double dx, double dy)
    {
        Point newPoint = new Point();
        newPoint.x = x+dx;
        newPoint.y = y+dy;
        return newPoint;
    }


}
