package arrays.in.myworks.sorting.bubblesort;

public class BubbleSort {

	String[] stringArray;

	public BubbleSort(String[] stringArray) {

		this.stringArray = stringArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public void bubbleSort() {
		for (int i = 0; i < stringArray.length - 1; i++)
			for (int j = 0; j < stringArray.length - (i + 1); j++) {
				if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
					String temp = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j + 1] = temp;
				}
			}
	}

	public void bubbleSort2() {
		int flag;
		for (int i = 0; i < stringArray.length - 1; i++) {
			flag = 0;
			for (int j = 0; j < stringArray.length - i - 1; j++) {
				if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
					String temp = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j + 1] = temp;
				}
				flag = 1;
			}

			if (flag == 0) {
				break;
			}
		}

	}
}
