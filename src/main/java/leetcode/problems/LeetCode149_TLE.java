package leetcode.problems;

import java.util.*;

/**
 * @author aiwujingxin@gmail.com
 * @date 2022/7/11 21:15
 */
public class LeetCode149_TLE {

    // right but tle
    public static void main(String[] args) {
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}})); //3

        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}})); //4
//
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{1, 0}, {0, 0}})); //2
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{0, 1}, {0, 0}})); //2
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{0, 0}})); //1
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{4, 5}, {4, -1}, {4, 0}})); //3
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{4, 5}, {4, -1}, {4, 0}})); //3
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{2, 3}, {1, 1}})); //2
        System.out.println(new LeetCode149_TLE().maxPoints(new int[][]{{-27, -31}, {-81, 44}, {-101, -138}, {-120, -46}, {-143, -71}, {109, 25}, {-66, 93}, {-106, 143}, {75, -148}, {-136, -25}, {123, 118}, {37, -133}, {78, 22}, {16, 121}, {-16, 96}, {-137, -116}, {118, 68}, {12, 10}, {122, 24}, {-114, 33}, {-111, -9}, {88, 82}, {-116, -72}, {114, -98}, {-103, 33}, {59, 9}, {-144, 2}, {105, 18}, {-111, -40}, {55, 60}, {-20, -3}, {108, -30}, {71, 78}, {32, -1}, {-10, -29}, {59, 33}, {-130, 3}, {86, -22}, {-138, -11}, {-145, -70}, {58, -26}, {-23, 42}, {64, -53}, {141, 47}, {12, 111}, {60, 23}, {109, -82}, {-43, -117}, {97, 126}, {-83, 74}, {-136, 91}, {53, -71}, {-56, -2}, {-61, 106}, {128, -29}, {128, -39}, {70, 87}, {-92, -58}, {74, 117}, {148, -44}, {116, 27}, {89, 48}, {66, 8}, {-85, -58}, {-27, -96}, {118, -16}, {-115, -141}, {-150, -58}, {81, 106}, {138, -36}, {-149, -65}, {3, 10}, {-133, 9}, {6, 125}, {105, -139}, {117, 90}, {104, 108}, {144, 69}, {-95, -129}, {-113, 109}, {-130, -85}, {-29, 69}, {3, 30}, {-77, -130}, {-69, 9}, {124, 119}, {34, -29}, {41, -100}, {-49, -32}, {-106, -64}, {-136, -124}, {-124, -29}, {86, 141}, {80, -34}, {-24, -127}, {10, -52}, {-43, -16}, {-90, 149}, {42, 18}, {79, -123}, {-2, -92}, {-2, 88}, {67, -111}, {113, -11}, {56, 68}, {71, 87}, {-49, -61}, {120, -125}, {-57, 19}, {20, 120}, {-38, 148}, {131, -148}, {101, -23}, {-126, -149}, {-78, -88}, {144, -117}, {83, 128}, {117, 102}, {23, -29}, {123, -62}, {53, 86}, {-102, 7}, {-91, 139}, {-65, -126}, {127, 82}, {-89, -83}, {142, 137}, {-122, 83}, {82, -115}, {46, -82}, {-73, 67}, {-78, 110}, {-62, 131}, {-85, -15}, {-117, -50}, {-85, -138}, {-24, -114}, {93, -146}, {-28, 71}, {-17, 124}, {-31, 36}, {-101, 41}, {-52, 40}, {80, -114}, {-100, 29}, {-108, -137}, {-73, -67}, {100, -71}, {-100, 84}, {3, 106}, {10, -47}, {-4, 135}, {-107, 35}, {-12, 136}, {69, 35}, {106, 114}, {-84, -98}, {143, 28}, {-43, 97}, {-17, 108}, {5, 16}, {134, -106}, {139, -135}, {24, -31}, {134, 20}, {-105, 61}, {46, -31}, {-67, -21}, {87, 56}, {-88, -10}, {120, -108}, {-125, 59}, {73, 133}, {-62, -93}, {-31, -28}, {16, -100}, {115, -79}, {15, 87}, {-44, 63}, {20, 122}, {145, 54}, {-89, 22}, {-39, 88}, {-35, 95}, {-108, -138}, {124, -22}, {-13, -72}, {-141, 66}, {-22, -137}, {-109, 93}, {-76, -118}, {43, -79}, {61, -79}, {-97, -61}, {102, 96}, {-6, -97}, {-82, -1}, {-86, 109}, {124, 149}, {-1, -108}, {135, 41}, {77, -62}, {122, -22}, {145, -74}, {77, 33}, {97, -16}, {-94, 15}, {-124, -86}, {111, 58}, {88, -46}, {-136, 63}, {-138, 124}, {111, 39}, {117, 37}, {-74, -127}, {15, -53}, {35, -82}, {-68, 148}, {65, -48}, {-127, -4}, {-56, 139}, {-129, -107}, {-17, -98}, {72, 106}, {30, -54}, {117, 24}, {43, -74}, {-127, 8}, {-19, -108}, {-81, 88}, {-76, -94}, {-52, -30}, {107, -139}, {4, -51}, {43, 127}, {29, -3}, {-16, -143}, {78, -110}, {34, -26}, {-115, -40}, {17, 111}, {20, 134}, {85, -113}, {62, 120}, {70, -63}, {25, -47}, {142, 35}, {92, -101}, {119, -122}, {57, -19}, {117, 133}, {40, 102}, {-107, 1}, {123, -112}, {13, 73}, {6, -140}, {72, -20}, {-23, -39}, {35, 138}, {-120, 140}, {-92, -70}, {-114, 97}, {86, 121}, {76, 92}, {63, 49}, {123, 76}, {30, 112}, {41, -52}, {4, -58}, {-64, -78}, {-97, 149}, {61, 148}, {51, -108}, {70, -95}, {-35, 149}, {-28, 57}, {-108, -20}, {-79, 95}, {20, 9}, {-143, -134}, {71, -56}, {-13, -135}, {-98, -28}, {-64, -74}, {-30, 74}, {-88, -113}, {104, 12}, {-4, 89}, {-62, 71}, {-14, 105}, {26, 39}, {-75, 96}, {-20, 22}, {-33, 102}, {55, 50}, {-110, -86}, {43, -110}, {-117, 143}, {129, -93}, {-67, 108}})); //5
    }

    public int maxPoints(int[][] points) {

        if (points == null || points.length == 0) {
            return 0;
        }

        if (points.length == 1) {
            return 1;
        }

        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int a = 0;
                int b = 0;
                int ca = 0;
                String line = "";
                //y = ax + b
                // 计算 a 和 b
                int x1 = points[i][0];
                int y1 = points[i][1];

                int x2 = points[j][0];
                int y2 = points[j][1];

                if (x1 == x2 && y1 != y2) {
                    a = 1;
                    b = -x1;

                    ca = 0;
                } else if (y1 == y2 && x1 != y2) {

                    a = 0;
                    b = y1;

                    ca = 1;

                } else {
                    a = (y2 - y1);
                    b = (y1) * (x2 - x1) - a * x1;
                    ca = (x2 - x1);
                }
                line = a + ":" + b + ":" + ca;

                set.add(line);
            }
        }
        int res = 0;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            for (String line : set) {
                String[] strings = line.split(":");
                int a = Integer.parseInt(strings[0]);
                int b = Integer.parseInt(strings[1]);
                int ca = Integer.parseInt(strings[2]);

                if (y * ca == a * x + b) {
                    map.putIfAbsent(line, 0);
                    map.put(line, map.get(line) + 1);
                }
                res = Math.max(res, map.getOrDefault(line, 0));

            }
        }
        return res;
    }
}
