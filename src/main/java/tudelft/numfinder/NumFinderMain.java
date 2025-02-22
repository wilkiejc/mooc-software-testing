package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        tudelft.numfinder.NumFinder nf = new tudelft.numfinder.NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {4, 3, 2, 1, 0, -1});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
