class DynamicArray {
    int size;
    int capacity;
    int [] array;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        size = 0;
        array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(size >= capacity){
            resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {
        int popped = array[size -1];
        size--;
        return popped;
    }

    private void resize() {
        capacity = capacity * 2;
        int [] copy = new int[capacity];
        for(int i = 0; i < size;i++){
            copy[i] = array[i];
        }
        array = copy;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
