class LineComparisonComputation
{

static double d;
static double distance(int x1, int y1, int x2, int y2)
{

    d = Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) * 1.0);
    return d;
}
    public static void main (String[] args)
    {
        System.out.println(Math.round(distance(3, 4, 4, 3)*100000.0)/100000.0);
    }
}
