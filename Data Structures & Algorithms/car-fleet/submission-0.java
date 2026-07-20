class Solution {

   class Pair {
        int position;
        int speed;

        Pair(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        List<Pair> lp = new ArrayList<>();
        int n = position.length;
        for (int index = 0; index < n; index++) {
            lp.add(new Pair(position[index], speed[index]));
        }
        lp.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.position - o2.position;
            }
        });

        Stack<Double> st = new Stack<>();

        for (int index = n - 1; index >= 0; index--) {

            double timeToReach = (double) (target - lp.get(index).position) / lp.get(index).speed;

            if (st.isEmpty()) st.add(timeToReach);
            else if (timeToReach > st.peek()) st.add(timeToReach);


        }


        return st.size();

    }
}
