import com.DataApplication;
import com.line.MyTreeNode;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program: mydemo
 * @description:
 * @author: cm
 * @create: 2020-01-14 20:45
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataApplication.class)
public class AnswerTest {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }

        public String toString() {
            return "{val:" + val + "}";
        }
    }

    public static TreeNode crateBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data.intValue());
            node.left = crateBinaryTree(list);
            node.right = crateBinaryTree(list);
        }
        return node;
    }

    @Test
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            int j = nums[i];
            for (int k = 0; k < j; k++) {
                list.add(nums[i + 1]);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] rst = mat;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int minr = i - K;
                int maxr = i + K;
                int minc = j - K;
                int maxc = j + K;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8}));
//        TreeNode treeNode = crateBinaryTree(inputList);
//        System.out.println(deepestLeavesSum(treeNode));
        int[] groupSizes = new int[]{1, 4, 6, 3, 2, 5};
        //groupThePeople(groupSizes);
        quickSort(groupSizes, 0, groupSizes.length - 1);
        for (int i : groupSizes) {
            System.out.println(i);
        }
    }

    public static int deepestLeavesSum(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int sum = 0;
        while (!list.isEmpty()) {
            int temp = 0;
            List<TreeNode> tempList = new ArrayList<>();
            for (TreeNode node : list) {
                if (node == null) {
                    continue;
                }
                if (node.left != null) {
                    temp += node.left.val;
                    tempList.add(node.left);
                }
                if (node.right != null) {
                    temp += node.right.val;
                    tempList.add(node.right);
                }
            }
            if (temp != 0) {
                sum = temp;
                list = tempList;
            } else {
                break;
            }
        }
        return sum;
    }

    public int game(int[] guess, int[] answer) {
        int k = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                k++;
            }
        }
        return k;
    }

    public int numJewelsInStones(String J, String S) {
        char[] charj = J.toCharArray();
        char[] charS = S.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : charj) {
            set.add(c);
        }
        int rst = 0;
        for (char c : charS) {
            if (set.contains(c)) {
                rst++;
            }
        }
        return rst;
    }

    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            mul *= i;
            sum += i;
            n /= 10;
        }
        return mul - sum;
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<Map<Integer, List<Integer>>> list = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            boolean isExist = false;
            for (Map<Integer, List<Integer>> map : list) {
                List<Integer> temp = map.get(groupSizes[i]);
                if (temp != null && temp.size() < groupSizes[i]) {
                    temp.add(new Integer(i));
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                Map<Integer, List<Integer>> map = new HashMap<>();
                map.put(groupSizes[i], new ArrayList<>(Arrays.asList(i)));
                list.add(map);
            }
        }
        List<List<Integer>> rst = new ArrayList<>();
        for (Map<Integer, List<Integer>> map : list) {
            rst.addAll(map.values());
        }
        return rst;
    }

    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) {
            return false;
        }
        quickSort(nums, 0, nums.length - 1);
        for (int i : nums) {

        }
        return true;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int temp = arr[low];
        int i = low;
        int j = high;
        int t;
        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;

        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);

    }


}
