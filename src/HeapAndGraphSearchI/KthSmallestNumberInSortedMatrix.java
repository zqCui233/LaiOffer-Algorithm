package HeapAndGraphSearchI;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class KthSmallestNumberInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        PriorityQueue<Cell> pq = new PriorityQueue<>(k, new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                if (o1.value == o2.value) return 0;
                return o1.value < o2.value ? -1: 1;
            }
        });

        boolean[][] visited = new boolean[m][n];

        pq.offer(new Cell(0, 0, matrix[0][0]));
        visited[0][0] = true;

        for (int i = 0; i < k - 1; i++) {
            Cell cell = pq.poll();
            if (cell.x + 1 < m && !visited[cell.x + 1][cell.y]) {
                visited[cell.x + 1][cell.y] = true;
                pq.offer(new Cell(cell.x + 1, cell.y, matrix[cell.x + 1][cell.y]));
            }
            if (cell.y + 1 < n && !visited[cell.x][cell.y + 1]) {
                visited[cell.x][cell.y + 1] = true;
                pq.offer(new Cell(cell.x, cell.y + 1, matrix[cell.x][cell.y + 1]));
            }
        }

        return pq.peek().value;
    }

    class Cell {
        private int x;
        private int y;
        private int value;

        public Cell(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}
