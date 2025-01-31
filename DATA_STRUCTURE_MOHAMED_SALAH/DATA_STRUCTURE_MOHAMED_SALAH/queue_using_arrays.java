package DATA_STRUCTURE_MOHAMED_SALAH;
// Java program to implement a queue using an array
class queue_using_arrays {
	static private int front, rear, capacity;
	static private double queue[];

	queue_using_arrays(int c)
	{
		front = rear = 0;
		capacity = c;
		queue = new double[capacity];
	}


	// function to insert an element
	// at the rear of the queue
	static void EnQueue(double data)
	{
		// check queue is full or not
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}

		// insert element at the rear
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	// function to delete an element
	// from the front of the queue
	static void DeQueue()
	{
		// if queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}

		// shift all the elements from index 2 till rear
		// to the right by one
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}

			// store 0 at rear indicating there's no element
			if (rear < capacity)
				queue[rear] = 0;

			// decrement rear
			rear--;
		}
		return;
	}

	// print queue elements
	static void queueDisplay()
	{
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}

		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %.2f <-- ", queue[i]);
		}
		return;
	}

	// print front of queue
	static void queueFront()
	{
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %.2f",
						queue[front]);
		return;
	}
}

