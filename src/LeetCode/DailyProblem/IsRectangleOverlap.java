package LeetCode.DailyProblem;

public class IsRectangleOverlap {

    /**
     * 已完成
     */
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int a1_x_min = Math.min(rec1[0], rec1[2]);
        int a1_x_max = Math.max(rec1[0], rec1[2]);
        int a1_y_min = Math.min(rec1[1], rec1[3]);
        int a1_y_max = Math.max(rec1[1], rec1[3]);
        int a2_x_min = Math.min(rec2[0], rec2[2]);
        int a2_x_max = Math.max(rec2[0], rec2[2]);
        int a2_y_min = Math.min(rec2[1], rec2[3]);
        int a2_y_max = Math.max(rec2[1], rec2[3]);
        System.out.println("a1_x_min:" + a1_x_min);
        System.out.println("a1_x_max:" + a1_x_max);
        System.out.println("a1_y_min:" + a1_y_min);
        System.out.println("a1_y_max:" + a1_y_max);
        System.out.println("a2_x_min:" + a2_x_min);
        System.out.println("a2_x_max:" + a2_x_max);
        System.out.println("a2_y_min:" + a2_y_min);
        System.out.println("a2_y_max:" + a2_y_max);
        return !(a1_y_min >= a2_y_max || a1_x_max <= a2_x_min || a2_y_min >= a1_y_max || a2_x_max <= a1_x_min);

    }

    public static void main(String[] args) {
        //rec1 = [0,0,2,2], rec2 = [1,1,3,3]
        //rec1 = [0,0,1,1], rec2 = [1,0,2,1]
        //{X1,Y1,X2,Y2}
        int[] array1 = {0, 0, 1, 1};
        int[] array2 = {0, 0, 2, 1};

        System.out.println(isRectangleOverlap(array1, array2));
    }
}
