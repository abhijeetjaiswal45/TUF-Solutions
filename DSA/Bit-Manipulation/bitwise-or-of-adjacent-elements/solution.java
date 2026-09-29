class Solution {
    public List<Integer> orArray(List<Integer> A) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < A.size() - 1; i++) {
            answer.add(A.get(i) | A.get(i + 1));
        }
        return answer;
    }
}