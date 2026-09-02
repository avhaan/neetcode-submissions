class DynamicArray {
    private int capacity;
    private int[] arr;
    private int size;

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        } else {
            this.capacity = capacity;
            this.size = 0;
            arr = new int[capacity];
        }
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        if (i<= size) {
            arr[i] = n;
        }
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        } 
        arr[size] = n;
        size++;
    }

    public int popback() {
        int temp = arr[size - 1];
        size--;
        return temp;
    }

    private void resize() {
        int[] newarr = new int[capacity * 2];
        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        this.capacity = capacity * 2;
        this.arr = newarr;
    }

    public int getSize() {
        return size;
    }


    public int getCapacity() {
        return capacity;
    }
}
