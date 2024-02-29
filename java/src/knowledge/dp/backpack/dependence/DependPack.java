package knowledge.dp.backpack.dependence;

/**
 * @author wujingxinit@outlook.com
 * @date 2024/2/29 10:38
 */
public interface DependPack {

    /**
     * @param items items[0]表示物品费用v; items[1]表示物品价值w items[2]表示物品所属主件 q
     * @param m 背包容量 m
     * @param n 物品个数 n
     * */
    int backPack(int[][] items, int m, int n);
}
