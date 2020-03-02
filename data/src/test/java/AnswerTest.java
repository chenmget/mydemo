import com.DataApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
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
        int i = low;
        int j = high;
        int temp = arr[low];
        int k;
        while (i < j) {
            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = String.valueOf(nums[i]).length() % 2 == 0 ? ++sum : sum;
        }
        return sum;
    }

    public static int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<>();
        List<TreeNode> fix = new ArrayList<>();
        list.offer(root);
        int sum = 0;
        while (!list.isEmpty()) {
            root = list.poll();
            if (root.val % 2 == 0) {
                if (root.left != null) {
                    fix.add(root.left);
                }
                if (root.right != null) {
                    fix.add(root.right);
                }
            }
            if (root.left != null) {
                list.offer(root.left);
            }
            if (root.right != null) {
                list.offer(root.right);
            }
        }
        for (TreeNode node : fix) {
            if (node.right != null) {
                sum += node.right.val;
            }
            if (node.left != null) {
                sum += node.left.val;
            }
        }
        return sum;
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (String.valueOf(address.charAt(i)).equals(".")) {
                sb.append("[.]");
                continue;
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] pre = points[i];
            int[] next = points[i + 1];
            int max = Math.abs(next[0] - pre[0]) > Math.abs(next[1] - pre[1]) ? next[0] - pre[0] : next[1] - pre[1];
            sum += Math.abs(max);
        }
        return sum;
    }

    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2 + head.val;
            head = head.next;
        }
        return sum;
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int xMax[] = new int[x];
        int yMax[] = new int[x];
        for (int i = 0; i < x; i++) {
            int max = grid[i][0];
            for (int j = 1; j < x; j++) {
                max = grid[i][j] > max ? grid[i][j] : max;
            }
            xMax[i] = max;
        }
        for (int j = 0; j < y; j++) {
            int max = grid[0][j];
            for (int i = 1; i < x; i++) {
                max = grid[i][j] > max ? grid[i][j] : max;
            }
            yMax[j] = max;
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum += yMax[i] > xMax[j] ? xMax[j] : yMax[i];
                sum -= grid[i][j];
            }
        }
        return sum;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int max = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max]);
        root.left = construct(nums, l, max);
        root.right = construct(nums, max + 1, r);
        return root;
    }

    private int max(int[] nums, int l, int r) {
        int max = nums[l];
        int position = l;
        for (int i = l + 1; i < r; i++) {
            if (nums[i] > max) {
                max = nums[i];
                position = i;
            }
        }
        return position;
    }

    public static int maximum69Number(int num) {
        String str = String.valueOf(num);
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ('6' == str.charAt(i)) {
                array[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(array));
    }

    public int balancedStringSplit(String s) {
        int rst = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                sum++;
            } else {
                sum--;
            }
            if (sum == 0)
                rst += 1;
        }
        return rst;
    }

    public int[][] generateMatrix(int n) {
        int l = 0;
        int t = 0;
        int r = n - 1;
        int b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while (num < tar) {
            for (int i = l; i <= r; i++) {
                mat[t][i] = num;
                num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                mat[i][r] = num;
                num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                mat[b][i] = num;
                num++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                mat[i][l] = num;
                num++;
            }
            l++;

        }
        return mat;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return null;
    }

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            if ('(' == S.charAt(i)) {
                sum++;
            } else {
                sum--;
            }
            if (sum == 0) {
                sb.append(S.substring(start + 1, i - 1));
                start = i;
            }
        }
        return sb.toString();
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int rst = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.val >= L && node.val <= R) {
                    rst += node.val;
                }
                if (node.val < R) {
                    stack.push(node.right);
                }
                if (node.val > L) {
                    stack.push(node.left);
                }
            }
        }
        return rst;
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        quickSort1(deck, 0, deck.length - 1);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i : deck) {
            stack.push(i);
            Stack<Integer> rst = new Stack<Integer>();

        }
        return stack.stream().mapToInt(Integer::valueOf).toArray();
    }

    private static void quickSort1(int[] arr, int low, int right) {
        if (low > right) {
            return;
        }
        int temp = arr[low];
        int i = low;
        int j = right;
        int k;
        while (i < j) {
            while (arr[j] <= temp && i < j) {
                j--;
            }
            while (arr[i] >= temp && i < j) {
                i++;
            }
            if (i < j) {
                k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort1(arr, low, j - 1);
        quickSort1(arr, j + 1, right);
    }


    public static void main(String[] args) {
//        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{6,7,8,2,7,1,3,9,null,1,4,null,null,null,5}));
//        TreeNode treeNode = crateBinaryTree(inputList);
//        System.out.println(sumEvenGrandparent(treeNode));
        //System.out.println(maximum69Number(9699));
        int[] groupSizes = new int[]{17,13,11,2,3,5,7};
        deckRevealedIncreasing(groupSizes);
        //groupThePeople(groupSizes);
        //quickSort1(groupSizes, 0, groupSizes.length - 1);
        //quickSort(groupSizes, 0, groupSizes.length - 1);
        for (int i : groupSizes) {
            System.out.println(i);
        }
    }

}
