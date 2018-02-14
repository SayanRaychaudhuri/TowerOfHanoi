public class TowerOfHanoi{

	public static void main(String args[])
    {
        hanoi(3, 1, 3, 2);
    }
	
    public static void hanoi(int n, int start, int end, int intermediate){
        if (n == 1) {
            System.out.println("move disk 1 from peg " +  start + " to peg " + end);
            return;
        }
        hanoi(n-1, start, intermediate, end);
        System.out.println("move disk " + n + " from peg " +  start + " to peg " + end);
        hanoi(n-1, intermediate, end, start);
    }

}