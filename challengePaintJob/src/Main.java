public class Main {

    public static void main(String[] args) {
//        System.out.println(5 * 1.5);
//        System.out.println(3.4 * 2.1);
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        System.out.println("*****Calculation with width, height, areaPerBucket and extraBucktes*****");
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            System.out.println("Invalid inputs");
            return -1;
        } else {
            double wallArea = width * height;
            System.out.println("Total wall area " + wallArea);
            double areaCoveredByExtraBuckets = extraBuckets * areaPerBucket;
            System.out.println("Area covered by " + extraBuckets + " extra buckets is " + areaCoveredByExtraBuckets);

            if (areaCoveredByExtraBuckets >= wallArea) {
                return 0;
            } else {
                double remainingArea = wallArea - areaCoveredByExtraBuckets;
                System.out.println("Reaming area to be covered " + remainingArea);
                int remainingRequiredBuckets =  (int) (Math.round(remainingArea / areaPerBucket));
                System.out.println("Remaining buckets required " + remainingRequiredBuckets);
                return remainingRequiredBuckets;
            }
        }
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        System.out.println("*****Calculation without extraBucktes*****");
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid inputs");
            return -1;
        } else {
            double wallArea = width * height;
            System.out.println("Total wall area " + wallArea);
            int remainingRequiredBuckets =  (int) (Math.round(wallArea / areaPerBucket));
            System.out.println("Remaining buckets required " + remainingRequiredBuckets);
            return remainingRequiredBuckets;
        }
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        System.out.println("*****Calculation without width, height and extraBucktes*****");
        if (area <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid inputs");
            return -1;
        } else {
            double wallArea = area;
            System.out.println("Total wall area " + wallArea);
            int remainingRequiredBuckets =  (int) (Math.ceil(wallArea / areaPerBucket));
            System.out.println("Remaining buckets required " + remainingRequiredBuckets);
            return remainingRequiredBuckets;
        }
    }

}
