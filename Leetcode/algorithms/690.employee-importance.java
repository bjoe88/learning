/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int[] reverseMapId = new int[2001];        
        for (int i = 0; i < employees.size(); i++) {
            reverseMapId[employees.get(i).id] = i;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        stack.push(id);
        while (!stack.isEmpty()) {
            int newId = stack.pop();
            Employee emp = employees.get(reverseMapId[newId]);
            sum += emp.importance;
            for (int i = 0; i < emp.subordinates.size(); i++) {
                stack.push(emp.subordinates.get(i));
            }
        }
        return sum;
    }
}
// @lc code=end
/*
 * 102/102 cases passed (4 ms)
 * Your runtime beats 96.78 % of java submissions
 * Your memory usage beats 67.69 % of java submissions (40.4 MB)
 */
